import java.util.*;

public class EncryptReverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String str = input.nextLine();

        
        String[] words = str.split(" ");

        int j = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            
            System.out.println(words[i]);
            String reverse = new StringBuilder(words[i]).reverse().toString();

            System.out.println(reverse.charAt(j));
            j++;
            
        }
    }
}