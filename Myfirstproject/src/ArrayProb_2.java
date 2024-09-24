import java.util.Scanner;

public class ArrayProb_2 {


    static void swapar(int array[],int i,int j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        //      System.out.println("reversed array");
        // for(int k=0;k<array.length;k++){
        //     System.out.print(array[k]+" ");}
    }
    static void rotateInPlace(){
            System.out.println("enter the size of the array");
                Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int a[]=new int[n];
            System.out.println("enter all the elements");
            for(int i=0;i<a.length;i++){
                a[i]=in.nextInt();
            }
      
             int k=in.nextInt();
             k%=a.length;
            reverseArrBySwap(a, 0, a.length-k-1);
            reverseArrBySwap(a, a.length-k, a.length-1);
            reverseArrBySwap(a, 0, a.length-1);
            printArray(a);
    }
    static int[] reverseArrBySwap(int array[],int i,int j){
        //  System.out.println("enter the size of the array");
        //       Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int a[]=new int[n];
        // System.out.println("enter all the elements");
        // for(int i=0;i<a.length;i++){
        //     a[i]=in.nextInt();
        // }
        // int i=0; int j=a.length-1;
        while(j>i){
        //    int temp=a[i];
        //     a[i]=a[j];
        //     a[j]=temp;
        swapar(array, i, j);
           i++;
           j--;
         
        }
        //  System.out.println("reversed array");
        // for(int k=0;k<a.length;k++){
        //     System.out.print(a[k]+" ");}
        return array;
        
    }
    


        // static int[] reverseArr(){
    static void reverseArr(){
        System.out.println("enter the size of the array");
              Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int ar[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            ar[j]=a[i];
            System.out.print(ar[j]+" ");
            j++;
        }
        // return ar;
    }
    
    static void swap(){
        Scanner in=new Scanner(System.in);
        System.out.println("provide the value to swap");
        int a=in.nextInt();
        int b=in.nextInt();
        // int t=a;
        // a=b;
        // b=t;
        // using sum method without temp
        // a=a+b;b=a-b;
        // a=a-b;
        // using multiplication method
        a=a*b; b=a/b;a=a/b;
        System.out.println("swaped value "+a+" "+b);
    }
    static void rotate(){
         System.out.println("enter the size of the array");
              Scanner in=new Scanner(System.in); int n=in.nextInt(); int a[]=new int[n];
        System.out.println("enter all the elements");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt(); }
            System.out.println("enter the value of k to rotate the array");
             int k=in.nextInt();
             k%=a.length;
             System.out.println("rotated array");
            for(int i=a.length-k;i<a.length;i++){ 
                System.out.print(a[i]+" ");} 
                for(int i=0;i<a.length-k;i++){
                System.out.print(a[i]+" ");}
    }         
        static void printArray(int array[]){
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        }
        static int [] makeFrequencyArray(int array[]){
            int fre[]=new int[100005];
            for(int i=0;i<array.length;i++){
                fre[array[i]]++;  
            }
            return fre;
        }
        static void queary(int array[]){
            System.out.println("enter the number of quearies");
            Scanner in=new Scanner(System.in);
            int q=in.nextInt();
            int freq[]=makeFrequencyArray(array);
            while(q-->0){
                
                int qu=in.nextInt();
                if( freq[qu]>0)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
        }
    public static void main(String[] args) {
         System.out.println("enter the size of the array");
              Scanner in=new Scanner(System.in); 
              int n=in.nextInt(); 
              int a[]=new int[n];
        System.out.println("enter all the elements");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt(); }
    //    ArrayProb_2 obj=new ArrayProb_2();
        // swap();
        // reverseArr();
        // swapar();
        // rotate();
        // rotateInPlace();
        queary(a);
 
    }
}
