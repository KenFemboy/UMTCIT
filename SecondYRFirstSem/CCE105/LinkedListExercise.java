import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> names = new LinkedList<String>();
        System.out.println("Enter name NO. " + 1);
        
        String ui = input.nextLine();
        
        while(ui != "done"){
            int i = 0;
            System.out.println("Enter name NO. " + (i+1));
            names.add(ui);
        }
       System.out.println(names);
    }
}
