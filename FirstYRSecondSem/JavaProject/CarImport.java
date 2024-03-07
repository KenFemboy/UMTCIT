package JavaProject;

import java.util.Scanner;

public class CarImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Cars cars = new Cars();
        System.out.println("Welcome to Luxury Cars Import");
        
        
        
       menu.Option();
        
       int userinput = input.nextInt();
        switch (userinput) {
            case 1:
                cars.CheckImports();
                menu.Purchase();
                break;

            default:
            System.out.println("Invalid Input"+"\n");
            main(null);
                break;
        }
        


    }
}
