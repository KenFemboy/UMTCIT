package JavaProject;

import java.util.Scanner;

public class CarImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Cars cars = new Cars();
        PaymentMethods paymentMethods = new PaymentMethods();
        System.out.println("Welcome to Luxury Cars Import \n");


        System.out.println("Please login with your account");

        menu.Login();
        menu.Option();
        
       int userinput = input.nextInt();
        switch (userinput) {
            case 1:
                cars.CheckImports();
                menu.Purchase();
                break;
            case 2:

                break;

            case 3:
                menu.Login();
                
                break;
            default:
            System.out.println("Invalid Input"+"\n");
            main(null);
                break;
        }
        


    }
}
