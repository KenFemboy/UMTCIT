package JavaProject;

import java.util.Scanner;

public class CarImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Welcome to Luxury Cars Import");
        
        //menu.Login();
        
       System.out.println("[1] Check Imports");
       System.out.println("[2] Check Balance");
       System.out.println("[3] Check Switch User");
        int userinput = input.nextInt();
        switch (userinput) {
            case 1:
                menu.CheckImports();
                break;
        
            default:
            System.out.println("Invalid Input"+"\n");
            main(null);
                break;
        }
        


    }
}
