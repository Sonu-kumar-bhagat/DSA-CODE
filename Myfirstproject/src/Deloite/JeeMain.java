import java.util.Scanner;

public class JeeMain {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Read the number of visiting students
        int N = sc.nextInt();

        // Read the array of ranks
        int[] ranks = new int[N];
        for (int i = 0; i < N; i++) {
            ranks[i] = sc.nextInt();
        }

        System.out.println(countCuts(ranks));
    }

    public static int countCuts(int[] ranks) {
        // Initialize the lowest rank to a very high value
        int lowestRank = Integer.MAX_VALUE;
        int cuts = 0;

        // Iterate through each rank in the array
        for (int rank : ranks) {
            // If the current rank is lower than the lowest recorded rank
            if (rank < lowestRank) {
                // Update the lowest rank to the current rank
                lowestRank = rank;
                // Increment the cuts counter
                cuts++;
            }
        }

        // Return the total number of cuts
        return cuts;
    }
}
