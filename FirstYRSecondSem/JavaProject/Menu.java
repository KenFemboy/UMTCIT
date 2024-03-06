package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Cars car = new Cars();
   
    void Login(){
        System.out.println("Enter Username");
        String user = input.nextLine();
        System.out.println("Enter Password");
        String pass = input.nextLine();


    }

    void CheckImports(){
        System.out.println("Here are the available imports:");
        car.showCarCollection();
    }
}
