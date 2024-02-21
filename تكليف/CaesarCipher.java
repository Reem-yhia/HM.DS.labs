
    import java.util.HashMap;
import java.util.Map;

    public class CaesarCipher {
        private static final int SHIFT = 3; // المفتاح لتحويل التشفير

        public static void main(String[] args) {
            // تجهيز الأبجدية اليونانية
            String greekAlphabet = "αβγδεζηθικλμνξοπρστυφχψω";
            Map<Character, Character> encryptionMap = createEncryptionMap(greekAlphabet);

            // النص الأصلي
            String originalMessage = "γεια σας";

            // تشفير النص
            String encryptedMessage = encryptMessage(originalMessage, encryptionMap);

            // طباعة النص المشفر
            System.out.println("النص المشفر: " + encryptedMessage);
        }

        private static Map<Character, Character> createEncryptionMap(String alphabet) {
            Map<Character, Character> encryptionMap = new HashMap<>();
            int length = alphabet.length();

            for (int i = 0; i < length; i++) {
                char originalChar = alphabet.charAt(i);
                char encryptedChar = alphabet.charAt((i + SHIFT) % length);
                encryptionMap.put(originalChar, encryptedChar);
            }

            return encryptionMap;
        }

        private static String encryptMessage(String message, Map<Character, Character> encryptionMap) {
            StringBuilder encryptedMessage = new StringBuilder();

            for (char c : message.toCharArray()) {
                char encryptedChar = encryptionMap.getOrDefault(c, c);
                encryptedMessage.append(encryptedChar);
            }

            return encryptedMessage.toString();
        }
    }

