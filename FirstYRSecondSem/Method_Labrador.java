import java.util.Scanner;
public class Method_Labrador {
    static void restart(char selected){
        if (selected == 'y'){
            main(null);
        }
        else{
            System.exit(0);;
        }
        
    }
    static int AdditionMethod(int x, int y){
        return x+y;
    }
   
    static int SubtractionMethod(int x, int y){
        return x-y;
    }
    static int MultiplicationMethod(int x, int y){
        return x*y;
    }
    static int DivisionMethod(int x, int y){
        return x/y;
    }
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first num ");
    int num1 =input.nextInt();
    System.out.println("Enter second num ");
    int num2 =input.nextInt();

    System.out.println("Enter operator: ");
    System.out.println("[A] Addition ");
    System.out.println("[B] Subtraction ");
    System.out.println("[C] Multiplication ");
    System.out.println("[D] Division ");
    char selected = input.next().toLowerCase().charAt(0);

    switch (selected) {
        case 'a':
            int Sum = AdditionMethod(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 +" is " + Sum);
            break;
        
        case 'b':
        int Difference = SubtractionMethod(num1, num2);
        System.out.println("The Difference of " + num1 + " and " + num2 +" is " + Difference );
        break;

        case 'c':
        int Product = MultiplicationMethod(num1, num2);
        System.out.println("The Product of " + num1 + " and " + num2 +" is " + Product);
        break;

        case 'd':
        if (num2 == 0) {
            System.out.println("Cannot Divide by zero");
        }
        else{
        int Quotient = DivisionMethod(num1, num2);
        System.out.println("The Quotient of " + num1 + " and " + num2 +" is " + Quotient);
        }
        default:
        
            break;
    }
    System.out.println("Would you like to restart the program? [Y/N]");
    char tryagain = input.next().toLowerCase().charAt(0);
    restart(tryagain);


}
   
}
