package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Cars cars = new Cars();
    PaymentMethods paymentMethods = new PaymentMethods();
    
    void returnMainMenu(){
        System.out.println("Would you like to return to the main menu?");
        System.out.println("Yes / No");

        char choice = input.next().toLowerCase().charAt(0);
        if(choice == 'y'){
            CarImport.main(null);
        }
       else{
            System.exit(0);
       }
    }

     
    void Option(){
       System.out.println("[1] Check Imports");
       System.out.println("[2] Check Balance");
       System.out.println("[3] Check Credit");
    }
    
    void cashBalance(String username, String password){
        if(paymentMethods.checkAccount(username, password)){
             paymentMethods.getBalanceCash(username);
           
        }
        else{
            System.out.println("Username and Password Error \n");
            Login();
        }
       
    }

    void CheckCashBalance(){
        System.out.print("Enter Username: ");
            String username = input.nextLine();
            input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            cashBalance(username, password);

            returnMainMenu();
            
    }


    void Login(){
        System.out.print("Enter Username: ");
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
        
        
        
        

    }
   



    void Purchase(){
        System.out.println("Select car to purchase: ");
        int purchasenum = input.nextInt();
        System.out.println("Are you sure to purchase \n" + cars.getBrand(purchasenum - 1)
                           +" \nModel: " + cars.getModel(purchasenum - 1 )
                            + "\n$ " +  cars.getPrice(purchasenum - 1) +"\n");
        System.out.println("Enter [ 1 ] to purchase / [ 2 ] to go back to car list ");
        int ans = input.nextInt();
        if(ans == 1){
            System.out.print("Enter Username: ");
            input.nextLine();
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            System.out.println("Enter payment method: [1] Cash [2] Credit");
            int cash_credit = input.nextInt();
            if(cash_credit == 1){
                cashBalance(username, password);
            }

        }
        
        else{
            cars.CheckImports();
        }
        
    }

    
}
