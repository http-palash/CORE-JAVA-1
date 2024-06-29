// Strings non primitive datatype
// Scanner is also a non - primitive datatye and sc is its object
// Non primitive types are declared in java using new keyword
import java.util.*;

 class S{
    public static void main(String[] args){
        String name = "Palash";
        String Fullname ="Palash Bajpai";
        String Sentence = "I'm Palash Bajpai";
        Scanner sc = new Scanner(System.in);
        
        // To take full line
        System.out.println("Enter a sentence : ");
        String name2 = sc.nextLine();
        System.out.println("Your Sentence is :"+name2);
        // To take only one name
        System.out.println("Enter a name: ");
        name = sc.next();
        System.out.println("Your name is :"+name);

        // String functions
        String fname = "Palash";
        String lname = "Bajpai";
        String fullname = fname +" @ "+ lname;
        System.out.println("String concetenate function: ");
        System.out.println(fullname);

        System.out.println("Length of fullname:");
        System.out.println(fullname.length());

        //charAt function

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //compare
        String n1 = "Palash";
        String n2 = "Palash";

        //1 s1>s2 : +ve value
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value

        if(n1.compareTo(n2)==0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        n1 ="cello";
        n2 ="zello";
         if(n1.compareTo(n2)<0){
            System.out.println("String n1 < n2");
         }else if(n1.compareTo(n2)>0){
            System.out.println("String n1 > n2");
        }
        // Dont use == operator in java

        n1="Palash";
        n2="Palash";
        if(n1==n2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        // but strings are objects in java there is different functioning of object and variables in java
        if(new String("Tony")==new String("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //Substr

        String sentence="My name is palash";
        // substring(beg index, end index);
        String n3 = sentence.substring(11,sentence.length());
        String n4 = sentence.substring(0,7);
        String n5 = sentence.substring(1);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        // String are immutable
        n5 ="heyy";
        System.out.println(n5);
    }
}