import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //143847 Charles Kent Labrador
        System.out.println("Enter String: ");
        String sentence = input.nextLine();

        //variables 
        String[] words = sentence.split(" ");
        int row, column;
        row = 3;
        column = words.length * 2;
        int wordoutput = words.length - 1;
       
        //column loop
        for(int h = 0; h <= column; h++){
            //check kung odd or even
            if (h % 2 ==1) {                       
                        System.out.println(words[wordoutput]);
                        wordoutput--;
                        continue;
            }
            //print sa asterisks
            for(int i = 0; i < (row + (h * 3)); i++){
                //print & kung lapas 9
                if(i >= 9 && i >= row + (h * 3) - 2 ){
                    System.out.print("&");;
                }
                else{
                System.out.print("*");
            }
            }
            System.out.println();
        }
        //stop program
        System.exit(0);
        
    }
}
