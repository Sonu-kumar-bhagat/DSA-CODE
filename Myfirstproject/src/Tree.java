import java.util.*;
public class Tree {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
 }
 static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1)return null;
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
 }
 static void preOrder(Node root){
    if(root==null)return;
    // if(root==null)System.out.print("-1"+" ");
    System.out.print(root.data+" ");
    preOrder(root.left);;
    preOrder(root.right);
   

 }
 static void inOrder(Node root){
    if(root==null)return;
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
   
    
 }
 static void postOrder(Node root){
    if(root==null)return;
    postOrder(root.left);;
    postOrder(root.right);
    System.out.print(root.data+" ");
 }
 static void levelOrder(Node root){
    if(root==null)return;
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty())break;
            else q.add(null);
        }
        else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null)q.add(currNode.left);
            if(currNode.right!=null)q.add(currNode.right);
        }
    }

 }
 static int noOfNodes(Node root){
    if(root==null)return 0;
    int x=noOfNodes(root.left);
    int y=noOfNodes(root.right);
    return x+y+1;
 }
 static int sumOfNodes(Node root){
   if(root==null)return 0;
   int x=sumOfNodes(root.left);
   int y=sumOfNodes(root.right);
   return root.data+x+y;
 }
 static int height(Node root){
   if(root==null)return 0;
   int left=height(root.left);
   int right=height(root.right);
   return Math.max(left,right)+1;
 }
static int diameterOfTree(Node root){
   if(root==null)return 0;
   int x=diameterOfTree(root.left);
   int y=diameterOfTree(root.right);
   int height=height(root.left)+height(root.right)+1;
   return Math.max(height,Math.max(x,y));
}
static class TreeInfo{
   int ht;
   int diam;
   TreeInfo(int ht,int diam){
      this.ht=ht;
      this.diam=diam;
   }
}
static TreeInfo diameter2(Node root){
   if(root==null)return new TreeInfo(0,0);
   TreeInfo left=diameter2(root.left);
   TreeInfo right=diameter2(root.right);
   int myHeight=Math.max(left.ht,right.ht)+1;
   int diam1=left.diam;
   int diam2=right.diam;
   int diam3=left.ht+right.ht+1;
   int myDiam=Math.max(diam3,Math.max(diam2,diam1));
   TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
   return myInfo;
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
    Node root=tree.buildTree(nodes);
   
    System.out.println(root.data);
    preOrder(root);
    System.out.println();
    inOrder(root);
    System.out.println();
    postOrder(root);
    System.out.println();
    levelOrder(root);
    // System.out.println();
    System.out.println( noOfNodes(root));
    System.out.println(sumOfNodes(root));
    System.out.println(height(root));
    System.out.println(diameterOfTree(root));
    System.out.println(diameter2(root).diam);
    }
}
