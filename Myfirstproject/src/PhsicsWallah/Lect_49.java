import java.util.Scanner;

public class Lect_49 {
    
    public static void main(String[] args) {
        //1. declaration

        // String name="sonu kumar bhagat";
        // System.out.println(name);

        //2. input

        // Scanner sc=new Scanner(System.in);
        // String input=sc.next();
        //System.out.println(input); 
        // String s=sc.nextLine();
        // System.out.println(s);

        //3. charAt() and length()

        // String s="sonu";
        // System.out.println(s.length());
        //System.out.println(s.charAt(3));

        //4. bulitin function
        //indexOf() and compareTo()
        // String s="Sonu Kumar Bhagat";
        // int idx=s.indexOf('r');
        // System.out.println(idx);
        // String s="hello";
        // String t="kello";
        // System.out.println(s.compareTo(t));

        //contains(),startsWith() and endsWith()

        // String name="sonu kumar bhagat";
        // System.out.println(name.contains("s"));
        // System.out.println(name.contains("kuma"));
        // System.out.println(name.contains("roll"));
        // System.out.println(name.startsWith("sonu"));
        // System.out.println(name.endsWith("gat"));

        //toLowerCase(),toUpperCase(),concat()

        // String name="Sonu Kumar Bhagat";
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // String na="Sonu Kumar ";
        // String me="Bhagat";
        // System.out.println(na.concat(me));

        //5. String+int/char/String
            // String name="sonukumar";
            // System.out.println(name+"bhaga");
            // name+="bhaga";
            // System.out.println(name);
            // name+='t';
            // System.out.println(name);
            // // name+=86;
            // name=name+10+20;
            // System.out.println(name);
            //*****
            // name=10+20+name;
            // System.out.println(name);

        //6. substring

        // String name="SonuKumarBhagat";
        //System.out.println(name.substring(0,4));
        // System.out.println(name.substring(0,0));
        // for(int i=15;i>=0;i--){
        //     System.out.println(name.substring(i));
        // }
        // for(int i=0;i<name.length()-1;i++){
        //     for(int j=i+1;j<name.length();j++){
        //         System.out.print(name.substring(i,j)+" ");
        //     }
        // }
        // String name="Physics";
        // for(int j=0;j<4;j++){
        //     System.out.print(name.substring(j));
        // }
        // String s="abcd";
        // for(int i=0;i<=3;i++){
        //     for(int j=i+1;j<=4;j++){
        //         System.out.print(s.substring(i,j)+",");
        //     }
        //     System.out.println();
        // }

        //7.interning and new;
            //same value doesnot take the different sapce it is used forthe saving the space
            // String name="sonu";
            // String firstName="sonu";
            // String newName=new String("sonu");
            //immutability means we can not change any letter in any string we can change only by using function
            // int idx=u=i to write soni
            //System.out.println(name.substring(0,3)+'i');
        // interning and new
            // String s="hello";
            // String x="hello";
            // System.out.println(s+" "+x);
            // x="mello";
            // System.out.println(s+" "+x);
            // //   new
            // String y=new String("hello");
            // System.out.println(y);

            //performance 
            // String str="";
            // for(int i=0;i<=10;i++){
            //     str+=i;
            //     str+=" ";
            // }
            // System.out.println(str);

            //== operator and .equals() comparision

            // String name="sonu";
            // String name1="sonu";
            // String name2=new String("sonu");
            // System.out.println(name==name1);
            // System.out.println(name==name2);
            // System.out.println(name1.equals(name2));
               
                //StringBuilder and its function to remove immutibility

                //StringBuilder str=new StringBuilder("Hello");
                // str.append(" world");
                // System.out.println(str);
                // str.setCharAt(1,'y');
                // System.out.println(str);
                // str.append(true);
                // System.out.println(str);
                // str.insert(2,'e');
                // System.out.println(str);
                // str.deleteCharAt(2);
                // System.out.println(str);
                //reverse the string 
                // int i=0,j=str.length()-1;
                // while (i<=j) {
                //     char temp=str.charAt(i);
                //     str.setCharAt(i,str.charAt(j));
                //     str.setCharAt(j,temp); 
                //     i++;j--;
                // }
                // System.out.println(str);
                // str.reverse();
                // System.out.println(str);
                // str.delete(1,3);
                // System.out.println(str);

                //input of a string builder
                // Scanner sc=new Scanner(System.in);
                // StringBuilder str=new StringBuilder(sc.nextLine());
                // System.out.println(str);

                //code to toggle

                // for(int i=0;i<=str.length()-1;i++){
                //     char ch=str.charAt(i);
                //     if(ch==' ')continue;
                //     int asci=(int)ch;
                //     if(asci>=97){asci-=32;char cchar=(char)asci;str.setCharAt(i,cchar);}
                //     else {asci+=32;char schar=(char)asci;str.setCharAt(i,schar);}
                // }
                // System.out.println(str);

                //toggle question using the string concept only
                // Scanner sc=new Scanner(System.in);
                // String str=sc.nextLine();
                // for(int i=0;i<str.length();i++){
                //     char ch=str.charAt(i);
                //     if(ch==' ')continue;
                //     int asci=(int)ch;
                //     if(asci>=97){
                //         asci-=32;
                //         char cchar=(char)asci;
                //        str= str.substring(0,i)+cchar+str.substring(i+1);
                //     }
                //     else {asci+=32;char schar=(char)asci;str=str.substring(0,i)+schar+str.substring(i+1);}
                // }
                // System.out.println(str);

                        //simple way to check whether string is pelindrome or not
                        // Scanner sc=new Scanner(System.in);
                        // String name=sc.nextLine();
                        // StringBuilder name2=new StringBuilder(name);
                        // name2.reverse();
                        // String s=name2+"";
                        // if(name.equals(s))System.out.println("pelindrome");
                        // else System.out.println("not pelindrome");

                        //using two pointer concept o to check pelindrome

                        // Scanner sc=new Scanner(System.in);
                        // String name=sc.nextLine();
                        // int i=0,j=name.length()-1;boolean flag=true;;
                        // while(i<=j){
                        //     if(name.charAt(i)!=name.charAt(j)){flag=false;break;}
                        //     i++;j--;
                        // }
                        // if(flag==true)System.out.println("pelindrome");
                        // else System.out.println("not pelindrome");

                            // no. of pelindrome in substring of the given string

                            // Scanner sc=new Scanner(System.in);
                            // String name=sc.nextLine();
                            // int count=0;
                            // for(int i=0;i<name.length();i++){
                            //     for(int j=i+1;j<=name.length();j++){
                            //         if(isPelindrome(name.substring(i,j))){System.out.print(name.substring(i,j)+"-");
                            //         System.out.println("pelindrome");count++;}
                            //         else {System.out.print(name.substring(i,j)+"-");
                            //         System.out.println("not pelindrome");}
                            //     }
                            // }
                            // System.out.println(count);

                            //reverse words of a sentence

                    // Scanner sc=new Scanner(System.in);
                    // String sentence=sc.nextLine();
                    // String ans="";
                    // StringBuilder sb=new StringBuilder("");
                    // for(int i=0;i<sentence.length();i++){
                    //     if(sentence.charAt(i)!=' '){
                    //         sb.append(sentence.charAt(i));
                    //     }
                    //     else {
                    //         sb.reverse();
                    //         ans+=sb;
                    //         ans+=' ';
                    //         sb=new StringBuilder("");
                    //     }
                    // }
                    // sb.reverse();
                    // ans+=sb;
                    // System.out.println(ans);
                    Scanner sc=new Scanner(System.in);
                    String s=sc.next();
                    String ans=""+s.charAt(0);int count=1;
                    for(int i=1;i<s.length();i++){
                        char curr=s.charAt(i);
                        char past=s.charAt(i-1);
                        if(curr==past)count++;
                        else{if(count>1)ans+=count;count=1;ans+=curr;}
                    }
                    if(count>1)ans+=count;System.out.println(ans);

    }
    //function to check pelindrome
    //    static boolean isPelindrome(String name){
    //     int i=0,j=name.length()-1;
    //     while(i<=j){
    //         if(name.charAt(i)!=name.charAt(j))return false;
    //         i++;j--;
    //     }
    //     return true;
    //    }
}

