
import java.util.Scanner;

class Mylist
{
    int a[];

    Scanner input = new Scanner(System.in);

    Mylist()
    {
        a = new int[5];
    }

    Mylist(int n)
    {
        a = new int[n];
    }

    Mylist(Mylist l)
    {
        a = new int[l.a.length];

        for(int i = 0; i < l.a.length; i++)
        {
            this.a[i] = l.a[i];
        }
    }

    void read()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the Element in the list : ");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print("\nEnter element "+i+" : ");
            a[i] = input.nextInt();
        }
        input.close();
    }

    void display()
    {
        System.out.println("\nThe Element of the List are : ");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
     Mylist insert(){
     int v, pos;
        Mylist tmp = new Mylist(this.a.length + 1);

        for(int i = 0; i < this.a.length; i++)
            tmp.a[i] = this.a[i];

        System.out.print("\nEnter the value to insert : ");
        v = input.nextInt();

        System.out.print("\nEnter the possition to insert on : ");
        pos = input.nextInt();

        for(int i = this.a.length; i >= (pos-1); i--)
            tmp.a[i] = tmp.a[i-1];
        
        tmp.a[pos-1] = v;

        return tmp;
    }

}

class l{
    public static void main(String[] args){
        Mylist li = new Mylist();
        li.read();
        li.display();
    }
}
