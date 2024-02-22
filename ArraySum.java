import java.util.Scanner;
public class ArraySum {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Row");
        int row = input.nextInt();
        System.out.println("Input Column");
        int col = input.nextInt();
        int array[][] = new int[row][col];
        
        
        
        System.out.println("Input num 1");
        array[0][0] = input.nextInt();

        System.out.println("Input num 2");
        array[0][1] = input.nextInt();
        
        System.out.println("Input num 3");
        array[1][0] = input.nextInt();
        
        System.out.println("Input num 4");
        array[1][1] = input.nextInt();
        
      

     

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
    }
    System.out.println(sum);
}
}
