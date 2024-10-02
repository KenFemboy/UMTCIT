import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sequence{
    
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

        public static void findAndPrintLongestConsecutiveSequence(int[] nums) {
            if (nums == null || nums.length == 0) {
                System.out.println("No sequence found.");
                return;
            }
    
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
    
            int longestStreak = 0;
            int startOfLongest = 0;
    
            for (int num : nums) {
                
                if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;
    
                    
                    while (set.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }
    
                    
                    if (currentStreak > longestStreak) {
                        longestStreak = currentStreak;
                        startOfLongest = num;
                    }
                }
            }
    
            
            System.out.println("Longest consecutive sequence length: " + longestStreak);
            System.out.print("The sequence is: ");
            for (int i = 0; i < longestStreak; i++) {
                System.out.print((startOfLongest + i) + " ");
            }
            System.out.println();
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
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        findAndPrintLongestConsecutiveSequence(arr);

    }
}