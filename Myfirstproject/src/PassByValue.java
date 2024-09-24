public class PassByValue {

    static void changeValue(int a){
        a*=100; 
        System.out.println("inside the value " + a);
    }
    public static void main(String[] args) {
        int a=10;

System.out.println("before changimg value  "+ a);
changeValue(a);
System.out.println("after changing value  " + a);
    }
}
