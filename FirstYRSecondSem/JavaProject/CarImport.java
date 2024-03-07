package JavaProject;

import java.util.Scanner;

public class CarImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Cars cars = new Cars();
        PaymentMethods paymentMethods = new PaymentMethods();
        System.out.println("Welcome to Luxury Cars Import");
        System.out.println("Please login with your account");

        System.out.println("Enter Username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        
        if(paymentMethods.checkAccount(username, password) == false){
            System.out.println("Input Error \n");
            main(null);
        }
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
