import java.util.Scanner;

public class NumSystm {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // binary to decimal
    //     int bin=in.nextInt();
    //     int ans=0;
    //     int pw=1;
    //     while(bin>0){
    //         ans+=(bin%10)*pw;
    //         bin/=10;
    //         pw*=2;
    // }
    // System.out.println(ans);
//  Decimal to binary
int dec=in.nextInt();
int bin=0;
while(dec>0){
    bin=bin*10+dec%2;
    dec/=2;
}
System.out.println(bin);

}}
