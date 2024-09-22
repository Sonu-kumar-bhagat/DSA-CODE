public class Lect_38 {

    static int [] seleSort(int a[]){
        for(int i=0;i<=a.length-2;i++){
            int minidx=i;
            for(int j=i+1;j<=a.length-1;j++){
                if(a[j]<a[minidx]){
                    minidx=j;
                }
            }
            if(minidx!=i){
            int temp=a[i];
            a[i]=a[minidx];
            a[minidx]=temp;}
        }
        return a;
    }
    // static void select(int a[]){
    //     int n=a.length;
    //     for(int i=0;i<n-2;i++){
    //         int min_idx=i;
    //         for(int j=i+1;j<=n-1;j++){
    //             if(a[j]<a[min_idx]) min_idx=j;
    //         }
    //         if(min_idx!=i){
    //             int temp=a[i];
    //             a[i]=a[min_idx];
    //             a[min_idx]=temp;
    //         }
    //     }
        
    // }

    static void selectUsingMax(int a[]){
        int n=a.length;
        for(int i=n-1;i>=1;i--){
            int max_Index=i;
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[max_Index])max_Index=j;
            }
            if(max_Index!=i){
            int temp=a[i];
            a[i]=a[max_Index];
            a[max_Index]=temp;}
        }
    }
    public static void main(String[] args) {
        int a[]={6,5,4,3,2,1,0};
        // seleSort(a);
        selectUsingMax(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
