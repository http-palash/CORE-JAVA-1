import java.util.*;
class loop{
    public static void main(String[] args){
        System.out.println("Hello world");

        for(int counter=0;counter<100;counter++){
            System.out.println("Hello world");
        }
        
        System.out.println("Enter a number:");
        Scanner sc = new Scanner (System.in);
        int n;
        for(int counter=0;counter<100;counter++){
           n = sc.nextInt();
           System.out.println("Enter 10 to break loop");
           if(n==10)
           {
            break;
           }
        }

        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

        System.out.println("While loop : ");
        int i;
        i=0;
        while(i<11)
        {
            System.out.println(i);
            i++;
        }

        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i==0);

        // Sum of series
        int sum = 0;
        System.out.println("Enter last series of number : ");
         n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(i);
            sum = sum+i;
            if(i<n){
            System.out.print("+");
            }
        }
        System.out.print("=");
        System.out.print(sum);

        // Table of a number
        System.out.println("\nEnter a number : ");
        n = sc.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.print(n);
            System.out.print("*");
            System.out.print(i);
            System.out.print("=");
            System.out.println(i*n);
        }
    }
}