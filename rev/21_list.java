import java.util.*;

class list{
    Scanner sc = new Scanner(System.in);
    int a[];

    list()
    {
        a = new int[5];
    }

    list(int n)
    {
        a = new int[n];
    }

    list(list objl)
    {
        a = new int[objl.a.length];
    }

    list inc(){
        int nsize;
        System.out.println("enter new size : ");
        nsize = sc.nextInt();

        list temp = new list(nsize);

        for(int i=0;i<this.a.length;i++){
            temp.a[i]=this.a[i];
        }

        System.out.println("\nEnter remaining element: ");
        for(int i=this.a.length;i<nsize;i++){
             temp.a[i]=sc.nextInt();
        }
        return temp;
    }

    list dec(){
        int nsize;
        System.out.println("\nEnter new decreased size : ");
        nsize = sc.nextInt();

        list temp = new list(nsize);

        for(int i=0;i<temp.a.length;i++){
            temp.a[i]=this.a[i];
        }

        // System.out.println("enter remaining element: ");
        // for(int i=this.a.length;i<nsize;i++){
        //      temp.a[i]=sc.nextInt();
        // }
        return temp;
    }

    void read(){
      Scanner sc = new Scanner(System.in);
      System.out.println("\nEnter the Element in the list : ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Enter element "+i+" : ");
            a[i] = sc.nextInt();
        }
    }
    
    void display()
    {
        System.out.println("\nThe Element of the List are : ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"  ");
        }
    }


}

class li
{
    public static void main(String[] args){
      list obj = new list();
      obj.read();
      obj.display();

    //   list n = new list();
      obj = obj.inc();
      obj.display();

      obj = obj.dec();
      obj.display();
    }
}