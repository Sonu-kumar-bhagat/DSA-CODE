public class strint0num {
    
    public class StringToNumberConverter {
        public static void main(String[] args) {
            String input = "12345"; // Example input string
            int number = convertStringToNumber(input);
            if (number != Integer.MIN_VALUE) {
                System.out.println("The converted number is: " + number);
            } else {
                System.out.println("Invalid Input");
            }
        }
    
        public static int convertStringToNumber(String str) {
            int num = 0;
            boolean isNegative = false;
            int i = 0;
    
            // Check for negative sign
            if (str.charAt(0) == '-') {
                isNegative = true;
                i = 1;
            }
    
            // Convert each character to a digit
            while (i < str.length()) {
                char digit = str.charAt(i);
                if (digit < '0' || digit > '9') {
                    // Invalid character found, return Integer.MIN_VALUE to indicate error
                    return Integer.MIN_VALUE;
                }
                num = num * 10 + (digit - '0');
                i++;
            }
    
            // If the number is negative, negate it
            if (isNegative) {
                num = -num;
            }
    
            return num;
        }
    }
}
