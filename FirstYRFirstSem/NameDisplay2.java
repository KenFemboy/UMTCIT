/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity5;

import java.util.Scanner;

/**
 *
 * @author 143847
 */
public class NameDisplay2 {
static void space(){
    System.out.print(" \n" );
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter your name; ");
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        System.out.println("Welcome to Barangay Election");
        space();
        System.out.print("How old are you " + name +" ? " );
        space();
        int age = scan.nextInt();
        String agerange;
        if(age <18){
            agerange = "still a minor";
        }
        else {
            agerange = " able to vote";
        }
        space();
        System.out.println("Hi "+ name +"\n"+ "You are " + age + " years old and you are " + agerange);
        space();
      
        System.out.print("Try again? = [Y/N]: ");
        char again = scan.next().toLowerCase().charAt(0);
        if(again == 'y' ){
            main(null);
        } 
        
    }
    
}
