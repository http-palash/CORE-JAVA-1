import java.util.Scanner;

class Aor{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float length,width;
    System.out.println("Enter first number: ");
    length = sc.nextFloat();
    System.out.println("Enter second number: ");
    width = sc.nextFloat();
    System.out.println("The Area of rectangle "+length+" and height "+width+" is : "+ (length*width)); 
    }
}
