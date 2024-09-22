public class Lect_51 {
    // public static class Student {
    //     String name;
    //    private int rno=66;
    //     // int rno;
    //     double per;
    //     // static int getRno(){return rno;}
    //     }
    // public static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){this.data=data;}
    //     Node(){this.data=data;}
    // }

    //to make linkde list class
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        public void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                // tail=temp;//redundant
            }
            else {
                tail.next=temp;
                // tail=temp;//reduntant
            }
            tail=temp;
        }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   int size(){
        Node temp=head;
        int count=0;
         while(temp!=null){
            count++;temp=temp.next;
        }
        return count;
    }
    void insetAtBegining(int val){
        Node temp=new Node(val);
        if(head==null){
            // head=tail=temp;
            insertAtEnd(val);
        }
        else {
            temp.next=head;
            head=temp;
        }
    }
    void insertAt(int idx,int val){
        Node t=new Node(val);
        Node temp=head;
        if(idx==size()){insertAtEnd(val);return;}
       else if(idx==0){insetAtBegining(val);return;}
       else if(idx<0||idx>size()){System.out.println("wrong input");return;}
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    }
    int get(int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    void deleteAt(int idx){
        if(idx==0){head=head.next;return;}
        Node temp=head;
        
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
    }
    }

        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.insertAtEnd(11);
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(0);
            ll.display();
            System.out.println();
            System.out.println(ll.size());
            ll.insetAtBegining(10);
            ll.display();
            System.out.println();
            System.out.println(ll.size());
            ll.insertAt(3, -5);
            ll.display();
            System.out.println();
            System.out.println(ll.tail.data);
            ll.insertAt(0, 100);
            ll.display();
            System.out.println();
            System.out.println(ll.get(2));
          ll.deleteAt(2);
          ll.display();
            // Node a=new Node(5);
            // Node b=new Node(3);
            // Node c=new Node(4);
            // Node d=new Node(6);
            // Node e=new Node(7);
            // a.next=b;
            // b.next=c;
            // c.next=d;
            // d.next=e;
            // e.next=null;
            // insertAtEnd(a, 50);
            // printLinkedList(a);
            // System.out.println(a);
            // System.out.println(a.next);//here a.next and b will give same output
            // System.out.println(b);//both have same address
            // System.out.println(c);

            // easy way to print data
            // System.out.println(a.data);
            // System.out.println(b.data);
            // System.out.println(c.data);
            // System.out.println(d.data);
            // System.out.println(e.data);

            // printing using loop
            // for(int i=0;i<5;i++){
            //     System.out.println(a.data);
            //     a=a.next;
            // }
            // System.out.println(a.data);
            // Node temp=a;
            // for(int i=0;i<5;i++){
            //     System.out.println(temp.data);
            //     temp=temp.next;
            // }
            // System.out.println(a.data);

            // using while loop
            // Node temp=a;
            // while(temp!=null){
            // // while(temp.next!=null){
            //     System.out.print(temp.data+" ");
            //     temp=temp.next;
            // }

            //print recursively
            // printLinkedList(a);
            // System.out.println();
            // printReverse(a);
            // System.out.println();
            // System.out.println(length(a));

        }
        static void printLinkedList(Node node){
            Node temp=node;
        if(temp==null)return;
        System.out.print(temp.data+" ");
        printLinkedList(temp.next);
        }
        // static void printReverse(Node node){
        //     Node temp=node;
        //     if(temp==null)return;
        //     printReverse(temp.next);
        //     System.out.print(temp.data+" ");
        // }
        // static int length(Node node){
        //     int count =0;
        //     Node temp=node;
        //     while(temp!=null){temp=temp.next;count++;}
        //     return count;
        // }
        static  void insertAtEnd(Node node,int val){
            Node temp=new Node(val);
            Node t=node;
            while(t.next!=null)t=t.next;
            t.next=temp;
           
        }
}
