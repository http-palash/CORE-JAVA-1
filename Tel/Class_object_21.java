// everthing is object and it has some properties 
// every object know something and every object does something
// every object have property and behaviour
//  class is a tempelate or blueprint like a table which have different objects on it 
// jvm creates objects in java
//  jvm says okay its my job to give you a object but you give me a blueprint so we get a class file 
//  this class file is compiled to  create a bytecode and that bytecode goes to jvm that thats where we get a objects
// like in iphone they says designed in california and assesmbled in china
//  so designing is more important then assembluing thats what we are doing here we are designing classes here that would have been assembeled and manufactured by jvm


//  jvm and jre
//  jvm only is needed to run java code on any machine
//  some libraries are needed are in jre 
// jvm is within jre
//  and jre is under jdk
//  so the flow is jvm -> jre -> jdk

class Calculator{
    int a;

    // public int add()
    // {
    //     System.out.println("in add");
    //     return 0;
    // }

    public int add(int x,int y)
    {
        int r = x+y;
        return r;
    }
}




public class Class_object_21{
    public static void main(String[] args){

        // primitive variable float int string etc
        int num1 = 4, num2 = 5;
        // int result = num1+num2;

        // reference variable of class calculator
        Calculator c1;
        c1 = new Calculator();
        int result = c1.add(num1,num2);
        System.out.println(result);
    }
}

//  javac Class_object_21.java
//  java Class_object_21      