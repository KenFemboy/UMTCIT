
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author 143847
 */
public class NameDisplay {
    static void space(){
    System.out.print(" \n" );
}
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter your name; ");
        space();
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        System.out.print("How old are you " + name +" ? " );
        space();
        int age = scan.nextInt();
        String agerange;
        if(age <18){
            agerange = "still a minor";
        }
        else {
            agerange = " officially an adult";
        }
        space();
        System.out.println("Hi "+ name +"\n"+ "You are " + age + " years old and you are " + agerange);
        space();
      
        System.out.println("Equivalent to " + age * 365 + " days ");
        space();
        
      
        
    }
    
}
