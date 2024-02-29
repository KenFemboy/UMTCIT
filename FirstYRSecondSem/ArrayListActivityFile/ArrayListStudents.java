
import java.util.*;


public class ArrayListStudents {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        students.add("Ken Labrador");
        students.add("Albert Einstein");
        students.add("Mike Tyson");
        students.add("Elon Musk");
        students.add("Muhammad Ali");
        students.add("Vin Diesel");


        System.out.println("Enter name: ");
        String name = input.nextLine();
        if(students.contains(name)){
            System.out.println(name + " is in the student list");
        }
        else{
            System.out.println(name + " does not exist in the list");
        }

        
    }
}
