import java.util.Scanner;

class Swap{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1,n2,temp;
    System.out.print("Enter first number: ");
    n1 = sc.nextInt();
    System.out.print("Enter second number: ");
    n2 = sc.nextInt();

    // a.show();
   // System.out.println("The numbers are   "+n1+" "+n2);

    // temp = n1;
    // n1 = n2;
    // n2 = temp;

   // System.out.println("The swapped number is "+n1+" "+n2);
    ch(n1,n2);
    // show();
    }

     
    public static void ch(int x,int y)
   {  
     int temp;
     temp = x;
     x = y;
     y = temp;
     show(x,y);    
    }

    public static void show(int x,int y)
    {
        System.out.println("numbers are "+x+" "+y);
    }
}

