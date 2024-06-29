import java.util.*;
class Table1 {
public static void main(String[] args)
{
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number : ");
  int a = in.nextInt();
  for(int i=1;i<=10;i++)
  {
    int b = a;
    for(int j=1;j<=3;j++)
    {
      System.out.print(b+" * "+i+" = "+ b*i+"\t");
      b++;
    }
    System.out.println();
  }
}

}