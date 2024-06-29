// javac Methods_in_java_22.java
// java Methods_in_java_22

class Computer{

    public void playMusic(){
        System.out.println("Music playing....");
    }

    public String getMeAPen(int cost){

        // if(cost>9){
        //  return "Pen costs "+ cost + "rs";
        // }
        // else{
        //     return "Pen not comes under " +cost+"rs";
        // } or
        if(cost>9){
          return "Pen costs "+ cost + "rs";
        }
        
        return "Pen not comes under " +cost+"rs";
        
    }
}

public class Methods_in_java_22{
    public static void main(String[] args){

        Computer obj = new Computer();
        obj.playMusic();

       String result = obj.getMeAPen(10);
       System.out.println(result);

       result = obj.getMeAPen(7);
       System.out.println(result);
    }
}