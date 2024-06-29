import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        int myVal1 = 10;
        int myVal2 = 20;
        System.out.println(1+2);
        System.out.println("Sum of VAl1+VAl2 :"+ myVal1+myVal2);
        System.out.println("Sum of VAl1+VAl2 :"+ (myVal1+myVal2));

        float myVal3 = 20.30f;
        System.out.println(myVal3);

        float val1 = 'a';
        System.out.println(val1);

        float val2 = 'A';
        System.out.println(val2);

        char val3 = 'A';
        System.out.println(val3);

        String mystring = "Palash Bajpai";
        System.out.println(mystring);

        Integer  val4 = 20;
        System.out.println(val4);

        int[] myArray = {1,2,3,4,5,6};

        System.out.println(myArray[0]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray[5]);

        int myArray2[] ={1,2,3};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        int[] myArray3 = new int[5];
        myArray3[0] = 10;
        myArray3[1] = 20;
        myArray3[2] = 30;
        myArray3[3] = 40;

        System.out.println(myArray3[0]);
        System.out.println(myArray3[1]);
        System.out.println(myArray3[2]);
        System.out.println(myArray3[3]);

        System.out.println("\nmyArray3:\n");

        for(int i=0;i<myArray3.length-1;i++){
            System.out.println(myArray3[i]);
        }

        // pre post increment 

        int i = 19;

        System.out.println(++i);
        System.out.println(++i);
        System.out.println(i++);

        ArrayList<Integer> myList =  new ArrayList<Integer>();

        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);
        
        if(myArray[0]<myArray[1]){
            System.out.println("yeahhhh");
        }else{
            System.out.println("nooooo");
        }

        String demo ="abba";
        String demo1 ="abc";

        isPalindrome(demo);
        isPalindrome(demo1);

       }
        public static void isPalindrome(String S)
        {
           String rev = "";
           for(int i=S.length()-1;i>=0;i--){
           rev = rev+S.charAt(i);
        }
        
        if(S.equals(rev)){
            System.out.println("Equal");
            // return 1;
        }else{
            System.out.println("Not Equal");
            // return 0;
        }
    }

}