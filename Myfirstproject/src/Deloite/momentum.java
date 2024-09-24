import java.util.Scanner;
// package Deloite;
public class momentum {
    public static class Node {
    int mass;
    int velocity;
        Node next;
        Node(int mass,int velocity){
            this.mass=mass;this.velocity=velocity;
        }
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter no of node");
        // int n=sc.nextInt();
        Node a=new Node(1, 3);
        Node b=new Node(2, 4);
        Node c=new Node(2, 3);
        Node d=new Node(4, 5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        Node temp=a;int momentum=0;
        while(temp!=null){
            momentum+=(temp.mass*temp.velocity);temp=temp.next;
        }
        System.out.println(momentum);

    }
}
