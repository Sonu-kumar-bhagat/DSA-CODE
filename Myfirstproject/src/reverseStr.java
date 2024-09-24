public class reverseStr {
    public class aa {
        public static String reverseWords(String input) {
            // Split the input string into words
            String[] words = input.split(" ");
            StringBuilder reversedString = new StringBuilder();
    
            // Reverse each word and append it to the reversedString
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversedString.append(reversedWord).append(" ");
            }
    
            // Remove the trailing space and return the reversedString
            return reversedString.toString().trim();
        }
    
        public static void main(String[] args) {
            String input = "I Love My India";
            String output = reverseWords(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }
    }
}
