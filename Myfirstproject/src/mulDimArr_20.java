import java.util.Scanner;

public class mulDimArr_20 {
    static void printMulDimArra(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static  void inputMulDimArra(){
      Scanner in=new Scanner(System.in);
       System.out.println("take no of rows");
       int r=in.nextInt();
       System.out.println("enter column");
       int c=in.nextInt();
       int a[][]=new int[r][c];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=in.nextInt();
        }
       System.out.println();
       }
       printMulDimArra(a); 
 }
    static void towInputArra(){
         Scanner in=new Scanner(System.in);
       System.out.println("take no of rows for first arr");
       int r=in.nextInt();
       System.out.println("enter column");
       int c=in.nextInt();
       int a[][]=new int[r][c];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=in.nextInt();
        }
       System.out.println();
       }
            // second input array code
        // Scanner in=new Scanner(System.in);
       System.out.println("take no of rows");
       int r1=in.nextInt();
       System.out.println("enter column");
       int c1=in.nextInt();
       int b[][]=new int[r1][c1];
       for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            b[i][j]=in.nextInt();
        }
       System.out.println();
       }
    //    sumArray(a, r, c, b, r1, c1);
        // printMulDimArra(sumArray(a, r, c, b, r1, c1));
        multipliOfArr(a, r, c, b, r1, c1);
        printMulDimArra( multipliOfArr(a, r, c, b, r1, c1));
    } 
     static int [][] multipliOfArr(int a[][],int r1,int c1,int b[][],int r2, int c2){
      if(c1!=r2){
        System.out.println("invalid input ");
        // return ;
      }
      int mul[][]=new int[r1][c2];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0;k<r2;k++){
                mul[i][j]+=(a[i][k]*b[k][j]);
            }
        }
      }
      return mul;
     }
    static int[][] sumArray(int a1[][],int r1,int c1,int b1[][],int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("wrong input summation not possible");
        }
            int sum[][]=new int[r1][c1];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    sum[i][j]=a1[i][j] + b1[i][j];
                }
            }
            return sum;
           
    }

    public static void main(String[] args) {
        // int a[][]=new int[3][3];
            // int a[][]={
            //     {1,2,3},{4,5,6},{7,8,9}
            // };
            
            // printMulDimArra(a);
            // inputMulDimArra();
            towInputArra();
    }
}
