public class Lect_45 {
  static boolean binarySear(int a[],int target){
    int st=0,end=a.length-1;
    while (st<=end) {
        int mid=(st+end)/2;
        if(target==a[mid]){ return true;}
        else if (target<a[mid]) {
            end=mid-1;
        }else {st=mid+1;}
    } return false;
  }
static boolean recBinaSea(int a[],int st,int end,int target){
    if(st>end)return false;
    int mid=(st+end)/2;
    if(a[mid]==target)return true;
    else if(target<a[mid])return recBinaSea(a, st, mid-1, target) ;
    else return recBinaSea(a, mid+1, end, target);

    // if(st<=end){
    // int mid=(st+end)/2;
    // if(a[mid]==target)return true;
    // else if(target<a[mid])return recBinaSea(a, st, mid-1, target) ;
    // else return recBinaSea(a, mid+1, end, target);}
    // return false;
}
    static int firstOcc(int a[],int target){
            int fo=-1;
            int st=0,end=a.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(a[mid]==target){fo=mid;end=mid-1;}
                else if(target<a[mid])end=mid-1;
                else st=mid+1;
            }
            return fo;
    }
    static int lastOcc(int a[],int target){
            int fo=-1;
            int st=0,end=a.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(a[mid]==target){fo=mid;st=mid+1;}
                else if(target<a[mid])end=mid-1;
                else st=mid+1;
            }
            return fo;
    }
    static int rootWhile(int x){
        int y=0;
        while(y*y<=x){y++;}
        return y-1;
    }
// static int squareRoot(int x){
//     int st=0,end=x;
//     int ans=-1;
//     while(st<=end){
//         int mid=st+(end-st)/2;
//         int val=mid*mid;
//         if(val==x)return mid;
//         else if(val>x)end=mid-1;
//         else{st=mid+1;ans=mid;}
//     }
//     return ans;
// }
static int squareRoot(int x){
    int st=0,end=x/2;int ans=-1;
    while(st<=end){int mid=st+(end-st)/2;
        int val=mid*mid;
    if(val==x)return mid;
    else if(val>x)end=mid-1;
    else {st=mid+1;ans=mid;}
}
return ans;
}

  public static void main(String[] args) {
        // int a[]={0,1,2,3,4,5};
        //     int a[]={1,2,3,5,5,5,5,6,};
        // int target=5;
        // System.out.println(binarySear(a, target));
        // System.out.println(recBinaSea(a, 0, a.length-1, target));
            // int target=5;
        //     int target=0;
        // while (target!=10) {
            
        //     // System.out.printf("%d exixst in array %b \n",target,recBinaSea(a, 0, a.length-1, target));   
        //     System.out.printf("%d exixst in array %b \n",target,binarySear(a, target));  
        //     System.out.println(); 
        //     target++;
        // }
            // System.out.println(firstOcc(a, target));
            // System.out.println(lastOcc(a, target));
        int x=24;
        System.out.println(squareRoot(x));
        System.out.println(rootWhile(x));
    }
}

