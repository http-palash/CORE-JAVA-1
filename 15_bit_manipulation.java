// Get Set Clear Update 
import java.util.*;
class bits{
    public static void main(String[] args){
        //Get bit
        int n = 5; // 0101
        int pos = 2;
        int bitmask = 1<<pos;
        
        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
        n = 5; // 0101
        pos = 3;
        bitmask = 1<<pos;
        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }

        //Set bit
        n = 5;//0101
        pos = 1;
        bitmask = 1<<pos; // 0010

        int newNumber1 = bitmask | n;
        System.out.println(newNumber1);

        int newNumber2 = bitmask & n;
        System.out.println(newNumber2);

        // Clear bit  
        n = 5;//0101
        pos = 2; //0010
        bitmask = 1<<pos; //0100
        int notbitmask = ~(bitmask); //1011
        int newno = notbitmask&n; // 0101
        System.out.println(newno);//0001

        //Update bit 1se0 clear(and and not) ope 0se1 set operation(or)
        Scanner sc = new Scanner(System.in);
        n=5;
        pos=1;
        System.out.println("Enter opertion : ");
        int oper = sc.nextInt();

         bitmask = 1<<pos;
        if(oper==1){
            //set
            int newnumber = bitmask|n;
            System.out.println(newno);
        }else{
            //clear
            int newbitmask = ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println(newno);
        }

    }
}