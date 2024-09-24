
import java.util.Scanner;

public class chap5{ 
    public static void main(String[] args) {    
    System.out.println("taking inputfrom the user");
Scanner sc = new Scanner(System.in);
System.out.println("enter number 1");
int a = sc.nextInt();
System.out.println("enter the number 2");
int b = sc.nextInt();
int sum = a+b;
System.out.print("sum the two input=");
System.out.println(sum);
// String str = sc.next();
// System.out.println(str);
String stri = sc.nextLine();
System.out.println(stri);
}

}