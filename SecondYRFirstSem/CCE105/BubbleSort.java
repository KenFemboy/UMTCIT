import java.util.*;
public class BubbleSort{
    public static void BubbleSort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temporary = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temporary;
                }
            }
           
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter input:  ");
        
        

        
        String[] tokens = input.nextLine().split(" ");

        
        int n = tokens.length;
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

       
        
        BubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int j = n - 1; j >= 0; j--) {
            
            if (j % 2 == 1) {
                System.out.print(arr[j]);
                for (int i = 0; i < arr[j]; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print(arr[j]);
                System.out.println();
            }
        }

    }
}