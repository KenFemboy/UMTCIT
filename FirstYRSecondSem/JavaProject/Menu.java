package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Cars cars = new Cars();
    PaymentMethods paymentMethods = new PaymentMethods();


    void Option(){
       System.out.println("[1] Check Imports");
       System.out.println("[2] Check Balance");
       System.out.println("[3] Switch User");
    }
    
    
    void Login(){
        System.out.println("Enter Username: ");
        String username = input.nextLine();
        System.out.println("Enter Password: ");
        String password = input.nextLine();

        
        if(paymentMethods.checkAccount(username, password) == false){
            System.out.println("Input Error \n");
            Login();
        }
        

    }

    void Purchase(){
        System.out.println("Select car to purchase: ");
        int purchasenum = input.nextInt();
        System.out.println("Are you sure to purchase \n" + cars.getBrand(purchasenum - 1)
                           +" \nModel: " + cars.getModel(purchasenum - 1 )
                            + "\n$ " +  cars.getPrice(purchasenum - 1) +"\n");
        System.out.println("Enter [ Yes ] to purchase / [ No ] to go back to car list");
        String ans = input.nextLine();
        if(ans == "Yes"){
            
        }
        else{
            cars.CheckImports();
        }

        
    }
}
