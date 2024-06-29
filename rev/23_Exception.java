//program to print the exception information using printStackTrace() method

import java.io.*;

class Exc{
	public static void main (String[] args) {
	int a=5;
	int b=0;
		try{
		System.out.println(a/b);
		}
	    catch(ArithmeticException e){
		// e.printStackTrace();
		System.out.println(e.toString());
         System.out.println(e.getMessage());
        System.out.println("Exception divided by zero");

	}
	}
}
//program to print the exception information using toString() method

// import java.io.*;

// class GFG1 {
// 	public static void main (String[] args) {
// 	int a=5;
// 	int b=0;
// 		try{
// 		System.out.println(a/b);
// 		}
// 	catch(ArithmeticException e){
// 		System.out.println(e.toString());
// 	}
// 	}
// }

