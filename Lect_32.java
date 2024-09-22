public class Lect_32 {
    
    // static void printArray(int array[],int idx){
    //     if(idx==array.length) return;
    //     System.out.print(array[idx]+" ");
    //     printArray(array, idx+1);
    // }
   
    static int maxOfArr(int array[],int idx){
        if(idx==array.length-1) return array[idx];
        int smallAns=maxOfArr(array, idx+1);
        return Math.max(smallAns,array[idx]);
    }
   
    static int sumOfArr(int array[],int idx){
        // if(idx==array.length-1) return array[idx];
        if(idx==array.length) return 0;
        return sumOfArr(array, idx+1)+array[idx];
    }

    
    public static void main(String[] args) {
        int a[]={5,6,7,8,14,-40,-14};
        int idx=0;
        // printArray(a, idx);
    //    System.out.println( maxOfArr(a, idx));
    // System.out.println(sumOfArr(a, idx));
  
    }
}
