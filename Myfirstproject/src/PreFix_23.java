import java.util.Scanner;

public class PreFix_23 {
    static void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the elements");
        int r=in.nextInt();
        int c=in.nextInt();
        System.out.println("enter the element");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("enter the row and col for the rectangle");
         int l1=in.nextInt();
          int r1=in.nextInt();
           int l2=in.nextInt();
            int r2=in.nextInt();
           int sum1=rectSum(a, l1, r1, l2, r2);
                int sum2=rectSum2(a, l1, r1, l2, r2);
                int sum3=rectSum3(a, l1, r1, l2, r2);
           System.out.println(sum1);
           System.out.println(sum2);
            System.out.println(sum3);
    }
   
   

    static int rectSum(int a[][],int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    static void preFixSum(int a[][]){
        int r=a.length;
        int c=0;
        if(r>1){
         c=a[0].length;}
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        
    }
    static int rectSum2(int a[][],int l1,int r1,int l2,int r2){
        int sum=0;
        preFixSum(a);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=a[i][r2]-a[i][r1-1];
            }
            else
            sum+=a[i][r2];
        }
        return sum;
    }

    static void preFixSumRowAndCol(int a[][]){
        int r=a.length;
        int c=a[0].length;
         for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }
        }
        
         for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                a[i][j]+=a[i-1][j];
            }
        }
    }

    static int rectSum3(int a[][],int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftup=0;
        // preFixSum(a);
        preFixSumRowAndCol(a);
        sum=a[l2][r2];
        if(l1>=1)
        up=a[l1-1][r2];
        if(r1>=1)
        left=a[l2][r1-1];
        if(l1>=1 && r1>=1)
        leftup=a[l1-1][r1-1];

        ans=sum-up-left+leftup;
        return ans;
    }

    public static void main(String[] args) {
        input();
    }
}
