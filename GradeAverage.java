import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] grade = new int[4];

        System.out.println("Calcute Grade average");   
        System.out.println("Enter first grade");
        grade[0] = input.nextInt();
        System.out.println("Enter second grade");
        grade[1] = input.nextInt();

        System.out.println("Enter third grade");
        grade[2] = input.nextInt();

        System.out.println("Enter fourth grade");
        grade[3] = input.nextInt();
        int totalgrade = 0;
        for(int i = 0; i < grade.length; i++){
           
             totalgrade = totalgrade + grade[i] ;

        }
        int averagegrade = (totalgrade) / grade.length; 
        System.out.println("Your average grade is " + averagegrade);
        
        

    }
}
