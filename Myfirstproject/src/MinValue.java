 import java.util.Arrays;
 public class minValue {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
public static int Value(int[] arr){
    int min = arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return  min ;
}

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,9,0};
printArray(arr);
Value(arr);
System.out.println(Value(arr));
    }
    
}
