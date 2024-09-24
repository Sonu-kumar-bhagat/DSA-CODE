// class Student{
//  int rollNo;
//     String studentName;
// }

import java.util.Scanner;

class Algebra{
    int a;
    int b;

    Algebra(int x, int y){
        System.out.println("constructor of this class is called");
         a=x;
        b=y;
    }
 int add(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class Main {
//   static int add(int a,int b){
//         int ans=a+b;
//         return ans;
//     }
    public static void main(String[] args) {
        // Student obj1=new Student();
        // obj1.rollNo=1;
        // obj1.studentName="rohan";
        // System.out.println(obj1.rollNo);
        // System.out.println(obj1.studentName);
        // Student obj2= new Student();
        // obj2.rollNo=2;
        // obj2.studentName="sonu";
        // System.out.println(obj2.rollNo);
        // System.out.println(obj2.studentName);
        // Scanner in=new Scanner(System.in);
        // int x=in.nextInt();
        // int y=in.nextInt(); 
    //   Algebra obj=new Algebra();
        // System.out.println(obj.add(x, y));

        // System.out.println(Math.sqrt(24));
        // System.out.println(Math.sqrt(16));

        // System.out.println(Math.floor(5.7));
        // System.out.println(Math.floor(7.7));

        // System.out.println(Math.ceil(8.9));
        // System.out.println(Math.ceil(7.1));
         Algebra obj=new Algebra(5,7); 
         System.out.println(obj.add());
         System.out.println(obj.sub());
         System.out.println(obj.mul());

         Algebra obj1=new Algebra(10,7);
          System.out.println(obj1.add());
         System.out.println(obj1.sub());
         System.out.println(obj1.mul());
    }
}
