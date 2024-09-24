import java.util.Scanner;

public class Array_19 {
    static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static /*int[]*/void prefixSumArray(int a[]){
        int prefi[]=new int[a.length];
        prefi[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefi[i]=prefi[i-1]+a[i];}
        
    //      Scanner in=new Scanner(System.in);
    //      System.out.println("enter the number of queries");
    //       int q=in.nextInt();
    //       while(q-->0){
    //    System.out.println("enter the range of the array");
      
    //    int l=in.nextInt();
    //    int r=in.nextInt();
    //    System.out.println(prefi[r]-prefi[l-1]);
    printArray(prefi);
          }  
    // }
    static void suffixArray(int a[]){
        int pre[]=new int[a.length];
        pre[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            pre[i]=pre[i+1]+a[i];
        }
        printArray(pre);
    }
    static int totalSum(int[]a){
        int totalSum=0;
        for(int i=0;i<a.length;i++){
            totalSum+=a[i];
        }
        return totalSum;
    }
    static boolean equalPartion(int a[]){
      int  totalsum=totalSum(a);
      int prefix=0;int suf=0;
      boolean ans=true;
      for(int i=0;i<a.length;i++){
        prefix+=a[i]; suf=totalsum-prefix;
        if (prefix==suf) {
            ans=true;
        } else {
            ans= false;
        }
      }
      return ans;

    }

    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        // printArray(a);
        // int prefi[]=prefixSumArray(a);
        // printArray(prefi);
        // prefixSumArray(a);
        // equalPartion(a);
        // System.out.println(equalPartion(a));
        suffixArray(a);

    }
}
