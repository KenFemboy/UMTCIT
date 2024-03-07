package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentMethods {
   
    private ArrayList<String> accounts;
    private ArrayList<String> accountpass;
    private ArrayList<Double> cash;
    private ArrayList<Double> credit;


    public PaymentMethods(){
        accounts = new ArrayList<>();

        accounts.add("Ivan Bryll Joseco");
        accounts.add("Charles Kent");
        accounts.add("Ian Barrientos ");
        accounts.add("Gryxdane Maldo");
        accounts.add("Jericho Diezma");
        accounts.add("Kurt Iax Limos");
        accounts.add("Ismael Baguilar");
        accounts.add("Joven Rafael");
        accounts.add("Adie Saludares");




        accountpass = new ArrayList<>();
        accountpass.add("ivan");
        accountpass.add("ken");
        accountpass.add("ian");
        accountpass.add("gryx");
        accountpass.add("jeri");
        accountpass.add("kurt");
        accountpass.add("mael");
        accountpass.add("jove");
        accountpass.add("adie");

        cash= new ArrayList<>();

        cash.add(10000000000.0); //1
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);
        cash.add(10000000000.0);//10
        
        credit = new ArrayList<>();

        credit.add(100000000.0);//1
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);
        credit.add(100000000.0);//10





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
