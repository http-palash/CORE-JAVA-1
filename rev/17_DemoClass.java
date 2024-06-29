//  class A{
//         int n;
//         void set(int x){
//             n = x;
//         }
//          void disp(){
//             System.out.println("Value of n is : "+n);
//         }
// }

// class Demo{
//     public static void main(String[] args){

//         A a1 = new A();
//         A a2 = new A();

//         a1.set(20);
//         a1.disp();
//         a2.set(30);
//         a2.disp();
//     }
// }

class ref{
    int n;
    void set(int x){
        n = x;
    }
    void disp(){
        System.out.println(n);
    }
}

class Demo{
    public static void main(String[] args){
        ref obj = new ref();
        obj.set(8);
        obj.disp();
    }
}