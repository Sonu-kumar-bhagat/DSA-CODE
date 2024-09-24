import java.util.Arrays;
import java.util.Scanner;

public class questions {
    
    static void kthLarSma(int []array){
        Arrays.sort(array);
        System.out.println("sorted array");
        for(int i=0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("enter the number of position for smallest");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println("enter the number of position for largest");
        // Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        
        int resarr[]={array[k-1],array[array.length-m]};
         for(int i=0 ;i<resarr.length;i++){
            System.out.print(resarr[i]+" "); }

    }

    // void  sortarr(int []array){
    static int[] sortarr(int[] array){
        Arrays.sort(array);
        for(int i=0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int resarr[]={array[0],array[array.length-1]};
        //  for(int i=0 ;i<resarr.length;i++){
            // System.out.print(resarr[i]+" "); }
        //   return resarr;
        return resarr;
    }
        

    static boolean sortedArr(int array[]){
        boolean check=true;
        for(int i=1; i<array.length;i++){
            if(array[i-1]>array[i]){
             check=false;
                   break;
            }

        }
        return check;
    }
    static void lastOccurance(int array[],int x){
        int lastIndex=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==x)
            lastIndex=i;
        }
        System.out.println("last occurance of  "+ x + " at "+ lastIndex);
       // return lastIndex;
      }

      static void greaterThan(int array[],int x){
          int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>x)
            count++;
        }
        System.out.println(count);
      }
    public static void main(String[] args) {
        questions obj=new questions();
         System.out.println("enter the size of the arry");;
        int n,x;
        Scanner in =new Scanner(System.in);
            n=in.nextInt();
           
            int array[]=new int[n];
            System.out.println("enter the all the elements of the array");
            for(int i=0;i<array.length;i++){
                array[i]=in.nextInt();
            }
//  System.out.println("enter the comparing value");
//              x=in.nextInt();
            // obj.lastOccurance(array, x);
            // obj.greaterThan(array, x);
            // sortedArr(array);
            // obj.sortarr(array);
            obj.kthLarSma(array);
    }
}
