import java.util.Scanner;

class SI
{
 public static void main(String [] abc)
{
 int p=100,r=10,t=5;
 Scanner jin = new Scanner (System.in);
 System.out.print("Enter p: ");
 p=jin.nextInt();
 System.out.print("Enter r: ");
 r=jin.nextInt();
 System.out.print("Enter t: ");
 t=jin.nextInt();
 System.out.println("Simple interest of rs "+p+" at rate "+r+" in time "+t+" is:"+(p*r*t)/100);
 }
}