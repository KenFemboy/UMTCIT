package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    
    ArrayList<String> usernames = new ArrayList<>();

    void Login(){
        System.out.println("Enter Username");
        String user = input.nextLine();
        System.out.println("Enter Password");
        String pass = input.nextLine();


    }
}
