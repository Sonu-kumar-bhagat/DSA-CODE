import java.sql.SQLNonTransientConnectionException;

public class min2arr {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int min1Value(int[] arr){
        int min1 = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min1){
                min1 = arr[i];
            }
        }
        return min1;
    }
 public static int min2Value(int[] arr){
        int min2 = min1Value(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min2){
                min2 = arr[i];
                continue;
                 min2 = arr[i];
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,2,1,-9,8,12,11,16};
printArray(arr);
min1Value(arr);
min2Value(arr);
System.out.println("minimum value");
System.out.println(min1Value(arr));
System.out.println("maximum value");
System.out.println(min2Value(arr));
    }
}
