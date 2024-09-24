import java.util.Stack;

public class Lect_54_3_LLTImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp+" ");
                temp=temp.next;
            }
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack:is Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        void displayRec(Node h){
            if(h==null)return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
         LLStack st=new LLStack();
        st.push(4);
        st.display();//4
        st.push(5);
        st.display();//4,5
        st.push(1);
        st.display();//4,5,1
        System.out.println(st.size());//3
        st.pop();
        st.display();//4,5
        st.push(7);
        st.push(0);
        System.out.println(st.size());//2
        st.display();
    }
}
