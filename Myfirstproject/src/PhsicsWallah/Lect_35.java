import java.util.ArrayList;
import java.util.Scanner;

public class Lect_35 {
    static ArrayList<String> subSequence(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0) {
            ans.add("");
            return ans;}
       Character currChar=s.charAt(0);
       ArrayList<String>smallAns=subSequence(s.substring(1));
       for(String ss:smallAns){
        ans.add(ss);
        ans.add(currChar+ss);
       }
       return ans;
    }
    static void printSs(String s,String currSt){
        if(s.length()==0){System.out.print(currSt+" ");
    return;}
        Character currcha=s.charAt(0);
        String remString=s.substring(1);
        printSs(remString, currSt+currcha);
        printSs(remString, currSt);
    }
    static void printSumSs(int a[],int n,int idx,int sum){
        if(idx==n) {
            System.out.print(sum+" ");
            return;
        }
        printSumSs(a,n,idx+1,sum+a[idx]);
        printSumSs(a,n,idx+1,sum);
    }

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
    //    String s1=in.next();
    //    printSs(s1, " ");
    //    ArrayList<String> ans=subSequence(s1);
    //    System.out.println(ans.size());
    //    for(String ss:ans){
    //     System.out.print(ss+" ");
    //    }
    int a[]={2,4,5};
    printSumSs(a,a.length, 0, 0);
    }
}
