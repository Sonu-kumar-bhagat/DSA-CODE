        import java.util.Arrays;
    import java.util.Scanner;
        class ArraysExamples{

    void countOfOccurances(int array[],int x){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
    count++;
            }
        }
        System.out.println(count); ;
    }

    static void changeArray(int array[]){
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }
    }


            static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
        }
        System.out.println();
            }



        void input(){
            System.out.println("enter the size of the arry");;
        int n,x;
        Scanner in =new Scanner(System.in);
            n=in.nextInt();
             x=in.nextInt();
            int array[]=new int[n];
            System.out.println("enter the all the elements of the array");
            for(int i=0;i<array.length;i++){
                array[i]=in.nextInt();
            }


        System.out.println(" original array ");
        printArray(array); 
            // int array_2[]=array;
            // int array_2=array.clone();
            // int array_2[]=Arrays.copyOf(array,array.length);
            // int array_2[]=Arrays.copyOf(array,2);
            int array_2[]=Arrays.copyOfRange(array,0,array.length);
            System.out.println(" coppied array");
        printArray(array_2);
        array_2[0]=0;
        array_2[1]=0;
        System.out.println("original array after changing value");
        printArray(array);
        System.out.println("array_2 after changing the value");
        printArray(array_2);
        

        }


        void search(){
            int array[]={1,5,8,6,7,8,2};
        int x=20;
        int ans=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                ans=i;
                break;
            }   
        }
        if(ans==-1){
            System.out.println("not found");
        }
        else
        System.out.println(ans);

        }



        void maxOfArray(){
            int array[]={1,2,3,4,18,5,6,7,8,9};
            int ans=0;
            for(int i=0;i<array.length;i++){
                if(array[i]>ans){
                    ans=array[i];
                }
            }
            System.out.println(ans);
        }



            void sumOfArray(){
                int array[]={1,2,3,4};
                int sum=0;
                for(int i=0;i<array.length;i++){
                    sum+=array[i];
                }
                System.out.println(sum);
            }

        void multiDimen(){
            int [][]array_1 = new int[2][3];
            int [][]array = {{2,3,4},{5,6,7},{8,9,2}};
            int [][][]array_3=new int[1][2][3];
            array_3[0][0][0]=3;

            // System.out.println(array[0][0]);
            // System.out.println(array[0][1]);
            // System.out.println(array[0][2]);
            // System.out.println(array[1][0]);
            // System.out.println(array[1][1]);
            // System.out.println(array[1][2]);
            // System.out.println(array_3[0][0][0]);
            // System.out.println("array lenth" + array_1.length);

            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.println(array[i][j]);
                }
            }
            
        }


            void demoArrays(){
        int  ages []= new int [3];
        float weights[]=new float[3];
        String names[] = {"rahul","raj","aaradhya"};
        ages[0]=25;
        ages[1]=35;
        ages[2]=40;
        // ages[5]=45;
        // ages[-2]=20; 

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);
        for(int i=0;i<ages.length;i++){
        System.out.println(ages[i]);
        }
        for(int age:ages){
            System.out.println(age);
        }
        int i=0;
        while(i<ages.length){
        System.out.println(ages[i]);
        i++;
        }
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);

            }
        }
        public class Arrays1 {
            
            public static void main(String[] args) {
                ArraysExamples obj = new ArraysExamples();
        // obj.demoArrays();
        // obj.multiDimen();
        // obj.sumOfArray();
        // obj.maxOfArray();
        // obj.search();
        // obj.input();
        // int array[]={1,2,3};
        // obj.printArray(array);
        // obj.changeArray(array);
        // obj.printArray(array);
   System.out.println("enter the size of the arry");;
        int n,x;
        Scanner in =new Scanner(System.in);
            n=in.nextInt();
            System.out.println("enter the comparing value");
             x=in.nextInt();
            int array[]=new int[n];
            System.out.println("enter the all the elements of the array");
            for(int i=0;i<array.length;i++){
                array[i]=in.nextInt();
            }
            obj.countOfOccurances(array, x);
            }
        }
