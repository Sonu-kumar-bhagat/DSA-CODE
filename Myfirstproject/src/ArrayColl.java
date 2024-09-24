import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
    
public class ArrayColl {
    static void reverseArrayList(ArrayList<Integer>list){
        int i=0,j=list.size()-1;
        while(i<j){
           Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        // Integer i= Integer.valueOf(4);
        // System.out.println(i);
        // Float f=Float.valueOf(4.5f);
        // System.out.println(f);
    //    ArrayList<Integer>l1=new ArrayList<>();
    //    ArrayList<Boolean>y=new  ArrayList<>();
    //    ArrayList<Float>s=new  ArrayList<>();
    //    l1.add(5);
    //    l1.add(6);
    //    l1.add(7);
    //    l1.add(8);
    //    System.out.println(l1.get(1));
    //    System.out.println(l1);
    //    for(int i=0;i<l1.size();i++){
    //     System.out.println(l1.get(i));
    //    }
    // l1.add(1,100);
    // System.out.println(l1);
    // l1.set(1,10);
    // System.out.println(l1);
    // l1.remove(1);
    // System.out.println(l1);
    // l1.remove(Integer.valueOf(7));
    // System.out.println(l1);
    // System.out.println(l1.remove(Integer.valueOf(7)));
    // System.out.println(l1);
    // System.out.println(l1.remove(Integer.valueOf(60)));
        // boolean ans=l1.contains(Integer.valueOf(60));
        // System.out.println(ans);
        // ArrayList l= new ArrayList<>();
        // l.add("sonu");
        // l.add(66);
        // l.add(true);
        // System.out.println(l);
    

    //  ArrayList<Integer>list=new ArrayList<>();
    //  list.add(0);
    //  list.add(10);
    //  list.add(3);
    //  list.add(5);
    //  list.add(22);
    //  list.add(100);
    //  System.out.println("Original list "+list);
    // //  reverseArrayList(list);
    //  Collections.reverse(list);
    //  System.out.println("reversed list  "+list);
    //  Collections.sort(list);
    //  System.out.println("ascending order"+ list);
    //  Collections.sort(list,Collections.reverseOrder());
    //  System.out.println("Decre order"+list);
    

    ArrayList<String>ls=new ArrayList<>();
    ls.add("welcome");
    ls.add("to"); 
    ls.add("NIT");
    ls.add("SIKKIM ");
    System.out.println("original string  "+ls);
        Collections.sort(ls);
    System.out.println("sorted string  "+ls);
    Collections.sort(ls,Collections.reverseOrder());
        System.out.println("decre"+ls);

    }

}
