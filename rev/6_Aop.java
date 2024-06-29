import java.util.Scanner;

class Aop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float base,height;
    System.out.println("Enter first number: ");
    base = sc.nextFloat();
    System.out.println("Enter second number: ");
    height = sc.nextFloat();
    System.out.println("The Area of parallelogram "+base+" and height "+height+" is : "+ (base*height)); 
    }
}
