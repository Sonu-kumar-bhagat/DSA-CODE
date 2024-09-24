import java.util.Arrays;
public class ReverseArray {
     public static void printArray(int[] arr){
        // int n = arr.length;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
     public static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }
     }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
printArray(arr);
reverseArray(arr,0,arr.length-1);
printArray(arr);
    }
    
}
