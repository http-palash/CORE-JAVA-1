class B{
 public static void sum(int x,int y){
    int sum = x+y;
    show(sum);
 }
 public static void show(int x){
    System.out.println("Sum is : "+x);
 }
 public void key(){
    System.out.println("this is key");
    lock();
 }
 private void lock(){
    System.out.println("lock accessed...");
 }

}


class A{

  public static void sum(int x,int y){

    int sum = x+y;
    show(sum);
    B obj = new B();
    obj.key();
   //  obj.sum(8,9);
    // obj.show(10);
    key();
  }
   public static void key(){
    System.out.println("this is key  method sibling of main method");
 }

  public static void show(int x){
    System.out.println("Sum is : "+x);
  }

  public static void main(String[] args)
  {
    // B obj = new B();
    // obj.sum(4,5);
    sum(8,4);
  }
  

}