package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentMethods {
   
    private ArrayList<String> accounts;
    private ArrayList<String> accountpass;

    public PaymentMethods(){
        accounts = new ArrayList<>();

        accounts.add("Ivan Bryll");
        accounts.add("Charles Kent");
        accounts.add("Genevieve Herera");


        accountpass = new ArrayList<>();
        accountpass.add("ivan");
        accountpass.add("ken");
        accountpass.add("gene");

    }

    public boolean checkAccount(String username, String password){
        for (int i = 0; i < accounts.size(); i++) {
            if (username.equals(accounts.get(i)) && password.equals(accountpass.get(i))) {
                return true; 
            }
        }
        return false; 
        
    }

    
}
