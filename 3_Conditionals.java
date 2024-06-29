// javac 3_conditionals.java
// java conditionals
import java.util.*;
class conditionals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    // // Age 
    // int age;
    // System.out.println("Enter age"); 
    // age = sc.nextInt();
    // if(age>18)    {
    //     System.out.println("Adult");
    // }else{
    //     System.out.println("Not adult");
    // }

    // // Even odd

    // int number;
    // System.out.println("Enter a number");
    // number=sc.nextInt();
    // if(number%2==0){
    //     System.out.println("Number is even");
    // }
    // else{
    //         System.out.println("Number is odd");
    //     }

    // //  Greater equal less than greater then
    // System.out.println("Enter three numbers");
    // int n1 = sc.nextInt();
    // int n2 = sc.nextInt();
    
    // if(n1==n2){
    //     System.out.println("n1 is equal to n2");
    // }
    // else if(n1>n2) {
    //  System.out.println("n1 is greater then n2");
    // }
    // else if(n1<n2){
    //     System.out.println("n1 is lesser than n2");
    // }

    // // hello namaste bonjour
    int button;
    System.out.println("Enter 1 for Hello 2 For Namaste 3 For bonjour");
    button = sc.nextInt();
    // if(button==1)
    // {
    //     System.out.println("Hello");
    // }else if(button == 2){
    //     System.out.println("Namaste");
    // }else if(button == 3){
    //     System.out.println("Bonjour");
    // }
         
    switch(button)
    {
        case 1: System.out.println("Hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("Bonjour");
        break;
        default : System.out.println("Enter valid input");
    }

    
    }
}
