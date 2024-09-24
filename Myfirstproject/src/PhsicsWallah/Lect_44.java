

public class Lect_44 {
    static void displayArra(int a[]){
        for(int i:a){System.out.print(i+" ");}
    }
    static void sortArra(int a[]){
        int n=a.length;
        int x,y;
        x=y=-1;
        if(n<=1) return;
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void partition(int[] num){
        int l = 0, r = num.length-1;
        while(l < r){
            while(num[l] < 0) l++;
            while (num[r] >= 0) r--;
            if(l < r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }
    static void countSort(int a[]){
        int coun_0,coun_1,coun_2;
        coun_0=coun_1=coun_2=0;
        for(int i:a){
            if(i==0) coun_0++;
            if(i==1) coun_1++;
            if(i==2) coun_2++;

        }
        int k=0;
        while (coun_0>0) {
            a[k++]=0;
            coun_0--;
        }
        while (coun_1>0) {
            a[k++]=1;
            coun_1--;
        }
        while (coun_2>0) {
            a[k++]=2;
            coun_2--;
        }

    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void countInPass(int a[]){
        int lo=0,mid=0,hi=a.length-1;
        while (mid<hi) {
            if(a[mid]==0){
                swap(a, mid, lo);
                mid++;
                lo++;
            }
            else if(a[mid]==1){
                mid++;
            } else{
                swap(a, mid, hi);
                hi--;
            } 
        }
    }
   
  
    public static void main(String[] args) {
        // int a[]={10,-3,-4,-5,0,7,8,9,2};
        int a[]={1,2,0,0,2,1,2,1,0};
        System.out.println("array before sorting");
        displayArra(a);
        System.out.println();
        System.out.println("array aater sorting");
        // sortArra(a);
        // partition(a);
        // countSort(a);
        countInPass(a);
        displayArra(a);
    }
}
