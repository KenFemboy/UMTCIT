

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author 143847
 */
public class ComputeArea {
    public static void main(String[] args){
        double radius,area;
  
        
        System.out.print("Enter a circle's radius: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = (Math.pow(radius, 2) )* Math.PI;
//        JOptionPane.showMessageDialog(null, "The area for the circle of radius "+ radius +" is " + area);
        System.out.println("The area for the circle of radius "+ radius +" is " + area);
    }
}
