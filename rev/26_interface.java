// interface printable{  
// void print();  
// }  

// class demo implements printable{  
//     public void print()
//     {
//         System.out.println("Hello");
//     }  

//     public static void main(String args[])
//     {  
//         demo obj = new demo();  
//         obj.print();  
//     }  
// }  

interface printable{  
void print();  
}  

class demo implements printable{  
    public void print()
    {
        System.out.println("Hello");
    }  
}

class TestInterface{
    public static void main(String args[])
    {  
        demo obj = new demo();  
        obj.print();  
    }  
}  