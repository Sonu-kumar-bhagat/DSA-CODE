import java.util.Stack;

public class Lect_54_2_arrImpl {
    public static class Stack{
        // int arr[]=new int[10];
        int arr[]=new int[4];
        int idx=0;
        void push(int x){
            if(idx==arr.length){
                System.out.println("stack: is full");
                return;
            }
            arr[idx++]=x;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){System.out.println("stack : is empty");
        return -1;
             }   
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");   
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0)return true;
            else return false;
        }
        boolean isfull(){
            if(idx==arr.length)return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
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
        System.out.println(st.isfull());
    }
}
