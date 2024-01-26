

import java.util.Scanner;

public class Scical {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int firstnum, secondnum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        firstnum = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        secondnum = scan.nextInt();
        
        double sum, difference, product, qoutient, average;
        sum = firstnum + secondnum;
        difference = firstnum - secondnum;
        product = firstnum * secondnum;
        qoutient = firstnum / secondnum;
        average = (firstnum + secondnum) / 2;
        
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: "+ product);
        System.out.println("The qoutient is: "+ qoutient);
        System.out.println("the average is: " + average);
        
    }
    
}
