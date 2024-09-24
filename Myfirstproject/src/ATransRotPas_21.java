import java.util.Scanner;

public class ATransRotPas_21 {
    static void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the dimen");
        int r=in.nextInt();
        int c=in.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
            System.out.println();
        }
        // trnspose(a, r, c);
        // printArray(trnspose(a, r, c));
        // transpoInPlace(a, r, c);
        //  printArray(transpoInPlace(a, r, c));
        // printArray(rotateArray(a, r, c));
        spiralOut(a, r, c);
       
    }

    static int [][] inSpiral(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number n");
        int n=in.nextInt();
        int a[][]=new int[n][n];
        int r=n,c=n;
        int curr=1;
         int topRow=0,rightCol=c-1,bottomRow=r-1,leftCol=0,totalElem=0;

        while(curr<=r*c){
            for(int j=leftCol;j<=rightCol&&curr<=r*c;j++){
               a[topRow][j]=curr;
                curr++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow&&curr<=r*c;i++){
                a[i][rightCol]=curr;
                curr++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol&&curr<=r*c;j--){
                a[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow&&curr<=r*c;i--){
              a[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return a;
        
    }
    static void spiralOut(int a[][],int r,int c){
        int topRow=0,rightCol=c-1,bottomRow=r-1,leftCol=0,totalElem=0;

        while(totalElem<r*c){
            for(int j=leftCol;j<=rightCol&&totalElem<r*c;j++){
                System.out.print(a[topRow][j]+" ");
                totalElem++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow&&totalElem<r*c;i++){
                System.out.print(a[i][rightCol]+" ");
                totalElem++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol&&totalElem<r*c;j--){
                System.out.print(a[bottomRow][j]+" ");
                totalElem++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow&&totalElem<r*c;i--){
                System.out.print(a[i][leftCol]+" ");
                totalElem++;
            }
            leftCol++;
        }

    }
        static int[][] pascleTri(){
            Scanner in=new Scanner(System.in);
            System.out.println("enter the value for triangle");
            int n=in.nextInt();
            int a[][]=new int[n][];
            for(int i=0;i<n;i++){
                 a[i]=new int[i+1];
                a[i][0]=a[i][i]=1;
                for(int j=1;j<i;j++){
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
            }
            return a;
        }
        static int[][] rotateArray(int a[][],int r,int c){
            transpoInPlace(a, r, c);
            for(int i=0;i<r;i++){
                    reverseArray(a[i]);
            }
            return a;
        }
        static int[] reverseArray(int a[]){
            int i=0,j=a.length-1;
            while(i<j){
              int temp=a[i];
              a[i]=a[j];
              a[j]=temp; 
              i++;
              j--; 
            }
            return a;
        }
    static int[][] trnspose(int a[][] ,int r,int c){
        int trans[][]=new int[c][r];
        for(int i=0; i<c;i++){
            for(int j=0;j<r;j++){
                trans[i][j]=a[j][i];
            }
        }
        return trans;
    }
    static void printArray(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][]transpoInPlace(int a[][],int r,int c){
        for(int i=0; i<c;i++){
            for(int j=i;j<r;j++){
                int temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // input();
        //  printArray(pascleTri());
       printArray(inSpiral());
    }
}
