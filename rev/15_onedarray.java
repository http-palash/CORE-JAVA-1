// import java.util.*;

// class One_D_Array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a[],n;
//         System.out.println("Enter the size of the array : ");
//         n = sc.nextInt();;
//         a = new int[n];

//         for(int i = 0;i<a.length;i++){
//             System.out.print("Enter the a["+i+"] element of array: ");
//             a[i] = sc.nextInt();
//         }

//         // Printing array
        
//         for(int i = 0;i<a.length;i++){
//             System.out.println("a["+i+"]:"+a[i]);
//         }


//     }
// }

// import java.util.*;

// class oned{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a[],size;
//         System.out.println("enter size: ");
//         size = sc.nextInt();
//         a = new int[5];

//         System.out.println("Enter "+a.length+" elements of array: ");
//         for(int i=0;i<a.length;i++){
//             a[i]=sc.nextInt();
//         }

//         System.out.println("Elements of array are : ");
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]);
//         }
//     }
// }
import java.util.*;
class ab
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size,a[];
        System.out.println("enter size of array");
        size=sc.nextInt();
        a=new int[size];
        int b[] =new int[size];
        System.out.println("enter elements of array");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("elements of array are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
