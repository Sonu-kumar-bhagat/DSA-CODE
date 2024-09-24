public class Sum {
    public static void main(String[] args) {
        int a[]={10,15,3,7};
        int sum=17;
       int left=0;
       int right=a.length-1;
       int presentsum=a[left]+a[right];
       
        }
       while(left<right){
         if(presentsum==sum){
            System.out.println("yes");
         if(left<right){
            left++;
        }
        else 
        right--;
       }
    }
}
