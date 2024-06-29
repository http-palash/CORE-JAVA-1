import java.util.Scanner;

class func{

    void Add(float x,float y){
    System.out.println("The sum of these two numbers is : "+(x+y));
    }

}

class Addition{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // creating scanner class  object
    func a = new func(); //creating func class object
    a.Add(3,5);    // calling function

    float x,y; // defining variable
    System.out.println("Enter first number: ");
    x = sc.nextInt(); 
    System.out.println("Enter second number: ");
    y = sc.nextInt();
    a.Add(x,y);
    }
}
