/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaken;

import javax.swing.JOptionPane;

/**
 *
 * @author 143847
 */
public class JavaKEN {

    /**
     * @param args the command line arguments
     */
    static void asterisk(){
        int a = 1;
        int b = 28;
        while(a < b){
            System.out.print("*");
            a++;
        }
        System.out.println("");
        }
    
    
    public static void main(String[] args) {
        String name, yearlvl, course, birthdate, status,address, contactnum, space;
        name = "Charles Kent Labrador";
        yearlvl = "1st Year";
        course = "BSIT";
        birthdate = "March 15, 2005";
        status = "Single";
        address = "Purok 5 San Miguel ";
        contactnum = "098859926321";
        space = "*  ";
        
        
        asterisk();
        System.out.println(space + name + "  *");
        System.out.println(space + yearlvl + "               *");
        System.out.println(space + course+ "                   *");
        System.out.println(space + birthdate+ "         *");
        System.out.println(space + status+ "                 *");
        System.out.println(space + address+ "    *");
        System.out.println(space + contactnum+ "           *");
        asterisk();
        
        
        
        

       
    }
    
}
