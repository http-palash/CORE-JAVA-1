
import java.util.*;

class fe{
    //Q1 Average of 3 numbers function
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    //Q2 Sum of all odd numbers from 1 to n
    public static int odd(int n){
     int sum=0;
     for(int i=0;i<=n;i++){
        if(i%2!=0){
            sum = sum+i;
        }
     }
     return sum;
    }
     //Q3 Greater of two numbers
     public static void gn(int x,int y){
         if(x>y){
           System.out.println(x+" is greater then "+y);
         }
         else if(y>x){
            System.out.println(y+" is greater then "+x);
         }

     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 numbers: ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        int average = avg(a,b,c);
        System.out.println("Average of 3 numbers is: "+average);

        System.out.println("Enter range n : ");
        int n = sc.nextInt();
        System.out.println("Sum of 1-n odd numbers is : "+odd(n));

        System.out.println("Enter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        gn(a,b);
    }
}