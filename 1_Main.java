import java.util.*;
 class Main{
    public static void main(String[ ] args)
    {
        System.out.print("Hello world with java\n");
        System.out.println("Hello world with java");
        System.out.print("Hello world with java");
        System.out.print("Hello world with java");
        System.out.print("\nBreaking \n line\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        String name = "Palash";
        int age = 19;
        int a = 1;
        double price = 100.01;
        // 8 primitive datatypes - byte short char boolean int double float long
        // 5 non primmitive string array class object interface
        int sum = age +a ;
        int diff = sum - a ;
        System.out.println(sum);
        System.out.println(diff);

        a = 2;
        int b = 4;
        int mul = a*b;
        System.out.println(mul);

        a=10;
        b=5;

        int ans = a*b/a-b;
        System.out.println(ans);
        
        ans = (a*b)/(a-b);
        System.out.println(ans);
    }
}



// conditionals = if,else,switch,break
 class a{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int aa = a.nextInt();
        System.out.println(aa);
    }
}