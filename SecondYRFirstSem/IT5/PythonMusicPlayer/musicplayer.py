from tkinter import filedialog
import tkinter as tk
from tkinter import messagebox, simpledialog
import pygame
import os
import shutil
from tkinter import ttk
from tkinter import PhotoImage


class MP3Player:

    def __init__(self, root):
            self.root = root
            self.root.title("Bluetify")
            self.root.geometry("600x500")
            self.root.config(background="#1B5886")



            # Initialize pygame mixer
            pygame.mixer.init()

            # Top frame for buttons
            self.top_frame = tk.Frame(root)
            self.top_frame.pack(pady=30)
            self.top_frame.config(background="#1B5886")
            
            # Upload Music button
            self.upload_music_button = tk.Button(self.top_frame, text="Upload Music", fg="white", command=self.upload_music)
            self.upload_music_button.pack(side=tk.LEFT, padx=5)
            self.upload_music_button.config(background="#3776A1")

            # Reload Music button
            self.reload_music_button = tk.Button(self.top_frame, text="Home", fg="white", command=self.load_music)
            self.reload_music_button.pack(side=tk.LEFT, padx=5)
            self.reload_music_button.config(background="#3776A1")


            # Sort dropdown
            self.sort_option = tk.StringVar(value="Name")  # Default sort by Name
            self.sort_dropdown = ttk.Combobox(
                self.top_frame,
                textvariable=self.sort_option,
                values=["Name", "Date Added"],
                state="readonly",
                width=15
            )
            self.sort_dropdown.pack(side=tk.LEFT, padx=5)
            self.sort_dropdown.bind("<<ComboboxSelected>>", lambda e: self.load_music())  # Reload music on sort change


            # Create GUI elements
            self.now_playing_label = tk.Label(root, text="Now Playing: None", fg="white",width=100, font='Helvetica 10 bold')
            self.now_playing_label.pack(pady=5)
            self.now_playing_label.config(background="#1B5886")

            # Main frame to hold listboxes side by side
            self.main_frame = tk.Frame(root)
            self.main_frame.pack(pady=10)
            self.main_frame.config(background="#1B5886")

            # Playlists listbox
            self.playlist_listbox = tk.Listbox(self.main_frame, width=15, height=15,fg="white",font='Helvetica 8 bold')
            self.playlist_listbox.pack(side=tk.LEFT, padx=10)
            self.playlist_listbox.bind("<Double-1>", self.select_playlist)
            self.playlist_listbox.config(background="#3776A1")

            # Songs listbox
            self.song_listbox = tk.Listbox(self.main_frame, width=50, height=15, fg="white",font='Helvetica 8 bold')
            self.song_listbox.pack(side=tk.LEFT, padx=10)
            self.song_listbox.bind("<Double-1>")
            self.song_listbox.config(background="#3776A1")

            # Volume label
            self.volume_label = tk.Label(self.main_frame, text="Volume", fg="white", font='Helvetica 8 bold')
            self.volume_label.pack(pady=5)
            self.volume_label.config(background="#1B5886")

            # Volume slider
            self.volume_slider = tk.Scale(self.main_frame, from_=100, to=0, orient=tk.VERTICAL, command=self.set_volume, showvalue=False, length=150, width=8, background="#1B5886", troughcolor="#3776A1")
            self.volume_slider.set(50)  # Default volume
            self.volume_slider.pack(pady=30, padx=20)
            self.volume_slider.config(background="#3776A1")
            
            pygame.mixer.music.set_volume(0.5)  # Initialize with 50% volume
            
            #Slider
            self.slider_frame =tk.Frame(root)
            self.slider_frame.pack(pady=5)
            self.slider_frame.config(background="#1B5886")

            self.current_time_label = tk.Label(self.slider_frame, text="00:00")
            self.current_time_label.grid(row=0,column=0)
            self.position_slider = tk.Scale(self.slider_frame,from_=0, to=100, orient=tk.HORIZONTAL, length=300, command=self.seek, showvalue=False)
            self.position_slider.grid(row=0,column=1)
            self.total_time_label = tk.Label(self.slider_frame, text="00:00")
            self.total_time_label.grid(row=0,column=2)

            # Control buttons frame
            self.control_frame = tk.Frame(root)
            self.control_frame.pack(pady=5)
            self.control_frame.config(background="#1B5886")
            
            # Add Playlist button
            self.add_playlist_button = tk.Button(self.control_frame, text="Add Playlist", command=self.add_playlist,fg="white")
            self.add_playlist_button.pack(side=tk.LEFT, padx=5)
            self.add_playlist_button.config(background="#3776A1")

            # Delete Playlist button
            self.delete_playlist_button = tk.Button(self.control_frame, text="Delete Playlist", command=self.delete_playlist,fg="white")
            self.delete_playlist_button.pack(side=tk.LEFT, padx=5)
            self.delete_playlist_button.config(background="#3776A1")
            
            # Add to Playlist button
            self.add_to_playlist_button = tk.Button(self.control_frame, text="Add to Playlist", command=self.add_to_playlist,fg="white")
            self.add_to_playlist_button.pack(side=tk.LEFT, padx=5)
            self.add_to_playlist_button.config(background="#3776A1")

            #Delete Music
            self.delete_music_button = tk.Button(self.control_frame, text="Delete Music", command=self.delete_music,fg="white")
            self.delete_music_button.pack(side=tk.LEFT, padx=5)
            self.delete_music_button.config(background="#3776A1")
            
            self.play_button = tk.Button(self.control_frame, text="Play", command=self.toggle_play, state=tk.DISABLED,fg="white")
            self.play_button.pack(side=tk.LEFT)
            self.play_button.config(background="#3776A1")  # Adjust the placement as needed

            self.pause_button = tk.Button(self.control_frame, text="Pause", command=self.pause, state=tk.DISABLED,fg="white")
            self.pause_button.pack(side=tk.LEFT)
            self.pause_button.config(background="#3776A1")  # Adjust the placement as needed

            self.prev_button = tk.Button(self.control_frame, text="Previous", command=self.play_previous, state=tk.DISABLED,fg="white")
            self.prev_button.pack(side=tk.LEFT, padx=5)
            self.prev_button.config(background="#3776A1")

            self.next_button = tk.Button(self.control_frame, text="Next", command=self.play_next, state=tk.DISABLED,fg="white")
            self.next_button.pack(side=tk.LEFT, padx=5)
            self.next_button.config(background="#3776A1")

            

            

            self.file_list = []
            self.current_index = 0
            self.is_paused = False
            self.is_dragging = False
            self.start_time = 0

            self.position_slider.bind("<ButtonPress-1>", self.on_slider_press)
            self.position_slider.bind("<ButtonRelease-1>", self.on_slider_release)
            self.position_slider.config(command=self.seek)

            

            self.file_list = []
            self.current_index = 0
            self.is_paused = False
            self.is_dragging = False
            self.start_time = 0

            self.position_slider.bind("<ButtonPress-1>", self.on_slider_press)
            self.position_slider.bind("<ButtonRelease-1>", self.on_slider_release)
            self.position_slider.config(command=self.seek)

            # Load music files and playlists
            self.load_music()
            self.load_playlists()



    def update_slider(self):
        """Update the slider position based on the current playback time."""
        if pygame.mixer.music.get_busy() and not self.is_dragging:
            # Get the current playback position in seconds
            current_pos = self.start_time + (pygame.mixer.music.get_pos() / 1000)  # Adjust for seek position
            self.position_slider.set(current_pos)  # Update the slider position

            # Convert current position to MM:SS format
            minutes = int(current_pos) // 60
            seconds = int(current_pos) % 60
            time_string = f"{minutes:02}:{seconds:02}"

            # Update the current time label
            self.current_time_label.config(text=time_string)

        # Continue updating the slider every 100ms
        self.root.after(100, self.update_slider)

    def on_slider_press(self, event):
        """Called when the user starts dragging the slider."""
        self.is_dragging = True

    def on_slider_release(self, event):
        """Called when the user stops dragging the slider."""
        self.is_dragging = False
        new_position = self.position_slider.get()  # Get the new slider position
        self.start_time = new_position  # Track the new playback start time

        # Restart playback from the new position
        pygame.mixer.music.stop()
        pygame.mixer.music.play(start=new_position)

    def seek(self, value):
        """Handle seeking to a new position when slider is dragged."""
        if self.is_dragging:
            new_position = int(value)  # Convert slider position to seconds

            # Convert to MM:SS for the time label
            minutes = new_position // 60
            seconds = new_position % 60
            time_string = f"{minutes:02}:{seconds:02}"

            # Update the current time label during dragging
            self.current_time_label.config(text=time_string)


    def upload_music(self):
        music_dir = os.path.join(os.path.dirname(__file__), "music")
        if not os.path.exists(music_dir):
            os.makedirs(music_dir)

        files = filedialog.askopenfilenames(title="Select MP3 Files", filetypes=[("MP3 Files", "*.mp3")])
        if files:
            for file in files:
                try:
                    shutil.copy(file, music_dir)
                except Exception as e:
                    messagebox.showerror("Error", f"Could not copy file {file}: {e}")
            self.load_music()  # Refresh the music list
            messagebox.showinfo("Success", "MP3 files uploaded successfully!")


    def load_music(self):
        
        music_dir = os.path.join(os.path.dirname(__file__), "music")
        if not os.path.exists(music_dir):
            os.makedirs(music_dir)

        self.file_list = [os.path.join(music_dir, f) for f in os.listdir(music_dir) if f.lower().endswith(".mp3")]

        # Sort based on the selected option
        if self.sort_option.get() == "Date Added":
            self.file_list.sort(key=os.path.getmtime)  # Sort by last modified time
        elif self.sort_option.get() == "Name":
            self.file_list.sort(key=lambda x: os.path.basename(x).lower())  # Sort by name

        # Refresh the song listbox
        self.song_listbox.delete(0, tk.END)
        for file in self.file_list:
            file_name = os.path.basename(file).rsplit('.', 1)[0]  # Remove the file extension
            self.song_listbox.insert(tk.END, file_name)

        if self.file_list:
            self.now_playing_label.config(text="MP3 files loaded from music folder")
            self.play_button.config(state=tk.NORMAL)
            self.pause_button.config(state=tk.NORMAL)
            self.next_button.config(state=tk.NORMAL)
            self.prev_button.config(state=tk.NORMAL)
        else:
            
            self.play_button.config(state=tk.DISABLED)
            self.next_button.config(state=tk.DISABLED)
            self.prev_button.config(state=tk.DISABLED)


    def load_playlists(self):
        playlist_dir = os.path.join(os.path.dirname(__file__), "playlists")
        if not os.path.exists(playlist_dir):
            os.makedirs(playlist_dir)

        self.playlist_listbox.delete(0, tk.END)
        folders = [folder for folder in os.listdir(playlist_dir) if os.path.isdir(os.path.join(playlist_dir, folder))]
        for folder in folders:
            self.playlist_listbox.insert(tk.END, folder)
    
    def add_to_playlist(self):
        selection = self.song_listbox.curselection()
        if not selection:
            messagebox.showerror("Error", "Please select a song to add to a playlist.")
            return

        # Get the selected song
        selected_song = self.file_list[selection[0]]

        # Get list of playlists
        playlist_dir = os.path.join(os.path.dirname(__file__), "playlists")
        playlists = [folder for folder in os.listdir(playlist_dir) if os.path.isdir(os.path.join(playlist_dir, folder))]
        if not playlists:
            messagebox.showerror("Error", "No playlists available to add the song.")
            return

        # Display playlists in a selection window
        self.display_playlist_selection(playlists, selected_song, playlist_dir)

    def display_playlist_selection(self, playlists, selected_song, playlist_dir):
        def on_select():
            selected_index = playlist_listbox.curselection()
            if not selected_index:
                messagebox.showerror("Error", "Please select a playlist.")
                return

            playlist_name = playlists[selected_index[0]]
            playlist_path = os.path.join(playlist_dir, playlist_name)
            try:
                song_name = os.path.basename(selected_song)
                shutil.copy(selected_song, os.path.join(playlist_path, song_name))
                messagebox.showinfo("Success", f"Added '{song_name}' to playlist '{playlist_name}'.")
                selection_window.destroy()
            except Exception as e:
                messagebox.showerror("Error", f"Could not add song to playlist: {e}")

        # Create a Toplevel window for playlist selection
        selection_window = tk.Toplevel(self.root)
        selection_window.title("Select Playlist")

        tk.Label(selection_window, text="Available Playlists:").pack(pady=10)

        playlist_listbox = tk.Listbox(selection_window, selectmode=tk.SINGLE)
        for playlist in playlists:
            playlist_listbox.insert(tk.END, playlist)
        playlist_listbox.pack(padx=10, pady=10)

        tk.Button(selection_window, text="Select", command=on_select).pack(pady=10)    
    
    def delete_music(self):
        selection = self.song_listbox.curselection()
        if not selection:
            messagebox.showerror("Error", "Please select a song to delete.")
            return

        selected_file = self.file_list[selection[0]]
        confirm = messagebox.askyesno("Delete Music", f"Are you sure you want to delete '{os.path.basename(selected_file)}'?")
        if confirm:
            try:
                # Stop music if playing
                if pygame.mixer.music.get_busy():
                    pygame.mixer.music.stop()

                os.remove(selected_file)
                self.load_music()  # Refresh the music list
                self.load_folder(os.path.dirname(selected_file))  # Refresh the current playlist, if applicable
                messagebox.showinfo("Success", f"Deleted '{os.path.basename(selected_file)}'.")
            except Exception as e:
                messagebox.showerror("Error", f"Could not delete file: {e}")


    def add_playlist(self):
        playlist_dir = os.path.join(os.path.dirname(__file__), "playlists")
        if not os.path.exists(playlist_dir):
            os.makedirs(playlist_dir)

        playlist_name = simpledialog.askstring("Add Playlist", "Enter playlist name:")
        if playlist_name:
            new_folder_path = os.path.join(playlist_dir, playlist_name)
            try:
                os.makedirs(new_folder_path)
                self.load_playlists()
            except Exception as e:
                messagebox.showerror("Error", f"Could not create playlist: {e}")

    def delete_playlist(self):
        playlist_dir = os.path.join(os.path.dirname(__file__), "playlists")
        selection = self.playlist_listbox.curselection()
        if selection:
            selected_playlist = self.playlist_listbox.get(selection[0])
            playlist_path = os.path.join(playlist_dir, selected_playlist)
            confirm = messagebox.askyesno("Delete Playlist", f"Are you sure you want to delete the playlist '{selected_playlist}'?")
            if confirm:
                try:
                    shutil.rmtree(playlist_path)  # Only deletes empty directories
                    self.load_playlists()
                except Exception as e:
                    messagebox.showerror("Error", f"Could not delete playlist: {e}")
    
    def select_playlist(self, event):
        selection = self.playlist_listbox.curselection()
        if selection:
            selected_playlist = self.playlist_listbox.get(selection[0])
            playlist_path = os.path.join(os.path.dirname(__file__), "playlists", selected_playlist)
            self.load_folder(playlist_path)
        
            self.song_listbox.delete(0, tk.END)
            for file in self.file_list:               
                song_name = os.path.splitext(os.path.basename(file))[0]
                self.song_listbox.insert(tk.END, song_name)
        if self.file_list:
            self.play_button.config(state=tk.NORMAL)
            self.next_button.config(state=tk.NORMAL)
            self.prev_button.config(state=tk.NORMAL)
        else:
            self.play_button.config(state=tk.DISABLED)
            self.pause_button.config(state=tk.DISABLED)
            self.next_button.config(state=tk.DISABLED)
            self.prev_button.config(state=tk.DISABLED)
    
    def load_folder(self, folder_path):
                self.file_list = [os.path.join(folder_path, f) for f in os.listdir(folder_path) if f.lower().endswith(".mp3")]
                self.song_listbox.delete(0, tk.END)
                for file in self.file_list:
                    self.song_listbox.insert(tk.END, os.path.basename(file))
    
    def toggle_play(self):
        if self.file_list:
            try:
                # Check if a song is selected in the listbox
                selection = self.song_listbox.curselection()
                if selection:
                    self.current_index = selection[0]  # Update the current index to the selected song

                current_file = self.file_list[self.current_index]  # Get the selected file
                
                # Load and play the selected song
                pygame.mixer.music.load(current_file)
                pygame.mixer.music.play()
                pygame.mixer.music.set_endevent(pygame.USEREVENT)
                
                # Set the song length and update the slider range
                song_length = pygame.mixer.Sound(current_file).get_length()  # Get song length in seconds
                self.position_slider.config(to=int(song_length))  # Update slider range based on song length
                # Convert total song length to MM:SS format
                minutes = int(song_length) // 60
                seconds = int(song_length) % 60
                total_time_string = f"{minutes:02}:{seconds:02}"
            
                # Update the total time label
                self.total_time_label.config(text=total_time_string)
                self.position_slider.set(0)
                self.start_time = 0
                # Update the now playing label and set is_paused to False
                self.now_playing_label.config(text=f"Now Playing: {os.path.basename(current_file)}")
                self.is_paused = False
                
                # Start updating the slider based on the song's progress
                self.update_slider()

            except Exception as e:
                messagebox.showerror("Error", f"Could not play the file: {e}")
        else:
            messagebox.showwarning("Warning", "No music files available to play.")

    def pause(self):
        if pygame.mixer.music.get_busy():
            pygame.mixer.music.stop()
            self.is_paused = True
            self.now_playing_label.config(text="Playback Stopped")

    def play_next(self):
        if self.file_list:
            self.current_index = (self.current_index + 1) % len(self.file_list)
            self.play_audio()
            self.position_slider.set(0)  # Reset the slider to the start (0)
            self.toggle_play()  # Play the previous song

    def play_previous(self):
        if self.file_list:
            self.current_index = (self.current_index - 1) % len(self.file_list)
            self.play_audio()
            self.position_slider.set(0)  # Reset the slider to the start (0)
            self.toggle_play()  # Play the previous song

    def play_audio(self):
        try:
            current_file = self.file_list[self.current_index]
            pygame.mixer.music.load(current_file)
            pygame.mixer.music.play()
            pygame.mixer.music.set_endevent(pygame.USEREVENT)
            self.root.bind("<Enter>", self.check_end)
            self.now_playing_label.config(text=f"Now Playing: {os.path.basename(current_file)}")
            
            self.is_paused = False
            self.song_listbox.selection_clear(0, tk.END)
            self.song_listbox.selection_set(self.current_index)
            self.song_listbox.activate(self.current_index)
        except Exception as e:
            messagebox.showerror("Error", f"Could not play the file: {e}")

    def select_song(self, event):
        selection = self.song_listbox.curselection()
        if selection:
            self.current_index = selection[0]
            self.play_audio()
    
    def check_end(self, event):
        if not pygame.mixer.music.get_busy() and not self.is_paused:
            self.current_index += 1
            if self.current_index < len(self.file_list):
                self.play_audio()
            else:
                self.current_index = 0
                self.now_playing_label.config(text="Now Playing: None")
                
    def set_volume(self, volume):
        pygame.mixer.music.set_volume(int(volume) / 100)


root = tk.Tk()
icon = PhotoImage(file='icon/logo.png')
root.iconphoto(False, icon)
app = MP3Player(root)
root.mainloop()
