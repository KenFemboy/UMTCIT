package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    
    void Option(){
       System.out.println("[1] Check Imports");
       System.out.println("[2] Check Balance");
       System.out.println("[3] Switch User");
    }
    
    
    void Login(){
        System.out.println("Enter Username");
        String user = input.nextLine();
        System.out.println("Enter Password");
        String pass = input.nextLine();
        

    }
}
