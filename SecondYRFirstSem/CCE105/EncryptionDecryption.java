import java.util.*;

public class EncryptionDecryption{
    public static final  String ALPHABET = "abcdefgijkmnopqrstuvwxyz";
    
    public static String EncryptData(String inputString, int shiftKey){
        inputString = inputString.toLowerCase();
        String encryptedString = "";
        for (int i = 0; i < inputString.length(); i++) {


            int characterposition =  ALPHABET.indexOf(inputString.charAt(i));
            
            int encryptPosition = ((shiftKey + characterposition) % 26);
            
            char encryptedCharacter = ALPHABET.charAt(encryptPosition);

            encryptedString += encryptedCharacter;
        }
        
        return encryptedString;
    }


    public static String DecryptData(String inputString, int shiftKey){
        inputString = inputString.toLowerCase();
        String decryptedData = "";
        for (int i = 0; i < inputString.length(); i++) {
            int characterposition = ALPHABET.indexOf(inputString.charAt(i));

            int decryptPosition = (characterposition - shiftKey) % 26;
            if(decryptPosition < 0){
                decryptPosition = ALPHABET.length() + decryptPosition;
            }
            char decryptedCharacter = ALPHABET.charAt(decryptPosition);

            decryptedData += decryptedCharacter;
        }
        return decryptedData;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string to encrypt: ");
        String word = input.nextLine();

        System.out.println("Enter shift key");
        int shift = Integer.parseInt(input.nextLine());
        
        
        System.out.println("Encrypt "+ EncryptData(word,shift));
        System.out.println("DECRYPT " +  DecryptData(word,shift));
        
        
    

    }
}