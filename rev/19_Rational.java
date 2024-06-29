class Rational{

    int p,q;

    Rational(){
        p=q=1;
    }
    Rational(int x){
        p = x;
        q = 1;
    }
    Rational(int x,int y){
        p = x;
        if(y==0){ 
          q=1;
        }
        else{
            q=y;
        }
    }
    Rational(Rational obj){
         p = obj.p;
         q = obj.q;
    }
    Rational Addition(Rational obj)
    {
        Rational temp = new Rational();
        temp.p = p+obj.p;
        temp.q = q+obj.q;
        return temp;
    }
    Rational Subtraction(Rational obj)
    {
        Rational temp = new Rational();
        temp.p = p-obj.p;
        temp.q = q-obj.q;
        return temp;
    }

    void set(int x,int y){
        p = x;
        q = y;
    }
    void display(){
        System.out.println(p+"/"+q);
    }

}

class  DemoRat{

    public static void main(String[] args){
        Rational r1 = new Rational();
        Rational r2=new Rational(5);
        Rational r3=new Rational(6,0); 
        Rational r4=new Rational(r3);
        Rational r5 = r3.Addition(r1);
        r5 = r3.Subtraction(r1);
        r5.display();

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();

    }

}