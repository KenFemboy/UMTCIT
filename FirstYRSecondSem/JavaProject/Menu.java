package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    
    Cars[] cars = new Cars[3];
    public Menu(){
    cars[0] = new Cars("Toyota", "Camry", 25000.0);
    cars[1] = new Cars("Honda", "Civic", 22000.0);
    cars[2] = new Cars("Ford", "Mustang", 35000.0);
}
    
    void CheckImports(){
        System.out.println("Here are the available imports:");
        for(int i = 0; i < cars.length; i++){
            System.out.println("Car " + (i+1) + ":");
            System.out.println("Make: " + cars[i].getBrand());
            System.out.println("Model: " + cars[i].getModel());
            System.out.println("Price: $" + cars[i].getPrice());
            System.out.println();
        }
    }  
    
    
    void Login(){
        System.out.println("Enter Username");
        String user = input.nextLine();
        System.out.println("Enter Password");
        String pass = input.nextLine();
        

    }
}
