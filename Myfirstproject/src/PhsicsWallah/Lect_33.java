import java.util.ArrayList;

public class Lect_33 {
static boolean linearSearch(int a[],int target,int idx){
    if(idx>=a.length) return false;
    if(a[idx]==target) return true;
    return linearSearch(a, target, idx+1);
}
  
static int linearIndex(int a[],int target,int idx){
    if(idx>=a.length) return -1;
    if(a[idx]==target) return idx;
    return linearIndex(a, target, idx+1);
}


static void allin(int a[],int target,int idx){
    if(idx==a.length) return ;
    if(a[idx]==target) System.out.print(idx+" ");
    allin(a, target, idx+1);

}

// static ArrayList<Integer> allUsingarray(int a[],int n,int x,int idx){
//     ArrayList<Integer> ans=new ArrayList<>();
//     if(idx>=n){
//         return new ArrayList<Integer>();
//     }
//     if(a[idx]==x){
//         ans.add(idx);
//     }
//     ArrayList<Integer> smallAns=allUsingarray(a, n, x, idx+1);
//     ans.addAll(smallAns);
//     return ans;
// }
static ArrayList<Integer> Allind(int a[],int target,int idx){
    ArrayList<Integer> ans=new ArrayList<>();
    if(idx==a.length) return new ArrayList<>();
    ArrayList<Integer> smallans=Allind(a, target, idx+1);
    if(a[idx]==target) ans.add(idx);
    ans.addAll(smallans);
    return ans;
}
    public static void main(String[] args) {
        int a[]={1,2,3,2,2,5};
        int idx=0;
        int target=2;
        int n=a.length;
        // System.out.println(linearSearch(a, target, idx));
        // System.out.println(linearIndex(a, target, idx));
    //     // allIndices(a, target, idx);
        // ArrayList<Integer> ans=allUsingarray(a,n, target, idx);
        // for(Integer i:ans){
        //     System.out.print(i+" ");
        // }
        ArrayList<Integer> ans=Allind(a, target, idx);
        for(Integer i:ans){
            System.out.print(i+" ");
        }

    }
}
