import java.util.Scanner;

public class CaesarCipher {
    
    // Method to encrypt a message
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Encrypt for uppercase letters
            if (Character.isUpperCase(c)) {
                char encryptedChar = (char)(((c - 'A' + shift) % 26) + 'A');
                result.append(encryptedChar);
            } 
            // Encrypt for lowercase letters
            else if (Character.isLowerCase(c)) {
                char encryptedChar = (char)(((c - 'a' + shift) % 26) + 'a');
                result.append(encryptedChar);
            } 
            // Non-alphabetic characters are not changed
            else {
                result.append(c);
            }
        }
        
        return result.toString();
    }

    // Method to decrypt a message
    public static String decrypt(String text, int shift) {
        // Decryption is the same as encryption with a negative shift
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a message to encrypt:");
        String message = sc.nextLine();
        
        System.out.println("Enter the shift key (1-25):");
        int shift = sc.nextInt();
        
        String encrypted = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encrypted);
        
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted Message: " + decrypted);
        
        sc.close();
    }
}
