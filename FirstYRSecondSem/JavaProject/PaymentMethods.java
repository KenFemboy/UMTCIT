package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentMethods {
   private double balance;
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
        accountpass.add("joven");
        accountpass.add("adie");

        cash= new ArrayList<>();

        cash.add(237420.0); //1
        cash.add(700000.0);
        cash.add(803920.0);
        cash.add(8923000.0);
        cash.add(1683200.0);
        cash.add(9820.0);
        cash.add(1000000.0);
        cash.add(7892300.0);
        cash.add(5000.0);
        cash.add(700.0);//10
        
        credit = new ArrayList<>();

        credit.add(1000000.0);//1
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);
        credit.add(1000000.0);//10





    }

    public boolean checkAccount(String username, String password){
        for (int i = 0; i < accounts.size(); i++) {
            if (username.equals(accounts.get(i)) && password.equals(accountpass.get(i))) {
                return true; 
            }
        }
        return false; 
        
    }

    public double getBalanceCash(String username){
        if(accounts.contains(username) == true){
            int index = accounts.indexOf(username);
            balance = cash.get(index);
        }
        
        return balance;
    }
    
    public double getBalanceCredit(String username){
        if(accounts.contains(username) == true){
            int index = accounts.indexOf(username);
            balance = credit.get(index);
        }
        
        return balance;
    }

    public boolean canAfford(double cash, double payment){
        if(cash > payment){
            return false;
        }
        else{
            return true;
        }
    }
    
}
