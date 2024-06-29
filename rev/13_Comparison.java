import java.util.Scanner;

class Comparison{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float n1,n2,n3;
    System.out.println("Enter first number: ");
    n1 = sc.nextFloat();
    System.out.println("Enter second number: ");
    n2 = sc.nextFloat();
    System.out.println("Enter third number: ");
    n3 = sc.nextFloat();

    if(n1>n2 && n1>n3)
    {   
     System.out.println("Number "+n1+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }
    else if(n2>n3){
     System.out.println("Number "+n2+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }
    else{
     System.out.println("Number "+n3+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }

    float great;
    Comp c = new Comp();
    great = c.Greatest(6,3,2);
    System.out.println("Greatest number is this is main class :"+ great);
    }
}

class Comp{
    float Greatest(float n1,float n2,float n3){
    if(n1>n2 && n1>n3)
    {   
        return n1;
    //  System.out.println("Number "+n1+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }
    else if(n2>n3){
            return n2;
    //  System.out.println("Number "+n2+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }
    else{
            return n3;

    //  System.out.println("Number "+n3+" is Greatest among all "+n1+" "+n2+" "+n3); 
    }
    }
}
