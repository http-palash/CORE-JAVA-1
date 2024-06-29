import java.util.Scanner;

class Aoc{
    public static void main(String[] args){
    double pi = 3.14,area;    
    float r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius: ");
    r = sc.nextFloat();
    area = 2*pi*r;
    System.out.println("The sum of these two numbers is : "+area);
    System.out.println("The sum of these two numbers is : "+(2*pi*r));
    }
}
