// package Deloite;

import java.util.Scanner;

public class virus {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int v[]=new int[n];
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        System.out.println("enter the spikes");
        int spikes=sc.nextInt();

        for(int i=0;i<n;i++){
            v[i]=v[i]>>spikes;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(Integer.toBinaryString(v[i]));
        }
        System.out.println(sb.toString());
        // Scanner scanner = new Scanner(System.in);
        //  // Input the number of elements in the array
        //  int N = scanner.nextInt();

        //  // Input the array of integers
        //  int[] V = new int[N];
        //  for (int i = 0; i < N; i++) {
        //      V[i] = scanner.nextInt();
        //  }
 
        //  // Input the number of spikes in Corona Virus
        //  int spikes = scanner.nextInt();
 
        //  // Process each number in the array
        //  for (int i = 0; i < N; i++) {
        //      V[i] = V[i] >> spikes;  // Right shift the number by 'spikes' bits
        //  }
 
        //  // Concatenate all binary results into a single string
        //  StringBuilder result = new StringBuilder();
        //  for (int i = 0; i < N; i++) {
        //      result.append(Integer.toBinaryString(V[i]));
        //  }
 
        //  // Print the final concatenated binary string
        //  System.out.println(result.toString());
    }
}
