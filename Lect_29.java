import java.util.Scanner;

public class Lect_29 {
    static int sumOfDigit(int n){
        if(n>=0 && n<=9) return n;
        // sumOfDigit(n%10);
        return sumOfDigit(n/10)+n%10;
    }
        static int nod(int n){
            if(n==0) return 1;
            int nod=0;
            while(n>0){
                nod++;
                n=n/10;
            }
            return nod;
        }
    // static int pow(int p,int q){
    //     if(q==0) return 1;
    //     // return pow(p,q-1)*p;
    //     int smallPow=pow(p, q/2);
    //     if(q%2==0) return smallPow*smallPow;
    //     // else
    //     return p*smallPow*smallPow;
    // }
    static int pow(int p,int q){
        if(q==0) return 1;
        int sm=pow(p,q/2);
        if(q%2==0){
            return sm*sm;
        }
        else{
          return   p*sm*sm;
        }
    }
    // static int pw(int p,int q){
    //     if(q==0) return 1;
    //     return pw(p,q-1)*p;
    // }
    // static int pw(int p,int q){
    //     int ans=1;
    //     for(int i=1;i<=q;i++){
    //         ans=ans*p;
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int p=in.nextInt();
        int q=in.nextInt();
    //   System.out.println(nod(p));
        System.out.println(pow(p, q));
        
    }
}
