import java.util.Scanner;
// package Deloite;
public class setBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("no. of set bits k");
        int k=sc.nextInt();int ans=0;
        for(int i=1;i<n;i++){
            int count=Integer.bitCount(i);
            if(count==k)ans++;
        }
        System.out.println(ans);
    }
}
