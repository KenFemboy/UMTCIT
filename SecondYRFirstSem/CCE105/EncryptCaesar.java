import java.util.*;
public class EncryptCaesar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter message to encrypt");
        String message = input.nextLine();

        System.out.println("Enter Shift Value");
        int shift = input.nextInt();

        String encryptedText = encrypt(message,shift);

        System.out.println("Encrypted Message: " + encryptedText);
    }
    public static String encrypt(String messageEncrypt, int shift){
        StringBuilder result = new StringBuilder();
        shift = shift % 26;

        for(char i: messageEncrypt.toCharArray()){
           if (Character.isLetter(i)){
               char base = Character.isUpperCase(i) ? 'A' : 'a';

               char shifted = (char)((i - base + shift + 26)% 26 + base);
               result.append(shifted);
           }
           else{
               result.append(i);
           }
           
        }
       return result.toString();

   }
}
