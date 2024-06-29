// Array List of items of the same type
// Java has zero indexed arrays
// Memory address are in hexadecimal
// cpp me garbage java me null store hoti h default
import java.util.*;

class arr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        // or
        // int marks[] = new int[3];
        marks[0]=97;
        marks[1]=57;
        marks[2]=77;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        int m[]={1,2,3,4,5,6};
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }

        System.out.println("Enter Array size: ");
        int size = sc.nextInt();
        int numbers[]= new int[size];



        for(int i=0;i<size;i++){
            System.out.println("Enter value of Arr{"+i+"}=");
            numbers[i]=sc.nextInt();
        }


        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

        // Searching traverse
        System.out.println("Enter size : ");
        size = sc.nextInt();
        int s[] = new int[size];

        for(int i=0;i<s.length;i++){
            System.out.println("Enter value is s["+i+"]=");
            s[i]=sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int x = sc.nextInt();
        for(int i=0; i<s.length ; i++){
            if(s[i]==x){
                System.out.println("x found at index :"+i);
            }
        }
    }

}