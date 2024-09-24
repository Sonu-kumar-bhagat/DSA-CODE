// package PhsicsWallah;

public class Lect_52 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(0);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        System.out.println(nthNode(a,6).data);
        System.out.println(nthNodeRabbit(a,6).data);
    }
    static Node nthNode(Node head,int x){
        int size=0;
        Node temp=head;
        while(temp!=null){size++;temp=temp.next;}
        int idxHead=size-x+1;
        temp=head;
        for(int i=1;i<idxHead;i++){
            temp=temp.next;
        }
        return temp;
    }
    static Node nthNodeRabbit(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

}
