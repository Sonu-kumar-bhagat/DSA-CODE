public class Lect_36 {
    static int frogPro(int h[],int n,int idx){
        if(idx==n-1) return 0;
        int op1=Math.abs(h[idx]-h[idx+1])+frogPro(h, n, idx+1);
    if(idx==n-2) return op1;
    int op2=Math.abs(h[idx]-h[idx+2])+frogPro(h, n, idx+2);
    return Math.min(op1, op2);
    }
    static int frogPr(int a[],int n,int idx){
        if(idx==n-1) return 0;
        if(idx==n-2) return Math.abs(a[n-2]-a[n-1]);
        int opt1=frogPr(a,n, idx+1);
        int opt2=frogPr(a,n ,idx+2);
        return Math.min(opt1+Math.abs(a[idx]-a[idx+1]),opt2+Math.abs(a[idx]-a[idx+2]));
    }
    static void combinations(String num,String kp[],String res){
        if(num.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum=num.charAt(0)-'0';
        String cuuStri=kp[currNum];
        for(int i=0;i<cuuStri.length();i++){
            combinations(num.substring(1), kp, res+cuuStri.charAt(i));
        }
    }

    public static void main(String[] args) {
        // int h[]={10,30,40,20};
        // System.out.println(frogPr(h, h.length,0));
        String kp[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String num="253";
        combinations(num, kp," ");
    }
}
