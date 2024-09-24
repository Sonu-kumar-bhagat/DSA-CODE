import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input number of products
        int numOfProducts = scanner.nextInt();
        
        // Input the orders for each product
        int[] orders = new int[numOfProducts];
        for (int i = 0; i < numOfProducts; i++) {
            orders[i] = scanner.nextInt();
        }
        
        // Input the discount amount
        int disAmount = scanner.nextInt();

        // Variable to count how many products can have the discount distributed
        int count = 0;

        // Check for each product if discount can be evenly distributed
        for (int i = 0; i < numOfProducts; i++) {
            int orderCount = Math.abs(orders[i]);  // We care about the absolute number of orders
            if (orderCount != 0 && disAmount % orderCount == 0) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
