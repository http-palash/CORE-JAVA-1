class bike{
    public int speed,gear;
    public bike(int x,int y){
        this.speed = x;
        this.gear = y;
    }
   public String toString()
   {
        return ("Speed "+speed+" Gear : "+gear);
    }
}

class car extends bike
{
    public int light;
    public car(int x,int y,int z)
    {
        super(x,y);
        light = z;
    }
    @Override public String toString()
    {
        return (super.toString()+" light: "+light);
    }
}

class Driver{
    public static void main(String[] args){
        car c = new car(3,4,5);
        System.out.println(c.toString());
        bike b = new bike(8,9);
        System.out.println(b.toString());
    }
}