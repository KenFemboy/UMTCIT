import java.util.*;
public class Array {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number of row: ");
    int row = scan.nextInt();
    System.out.println("Enter Number of column");
    int column = scan.nextInt();


   int[][] array = new int[row][column];

    for(int i = 0; i < row; i++){
        for(int j =0; j < column; j++){
        System.out.println("Enter num: " + (i+1) + " Column: " + (j+0));
        array[i][j] = scan.nextInt();
    }
}

    for(int i = 0; i < array.length; i++){
        for(int j =0; j < column; j++){
        System.out.println("\n "+array[i][j]);
    }   
}
    }
}
