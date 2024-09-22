public class Lect_37 {
    static int [] bubbleSort(int h[]){
        for(int i=0;i<h.length-1;i++){
            for(int j=0;j<h.length-i-1;j++){
                if(h[j]>h[j+1]){
                    int temp=h[j];
                    h[j]=h[j+1];
                    h[j+1]=temp;
                }
            }
        }
        return h;
    }
    static void bubb(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    flag=true;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(!flag) return;
        }
        
    }

    public static void main(String[] args) {
        int h[]={6,5,4,3,2,1,0};
        // bubbleSort(h);
        bubb(h);
        for(int i=0;i<h.length;i++){
            System.out.print(h[i]+",");
        }

    }
}
