import java.util.*;

class array
{
    public static void main(String [] args)
    {
        int a[][],r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of row");
        r=sc.nextInt();
        System.out.println("enter col size");
        c = sc.nextInt();
        a = new  int[r][c];
        int b[][] = new  int[r][c];

        System.out.println("enter elements of 2 d araay");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements of array a are: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Elements of array b are: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Multiplication is : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {+
                System.out.print(b[i][j]*a[i][j]+" ");
            }
            System.out.println();
        }

    }
}