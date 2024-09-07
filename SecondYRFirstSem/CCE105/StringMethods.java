import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String str = input.nextLine();

        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
            System.out.println(words[i].charAt(i));

        }
    }
}
