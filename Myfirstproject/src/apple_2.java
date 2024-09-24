import java.util.Scanner;

public class apple_2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Input the number written on the board
        int num = scanner.nextInt();
        
        // Edge case: if num < 2, no prime numbers to print
        if (num < 2) {
            return;
        }

        // Create a boolean array to mark prime numbers
        boolean[] isPrime = new boolean[num + 1];
        
        // Initialize all entries as true, except index 0 and 1
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }
        
        // Implement the Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= num; p++) {
            // If isPrime[p] is still true, then p is a prime
            if (isPrime[p]) {
                // Mark all multiples of p as non-prime
                for (int multiple = p * p; multiple <= num; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        
        // Print all prime numbers in the range [2, num]
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
