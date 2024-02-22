import java.util.Scanner;
public class ArraySum {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Row");
        int row = input.nextInt();
        System.out.println("Input Column");
        int col = input.nextInt();
        int array[][] = new int[row][col];
        
        
        for(int i=0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
            System.out.println("Input num on row " + (i+1) + " Column " + (j+1));
            array[i][j] = input.nextInt();
            }
        }
    
        
      

     

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
    }
    System.out.println("The total sum of all variable is "+sum);
}
}
