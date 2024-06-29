// class Complex{
//     int a,b;
//     Complex(){
//         a=b=0;
//     }
//     Complex(int x){
//         a=b=x;
//     }
//     Complex(int x,int y){
//         a=x;
//         b=y;
//     }
//     Complex(Complex obj){
//         a=obj.a;
//         b=obj.b;
//     }
//     void set(int x ,int y){
//         a=x;
//         b=y;
//     }
//     void disp(){
//         System.out.println(+a+" "+b);
//     }
// }

// class DemoCom{
//     public static void main(String[] args){
//         Complex c1 = new Complex();
//         c1.disp();
//         Complex c2 = new Complex(5);
//         c2.disp();
//         Complex c3 = new Complex(6,3);
//         c3.disp();
//         Complex c4 = new Complex(c2);
//         c4.disp();
//         c4.set(8,9);
//         c4.disp();
//     }
// }

class Complex
{
  int a,b;

    Complex()
    {
        a=b=0;
    }
    Complex(int x)
    {
       a=b=x;
    }
    Complex(int x,int y)
    {
        a=x;
        b=y;
    }
    Complex(Complex obj)
    {
        a=obj.a;
        b=obj.b;
    }
    Complex Addition(Complex obj){
        Complex temp = new Complex();
        temp.a = a+obj.a;
        temp.b = b+obj.b;
        return temp;
    }
    Complex Subtraction(Complex obj){
        Complex temp = new Complex();
        temp.a = a-obj.a;
        temp.b = b-obj.b;
        return temp;
    }

    void set(int x,int y)
    {
        a=x;
        b=y;
    }
    void disp()
    {
        System.out.println(+a+" "+b);
    }
}
class Demo{
    public static void main(String[] args)
    {
       Complex c1 = new Complex();
       c1.disp();
   
       Complex c2 = new Complex(5);
       c2.disp();
       Complex c3= new Complex(6,4);
       c3.disp();
       Complex c4 = new Complex(c2);
       c4.disp();
       
       c4.set(7,8);
       c4.disp();
       
       Complex c5 = c2.Addition(c3);
       c5.disp();
       
       c5 = c2.Subtraction(c3);
       c5.disp();


    }
}