import java.util.*;
public class SortAlgo{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a Sorting Algorithm:");
        System.out.println("[1] Bubble Sort");
        System.out.println("[2] Selection Sort");
        System.out.println("[3] Insertion Sort");
        System.out.println("[4] Quick Sort");
        int choice = input.nextInt();

        switch(choice){
            case 1:
            BubbleSort();
            break;

            case 2:
            SelectionSort();
            break;

            case 3:
            
            break;

            case 4:
            
            break;

        }
    }

    public static void BubbleSort(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers to arrange:");
        String[] data = input.nextLine().split(" ");

        int n = data.length;
        int[] arr = new int[n];

        for(int k = 0; k < n; k++){
            arr[k] = Integer.parseInt(data[k]);
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temporary = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temporary;
                }
            }
        }
        
        
        for( int sortednum : arr){
            System.out.print(sortednum + " ");
        }
    }

    public static void SelectionSort(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers to arrange:");
        String[] data = input.nextLine().split(" ");
        
        int n = data.length;
        int[] arr = new int[n];

        for(int k = 0; k < n; k++){
            arr[k] = Integer.parseInt(data[k]);
        }
        

        for (int i = 0; i < n - 1 ; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                    
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        
    

        
        for(int output: arr){
        System.out.print(output + " ");
        }
    }
    }

        
    
