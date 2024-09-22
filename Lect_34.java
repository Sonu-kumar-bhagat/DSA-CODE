import java.util.Scanner;

public class Lect_34 {

    static String removeIter(String s){
        String ans="";
        for(int i=0;i<=s.length();i++){
            if(s.charAt(i)!='a') {
              ans+=s.charAt(i);
            }
        }
        return ans;
    }
    // static String removea(String a,int idx){
    //     String ans;
    //     if(idx==a.length()) return "";
    //     ans=removea(a,idx+1);
    //     if(a.charAt(idx)!='a') return a.charAt(idx)+ans;
    //     else return ans;
    // }
        static String removealla(String a){
            String ans;
            if(a.length()==0) return "";
            ans=removealla(a.substring(1));
            if(a.charAt(0)!='a') return a.charAt(0)+ans;
            else return ans;
        }
        static String Reverse(String a){
            String ans;
            if(a.length()==0) return "";
            ans=Reverse(a.substring(1));
                return ans+a.charAt(0);
        }
    static boolean pelindrome(String s,int l,int r){
        if(l==r) return true;
        return s.charAt(l)==s.charAt(r)&&pelindrome(s, l+1, r-1);

    }
    static String removeOccurances(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallAns=removeOccurances(s, idx+1);
        char currchar=s.charAt(idx);
        if(currchar!='a')
       return currchar+smallAns;
       else
       return smallAns;

    }
    public static void main(String[] args) {
        // String s="sonu";
        // System.out.println(s);
        Scanner in=new Scanner(System.in);
        // String s1=in.next();
        int num=in.nextInt();
        String s2=String.valueOf(num);
        // String s1=in.nextLine();
        // System.out.println(s1);
        // char ch=s1.charAt(0);
        // System.out.println(ch);
        // for(int i=0;i<=s1.length();i++){
        //     // System.out.println(s1.charAt(i));
        //     System.out.print(s1.charAt(i));
        // }
            // System.out.println(s1.substring(0,4));
            // System.out.println(s1.substring(5));
            // System.out.println(s1);
            // System.out.println(removeIter(s1));
            // System.out.println(removealla(s1));
            // System.out.println(Reverse(s1));
            // System.out.println(removeOccurances(s1, 0));
        //    System.out.println(pelindrome(s1, 0, s1.length()-1)); 
        System.out.println(pelindrome(s2, 0, s2.length()-1));
    }
    
}
