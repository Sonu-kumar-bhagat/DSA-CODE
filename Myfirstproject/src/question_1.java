import java.util.Scanner;

// import javax.sound.midi.SysexMessage;

public class question_1 {

  void repeatFir(int array[]){
    int ans=-1;
    for(int i=0; i<array.length-1;i++){
        for(int j=i+1; j<array.length;j++){
            if(array[i]==array[j]){
                ans=array[i];
                 break;
            }          
        }
    }
    System.out.println(ans);
      }

    void findMax(int array[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>ans){
                ans=array[i];
            }
        }
        // System.out.println(ans);
        for(int i=0;i<array.length;i++){
            if(array[i]==ans){
                array[i]=Integer.MIN_VALUE;
            }
        }
         ans=Integer.MIN_VALUE;
         for(int i=0;i<array.length;i++){
            if(array[i]>ans){
                ans=array[i];
            }
        }
        System.out.println(ans);
    }

   
    void unique(int array[]){
        int ans=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                ans=array[i];
            }
        }
        System.out.println(ans);
    }
    



    void triplet(int array[]){
        System.out.println("enter the target sum");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k=j+1; k<array.length;k++){
                    if(array[i]+array[j]+array[k]==n)
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    void targetSum(int array[]){
        Scanner in=new  Scanner(System.in);
        System.out.println("enter the target sum");
        int n=in.nextInt();
        int ans=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==n){
                    ans++;
                }
            }
        }
        System.out.println("no of pairs "+ ans);
    }    
    public static void main(String[] args) {
        question_1 obj=new question_1();
       System.out.println("enter the size of the array");
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
        int array[]=new int[n];
        System.out.println("enetr the all elements");
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
    //    obj.triplet(array);
        // obj.targetSum(array);
        // obj.unique(array);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // obj.findMax(array);
        obj.repeatFir(array);
    }
}
