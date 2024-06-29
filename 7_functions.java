import java.util.*;
//Java function written in camelcase 
// function called directly
// methods called by object of class
class functions{
    //return name function
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void p(String args){
        System.out.println(args);
        return;
    }
    // calculate sum
    public static int csum(int a , int b){
        int sum = a+b;
        return sum;
    }
    // multiply two numbers
    public static int cmul(int a , int b){
        return a*b;
    }
    // Factorial of a number
    public static int fact(int n){
        System.out.println(n);
        if(n<0){
            System.out.println("Invalid number: ");
        }
        int fact = 1;;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Output : ");
        printMyName(name);

        System.out.println("Enter name: ");
        String p = sc.next();
        System.out.println("Output : ");
        p(p); 


        int sum = csum(12,10);
        System.out.println("Sum of 2 number is : "+sum);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = csum(a,b);
        System.out.println("Sum of 2 number is : "+sum);
        
        System.out.println("Enter two numbers: ");
        
         a = sc.nextInt();
         b = sc.nextInt();
         int  mul = cmul(a,b);
         System.out.println("Sum of 2 number is : "+mul);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial of a number is : "+fact(n));
    }

}