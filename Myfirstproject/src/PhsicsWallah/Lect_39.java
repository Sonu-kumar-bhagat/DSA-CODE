public class Lect_39 {
    static int [] inserSort(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        return a;
    }
    // static void insert(int a[]){
    //     int n=a.length;
    //     for(int i=1;i<n;i++){
    //         int j=i;
    //         while(j>0&&a[j]<a[j-1]){
    //             int temp=a[j];
    //             a[j]=a[j-1];
    //             a[j-1]=temp;
    //             j--;
    //         }
    //     }
    // }
    static void insert(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;j--;
            }
        }
    }

    public static void main(String[] args) {
        int a[]={6,5,18,3,2,1,0};
        insert(a);
        for(int value:a){
            System.out.print(value+",");
        }
    }
}
