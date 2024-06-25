public class CaesarCipher {
    public static String caesarCipher(String message, int key, int option) {
        // message: The text message you want to encrypt or decrypt.
        // key: The encryption or decryption key (the number of letters you want to shift the message by).
        // option: 1 for encryption and -1 for decryption.0.21
        
        // Convert the message to lowercase:
        message = message.toLowerCase();
        
        // Create a StringBuilder to hold the encrypted message
        StringBuilder encryptedMessage = new StringBuilder();
        
        // Loop to encrypt or decrypt each character in the message
        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            
            // If the character is a letter, shift it; otherwise, leave it as it is
            if (Character.isLetter(character)) {
                // Shift the letter based on the encryption or decryption option
                char shiftedChar = (char) ((character - 'a' + option * key + 26) % 26 + 'a');
                encryptedMessage.append(shiftedChar);
            } else {
                encryptedMessage.append(character);
            }
        }
        
        return encryptedMessage.toString();
    }
    
    public static void main(String[] args) {
        // Example for encrypting the message "Hello World!" with a key of 3
        String message = "Hello World!";
        int key = 3;
        String encryptedMessage = caesarCipher(message, key, 1);
        System.out.println("Encrypted Message: " + encryptedMessage);
        
        // Example for decrypting the encrypted message with a key of 3
        String encryptedMessage2 = "khoor zruog!";
        int key2 = 3;
        String decryptedMessage = caesarCipher(encryptedMessage2, key2, -1);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}
