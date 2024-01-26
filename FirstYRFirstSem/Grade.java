
package activity6;
import java.util.Scanner;
public class Grade {
static void print(String printResult){
    
    System.out.print("Your grade is " + printResult +"\n");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int grade; 
       
       
       System.out.print("Enter your grade: ");
       Scanner scan = new Scanner(System.in);
       grade = scan.nextInt();
       String result;
      
       // if results//
       if(grade >= 95){
       result = "Excellent";  
       print(result);
        }
       
       else if(grade >= 90 && grade <= 94){
        result = "Very good";
        print(result);
       }
       
       else if(grade >= 85 && grade <= 89){
        result = "Good";
        print(result);
       }
       
       else if(grade >= 80 && grade <= 84){
        result = "Fair";
        print(result);
       }
       
       else if(grade >= 75 && grade <= 79){
        result = "Poor";
        print(result);
       }
       
       else if(grade <= 74 && grade >= 51){
        result = "Failed";
        print(result);
       }
       
       else if(grade <= 50 || grade < 100){
           System.out.print("Input should be in the range of 51 to 100 only" + "\n");
           main(null);
       }
      
    }
    }
    

//kenfemboy loves you 