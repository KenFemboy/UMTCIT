package JavaProject;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Cars cars = new Cars();
   
    PaymentMethods paymentMethods = new PaymentMethods();
    void returnMainMenu(){
        System.out.println("------------------------------------------");
        System.out.println("Would you like to return to the main menu?");
        System.out.println("Yes / No");

        char choice = input.next().toLowerCase().charAt(0);
        if(choice == 'y'){
            CarImport.main(null);
        }
       if (choice =='n') {
        System.exit(0);
       }
       else{
            System.out.println("Invalid Input");
            returnMainMenu();
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
            
        }
       
    }
    
    void creditBalance(String username, String password){
        if(paymentMethods.checkAccount(username, password)){
             paymentMethods.getBalanceCredit(username);
           
        }
        else{
            System.out.println("Username and Password Error \n");
            
        }
       
    }

    void CheckCashBalance(){
        System.out.print("Enter Username: ");
        String username = input.nextLine();
        input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();
        if(paymentMethods.checkAccount(username, password) == false){
            System.out.println("Incorrect Username and Password");
              
        }
        else{
            System.out.println(username +"'s current cash balance is " + paymentMethods.getBalanceCash(username));
            returnMainMenu();
        }

            returnMainMenu();
            
    }
    void CheckCreditBalance(){
        System.out.print("Enter Username: ");
            String username = input.nextLine();
            input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            if(paymentMethods.checkAccount(username, password) == false){
                System.out.println("Incorrect Username and Password");
                  
            }
            else{
                System.out.println(username +"'s current credit balance is " + paymentMethods.getBalanceCash(username));
                returnMainMenu();
            }
            

            returnMainMenu();
            
    }


    void Purchase(){
        System.out.println("Select car to purchase: ");
        int purchasenum = input.nextInt();
        System.out.println("Are you sure to purchase \n" + cars.getBrand(purchasenum - 1)
                           +" \nModel: " + cars.getModel(purchasenum - 1 )
                            + "\nPrice: $" +  cars.getPrice(purchasenum - 1) +"\n");
        System.out.println("Enter [ 1 ] to purchase / [ 2 ] to go back to car list ");
        int ans = input.nextInt();
        if(ans == 1){
            System.out.print("Enter Username: ");
            input.nextLine();
            String username = input.nextLine();
            System.out.print("Enter Password: ");
            String password = input.nextLine();
            if(paymentMethods.checkAccount(username, password) == false){
                System.out.println("Incorrect Username and Password");
                Purchase();   
            }


            System.out.println("-----------\n Enter payment method: [1] Cash [2] Credit");
            int cash_credit = input.nextInt();
            
                if(cash_credit == 1){
                System.out.println("Welcome " + username + " Your balance is " + paymentMethods.getBalanceCash(username));
                double tax = cars.getPrice(purchasenum - 1) * 0.30;
                double total = (cars.getPrice(purchasenum - 1) + tax);
                System.out.println("\nInvoice \n --------- \n Price: " + cars.getPrice(purchasenum - 1)+ "\n Tax: " + tax + "\n");
                System.out.println("-------------\n Total: " + total );
                System.out.println(paymentMethods.getBalanceCash(username) + " will be deducted " + total);
                if(paymentMethods.canAfford(paymentMethods.getBalanceCash(username), total) == false){
                    System.out.println(username + "'s account has insuficient cash for this purchase. Please try again\n-------------------------------");
                    Purchase();
                }
                System.out.print("\n Type Yes to confirm:");
                

                char confirm = input.next().toLowerCase().charAt(0);
                
                if(confirm == 'y'){
                    System.out.println("Order confirmed: \n ---------------------");
                    System.out.println( cars.getBrand(purchasenum - 1) +" " + cars.getModel(purchasenum - 1 ) + "is now being delivered");
                    double newBalance = paymentMethods.getBalanceCash(username) - total;
                    System.out.println(username + "'s new cash balance is $" + newBalance);
                   
                    returnMainMenu();
                }
            }
                 if (cash_credit == 2) {
                
            
                System.out.println("Welcome " + username + " Your balance is " + paymentMethods.getBalanceCredit(username));
                double tax = cars.getPrice(purchasenum - 1) * 0.30;
                double total = (cars.getPrice(purchasenum - 1) + tax);
                System.out.println("Invoice \n --------- \n Price: " + cars.getPrice(purchasenum - 1)+ "\n Tax: " + tax + "\n");
                System.out.println("-------------\n Total: " + total );
                System.out.println(paymentMethods.getBalanceCredit(username) + " will be deducted " + total);
                System.out.print("\n Type Yes to confirm:");
                char confirm = input.next().toLowerCase().charAt(0);
                
                if(confirm == 'y'){
                    System.out.println("Order confirmed: \n ---------------------");
                    System.out.println( cars.getBrand(purchasenum - 1) +" " + cars.getModel(purchasenum - 1 ) + " is now being delivered\n--------------");
                    double newBalance = paymentMethods.getBalanceCredit(username) - total;
                    System.out.println(username + "'s new credit balance is $" + newBalance);
                   
                    returnMainMenu();
                }
            }
                    else{
                        System.out.println("Input Invalid Try again");
                        Purchase();
            }
            }
                else{
                Purchase();
                }
        }
        
       
        
    }

    

