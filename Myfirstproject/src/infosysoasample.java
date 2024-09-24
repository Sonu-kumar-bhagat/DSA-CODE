public class infosysoasample {
    public static String getSmallestString(String S) {
        StringBuilder sb = new StringBuilder(S);

        // Keep track of whether any '10' was removed in this pass
        boolean removed;

        do {
            removed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '0') {
                    sb.deleteCharAt(i); // Remove the '1'
                    removed = true;
                    break; // Need to restart the loop after removal
                }
            }
        } while (removed);

        // Sort the string after removing all possible '10' pairs
        char[] result = sb.toString().toCharArray();
        java.util.Arrays.sort(result);

        return new String(result);
    }
    public static void main(String[] args) {
        System.out.println(getSmallestString("0000111111")); // Output: "0000111111"
        System.out.println(getSmallestString("1111111"));    // Output: "1111111"
        System.out.println(getSmallestString("110"));        // Output: "0"
    }
}
