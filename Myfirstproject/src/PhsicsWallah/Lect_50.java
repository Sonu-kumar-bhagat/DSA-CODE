import java.util.ArrayList;
import java.util.Arrays;

public class Lect_50 {
    // public static class Student{
    //     String name;
    //     int rno;
    //     double  percentage;

    //     //final key word use
    //     // final String schoolName="NIT SIKKIM";

    //     //use of the static keyword
    //     static int noOfStudents;

    //     //to understand the fraction class
  
    //     //getter and setter
    //     public int getRno(){
    //         return rno;//getter
    //     }
    //     public void setRno(int rno){
    //         this.rno=rno;
    //     }
        
    //     //constructor
    //     public Student(String name,int rno,double percentage){
    //         // name=name;
    //         // rno=rno;
    //         // percentage=percentage;
            
    //         //to remove the problem from above we can use the this keyword
    //         this.name=name;
    //         this.rno=rno;
    //         this.percentage=percentage;
    //         noOfStudents++;
    //     }

    //     //default constructor
    //     public Student(){
    //         noOfStudents++;
    //     }
    //     // public Student(String n,int r,double per){
    //     //     name=n;     //need no t o initialise all the parameters ,can set less also 
    //     //     rno=r;
    //     //     percentage=per;
    //     // }
    // }
    // public static class Car{
    //     String name;
    //     String type;
    //     int price;
    // }
    // static void useInFunction(Car x){
    //     System.out.println(x.name);
    //     System.out.println(x.type);
    //     System.out.println(x.price);
    // }
    // static void change(Car c){
    //     c.name="vegnar";
    // } 
    // static void changeInt(int x){
    //     x=7;
    // }

    
//     // make fraction class
//     public static class Fraction{
//         int num;int den;
//         public Fraction(int num,int den){
//             this.num=num;this.den=den;simplify();
//         }
//         public void simplify(){
//             // if(num<den){
//             //     if(den%num==0){den=den/num;num=1;}
//             // }
//             int hcf=gcd(num,den);
//             num/=hcf;
//             den/=hcf;
//         }
//     }
//     //function for gcd;
//     static int gcd(int a,int b){
//         if(b==0)return a;
//         return gcd(b,a%b);
//     }
//    static Fraction add(Fraction f1,Fraction f2){
//         int nume=f1.num*f2.den+f1.den*f2.num;
//         int deno=f1.den*f2.den;
//         Fraction f3=new Fraction(nume, deno);
//         return f3;
//     }
//     //to store the value
//    static void add2(Fraction f1,Fraction f2){
//         f1.num=f1.num*f2.den+f1.den*f2.num;
//         f1.den=f1.den*f2.den;
        
        
//     }
//    static Fraction multi(Fraction f1,Fraction f2){
//         int num=f1.num*f2.num;
//         int den=f1.den*f2.den;
//         Fraction f3=new Fraction(num, den);
//         return f3;
//     }
 public static class Arraylist{
    int arr[]=new int[2];
    int idx=0;int size=0;
    public void add(int ele){
        if(size==arr.length){
            int brr[]=Arrays.copyOf(arr,arr.length*2);
            arr=brr;
        }
        arr[idx++]=0;size++;}
    public void set(int idx,int val){
        arr[idx]=val;
    }

 }
   public static void main(String[] args) {
    Arraylist arr=new Arraylist();
    arr.add(2);
    arr.add(1);
    System.out.println(arr.size);
    arr.add(3);
    System.out.println(arr.size);
    arr.set(0,5);
    // Fraction f1=new Fraction(3, 7);
    // System.out.println(f1.num+"/"+f1.den);
    // Fraction f2=new Fraction(35,21);
    // // f2.simplify();
    // System.out.println(f2.num+"/"+f2.den);
    // Fraction f3=add(f1,f2);
    // System.out.println(f3.num+"/"+f3.den);
    // add2(f1, f2);
    // System.out.println(f1.num+"/"+f1.den);
    // Fraction f4=multi(f1,f2);
    // System.out.println(f4.num+"/"+f4.den);
    // Fraction f1=new Fraction(3, 21);
    // System.out.println(3+"/"+7);
    // // f1.simplify();
    // System.out.println(f1.num+"/"+f1.den);
    // Fraction f2=new Fraction(7, 3);
    // System.out.println(7+"/"+3);

    // arraylist
    // ArrayList<Integer>list=new ArrayList<>(4);//can fix the size also
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(6);
    // System.out.println(list);
    // Student x=new Student();
    // x.name="sonu";
    // x.rno=66;
    // x.percentage=93.2;
    // System.out.println(x.name);
    // System.out.println(x.rno);
    // System.out.println(x.percentage+3);

    //use of constructor
    // Student s1=new Student("sonu",66,93.2);
    // System.out.println(s1.name);

    //use of final keyword 
    // Student s1=new Student();
    // System.out.println(s1.schoolName);
    // s1.schoolName="jnv";//this line will throw an error

    //use of static keyword
    // Student s1=new Student();
    // System.out.println(s1.noOfStudents);
    // Student s2=new Student();
    // System.out.println(s2.noOfStudents);
    // Student s3=new Student();
    // System.out.println(s3.noOfStudents);

            //use student data type as an array

    // Student data[]=new Student[2];
    // for(int i=0;i<=1;i++){
    //     data[i]=new Student();
    // }
    // data[0].name="sonu";
    // data[0].rno=66;
    // data[0].percentage=93.2;
    // data[1].name="anku";
    // data[1].rno=125;
    // data[1].percentage=78;
    // for(int i=0;i<=1;i++){
    //     System.out.println(data[i].name);
    //     System.out.println(data[i].rno);
    //     System.out.println(data[i].percentage);
    //     System.out.println();
    // }

        // can create multiple class
    
    // Car c1=new Car();
    // c1.name="alto";
    // c1.type="hackblack";
    // c1.price=400000;
    // System.out.println(c1.name);
    // System.out.println(c1.type);
    // System.out.println(c1.price);

        //use the class in a function

    // useInFunction(c1);
    
    //classes are passsed by referece
    // System.out.println(c1.name);
    // change(c1);
    // System.out.println(c1.name);

    //functions are passed by value;
    // int x=5;
    // System.out.println(x);
    // changeInt(x);
    // System.out.println(x);
   }
}
