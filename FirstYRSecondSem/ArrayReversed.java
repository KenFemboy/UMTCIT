import java.util.Scanner;

public class ArrayReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Create an array of size 'rows'
        int[] array = new int[rows];

        // Populate the array with values based on the number of rows
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter value for row " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the values in reverse order
        System.out.println("Values in reverse order:");
        for (int i = rows - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        
    }
}
