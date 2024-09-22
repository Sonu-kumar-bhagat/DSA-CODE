import java.util.Scanner;

public class Lect_31 {

    static int gCD(int x,int y){
        int min=Math.min(x, y);
        for(int i=min; i>=1;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 0;
    }
    static int gCD1(int x,int y){
        while(x%y!=0){
          int rem=x%y;
           x=y;
           y=rem;

        }
        return y;
    }
    

    static int gcdRe(int x,int y){
        if(y==0) return x;
        return gcdRe(y, x%y);
    }

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    // System.out.println(gCD(x, y));
    // System.out.println(gCD1(x, y));
    // System.out.println(gcdRe(x, y));
    System.out.println(gcd(x,y));
    }
}
