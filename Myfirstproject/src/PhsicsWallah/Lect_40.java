public class Lect_40 {

    static int [] moveZeros(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]==0&&a[j+1]!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    static String[]  fruitsSort(String[] fruits){
        for(int i=0;i<fruits.length;i++){
            int min_idx=i;
            for(int j=i+1;j<fruits.length;j++){
                if(fruits[j].compareTo(fruits[min_idx])<0){
                    min_idx=j;
                }
            }
          String temp=fruits[i];
          fruits[i]=fruits[min_idx];
          fruits[min_idx]=temp;  
        }
        return fruits;
    }

    public static void main(String[] args) {
        // int a[]={0,1,0,2,0,3,4,5};
        // moveZeros(a);
        // for(int i:a){
        //     System.out.print(i+" ");
        // }
        String[] fruits={"mango","guava","apple","orange","pineapple","settle","set","aa","a","aap"};
       fruitsSort(fruits);
        for(String f:fruits){
            System.out.print(f+",");
        }
    }
}
