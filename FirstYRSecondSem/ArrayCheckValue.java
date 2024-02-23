import java.util.Scanner;

public class ArrayCheckValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[] array = new int[rows];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter value for row " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            if (array[i] == num) {
                System.out.println(num + " is in the array.");
                
               
            }
else{ System.out.println(num + " is not in the array.");
}
        }

       
       
    }
}
