import java.util.Scanner;
import java.util.Stack;

public class Lect_54 {

    static void pushAtBottom(Stack<Integer>s,int x){
        if(s.size()==0) {s.push(x) ;return; }
        int top=s.pop();
        pushAtBottom(s, x);
        s.push(top);
    }
     static void dispRev(Stack<Integer> s){
        if(s.size()==0) return;
        int top=s.pop();
        System.out.print(top+" ");
        dispRev(s);
        pushAtBottom(s, top);
     }
     static void disp(Stack<Integer> s){
        if(s.size()==0) return;
        int top=s.pop();
        
        disp(s);
        System.out.print(top+" ");
        s.push(top);
     }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        // System.out.println(st.size());
        // System.out.println(st);
        // System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(9);
        st.push(10);
        st.push(-10);
        st.push(-5);
        // System.out.println(st.peek());
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        //  System.out.println(st.size());
        // while(st.size()>2){
        //    st.pop();
        // }
        // System.out.println(st);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of tha stack");
        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     int x=sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);
        // Stack<Integer> rt=new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);
        // Stack<Integer> gt=new Stack<>();
        // while (rt.size()>0) {
        //     gt.push(rt.pop());
        // }
        // System.out.println(gt);

        /*insertion at any point

        Stack<Integer> tp=new Stack<>();
        int idx=2;
        int x=7;
        while (st.size()>2) {
            tp.push(st.pop());
        }
        st.push(x);
        while (tp.size()>0) {
            st.push(tp.pop());
        }
        System.out.println(st);*/

        /*copy the elements of the students

        Stack<Integer> st=new Stack<>();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size:");
         int n=in.nextInt();
         System.out.println("enter the element of the st");
         while (n-->0) {
            st.push(in.nextInt());
         }
         System.out.println(st);
         Stack<Integer> temp=new Stack<>();
         while (st.size()>0) {
            temp.push(st.pop());
         }
         System.out.println(temp);
         while (temp.size()>0) {
            st.push(temp.pop());
         }
         System.out.println(st);*/

         /*reverse an stack
         Stack<Integer> st=new Stack<>();
         Scanner in=new Scanner(System.in);
         System.out.println("enter size");
         int n=in.nextInt();
        int x=n;
         System.out.println("enter the element:");
         while (n-->0) {
            st.push(in.nextInt());
         } 
         n=x;
         System.out.println(st);
         Stack<Integer> temp1=new Stack<>();
         while(n-->0){
            temp1.push(st.pop());
         }
         n=x; System.out.println(temp1);
         Stack<Integer> temp2=new Stack<>();
         while(n-->0){
            temp2.push(temp1.pop());
         } n=x;System.out.println(temp2);
         while(n-->0){
            st.push(temp2.pop());
         } System.out.println(st);*/
           
         /*using function disp and reverse
        //  dispRev(st);
            System.out.println();
         System.out.println(st);
        //  System.out.println();
         disp(st);*/
         dispRev(st);
    }
}
