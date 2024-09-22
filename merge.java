public class merge {
    public static void main(String[] args) {
        int []arr1 = {1,3,5,7};
        int []arr2 = {2,4,6,8};

        int []ans = merge(arr1, arr2);
        for(int data : ans){
            System.out.print(data+" ");
        }
    }
    public static int[] merge(int []arr1, int []arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int []ans = new int[n1+n2];
        int i =0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }
        while( i < n1){
            ans[k++] = arr1[i++];
        }
        while(j < n2){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
