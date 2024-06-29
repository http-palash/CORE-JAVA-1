import java.util.Scanner;

class Multiplication{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    System.out.println("Enter first number: ");
    x = sc.nextInt();
    System.out.println("Enter second number: ");
    y = sc.nextInt();
    System.out.println("The sum of these two numbers is : "+(x*y));
    }
}
