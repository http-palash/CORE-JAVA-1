//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  

//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  

class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  

//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
Circle c=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
c.draw();  
Rectangle r=new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()  
r.draw();  

}}  