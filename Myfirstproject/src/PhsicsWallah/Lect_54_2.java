import java.util.Stack;

public class Lect_54_2 {
    // underflow

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(10);
        st.push(3);
        st.push(8);
        st.push(9);
      System.out.println(st);
        st.pop();
      System.out.println(st);
        st.pop();
      System.out.println(st);
        st.pop();
      System.out.println(st);
        st.pop();
      System.out.println(st);
        st.pop();
      System.out.println(st);
        System.out.println(st.peek());

    }
}
