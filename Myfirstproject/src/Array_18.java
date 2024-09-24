import java.util.Scanner;

public class Array_18 {
    static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    static void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static void sortZerosAndOnes(int array[]){
        int count=0;
        int ans=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                count++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(i<count)
            array[i]=0;
            else
            array[i]=1;
        }
        printArray(array);
    }
    static void zeorAndOnesByTwoPointr(int array[]){
        int left=0;int right=array.length-1;
        while(left<right){
            if(array[left]==1&&array[right]==0){
                swap(array, left, right);
                left++;
                right--;
            }
            if(array[left]==0){
                left++;
            }
            if(array[right]==1){
                right--;
            }
        }
        printArray(array);
    }
    static void sortEvenAndOdd(int array[]){
        int left=0;int right=array.length-1;
        while(left<right){
            if(array[left]%2==1&&array[right]%2==0){
                swap(array, left, right);
                left++;
                right--;
            }
            if(array[left]%2==0){
                left++;
            }
            if(array[right]%2==1){
                right--;
            }
        }
        printArray(array);
    }
    static void square(int a[]){
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        printArray(a);
    }
    static void reverseArray(int a[]){
        int i=0;int j=a.length-1;
        while(i<j){
            swap(a, i, j);
            i++;
            j--;
        }
        // printArray(a);
    }
    static void sortSquare(int a[]){
        int left=0; int right=a.length-1;
        int ans[]=new int[a.length];
        // int k=0;
        int k=a.length-1;
        while(left<=right){
            if(Math.abs(a[left])>Math.abs(a[right])){
                // ans[k++]=a[left]*a[left];
                 ans[k--]=a[left]*a[left];
                left++;
            }
            else{
            // ans[k++]=a[right]*a[right];
            ans[k--]=a[right]*a[right];
                right--;}
        }
        // reverseArray(ans);
        printArray(ans);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        // sortZerosAndOnes(a);
        // zeorAndOnesByTwoPointr(a);
        // sortEvenAndOdd(a);
        // square(a);
        // reverseArray(a);
        sortSquare(a);
    }
}
