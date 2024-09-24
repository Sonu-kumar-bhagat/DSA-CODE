import java.util.Scanner;

public class Recursion_27 {
    static void printIncreasing(int n){
        
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
     
    static void printDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value to print ");
        int n=in.nextInt();
        // // printIncreasing(n);
        // printDecreasing(n);
       
    }
}
