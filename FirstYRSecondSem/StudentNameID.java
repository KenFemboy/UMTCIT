import java.util.*;
public class StudentNameID{


   
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[][] student = {
        {"Ken Labrador","143847"}, 
        {"Ismael Baguilar", "145675"}, 
        {"Ian Barrientos", "190243"}, 
        {"Ivan Bryll","124643"}, 
       { "Joven Rafael","190423"},
       {"Kurt Ayax", "159234"}, 
       {"Gryxdane Maldo","173823"},  
       {"Jericho Diezma", "174823"},
       {"Emmanuel Saludares", "129413"},
       {"Kelly Serina", "184739"},
        {"Lebron James","174283"}
    };
   




    System.out.println("Select one \n[1]Student ID \n[2]Name\n[3]ID and Names");
    int choice = input.nextInt();
    


    if(choice == 1){
       System.out.println("Student ID's ");
       for(String[] studentname: student){
           
            System.out.println(studentname[1]+ "\n");
       }
    }
    if(choice == 2){
        System.out.println("Student names ");
       for(String[] studentname: student){
           
            System.out.println(studentname[0]+ "\n");
       }
    }
    if (choice == 3) {
        System.out.println("Student names and id ");
       for(String[] studentname: student){
           for(String studentid : studentname){
            System.out.println(studentid);
           }
           System.out.println("");
       }
    }
    
    
    


}
}