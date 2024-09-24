public class Lect_42 {
    static void displayArra(int a[]){
        for(int i:a) System.out.print(i+" ");
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void quickSort(int a[],int st,int end){
        if(st>=end) return;
        int pi=partition(a, st, end);
        quickSort(a, st, pi-1);
        quickSort(a, pi+1,end);
    }
    static int partition(int a[],int st,int end){
        int pivot=a[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(a[i]<pivot) count++;
        }
        int pivotIdx=st+count;
        swap(a, st, pivotIdx);
        int i=st;int j=end;
        while (i<pivotIdx&&j>pivotIdx) {
            while (a[i]<pivot) {
                i++;
            }
            while (a[j]>pivot) {
                j--;
            }
            if(i<pivotIdx&&j>pivotIdx){
                swap(a, i, j);
                i++;
                j--;
            }
        }


        return pivotIdx;
    }

    public static void main(String[] args) {
        int a[]={6,6,3,1,4,5,7,5};
        System.out.println("array before sorting");
        displayArra(a);
        System.out.println();
        quickSort(a, 0, a.length-1);
        System.out.println("Array after sorting");
        displayArra(a);
    }
}
