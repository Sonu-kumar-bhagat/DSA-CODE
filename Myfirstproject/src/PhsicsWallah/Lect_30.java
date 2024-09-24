import java.util.Scanner;

public class Lect_30 {

    static void printMul(int n,int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }
        printMul(n, k-1);
        System.out.print(n*k+" ");
    }
        // static void pm(int n,int k){
        //     for(int i=1;i<=k;i++) System.out.print(n*i+" ");
        // }
        // static void prm(int n,int k){
        //     if(k==0) return ;
        //     prm(n,k-1);
        //     System.out.print(n*k+" ");
        // }
    static int seriesSum(int n){
        if(n==0) return n;
        return seriesSum(n-1)+n;
    }
    // static int sum(int n){
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         if(i%2==0) sum-=i;
    //         else sum+=i;
    //     }
    //     return sum;
    // }
        static int sal(int n){
            
            if(n==1) return 1;
            int sum=sal(n-1);
                if(n%2==0) sum-=n;
                else sum+=n;

                return sum;
        }
    static int seriesSum1(int n){
        if(n==0) return n;
        if(n%2==0) return seriesSum1(n-1)-n;
        else return seriesSum1(n-1)+n;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        // int k=in.nextInt();
        // printMul(n, k);
    //    System.out.println(seriesSum(n));
    // System.out.println(seriesSum1(n)); 
// prm(n,k);
System.out.println(sal(n));
    }
}
