import java.util.*;

// Q1 Take an array of names as input from the usser and print them on the screen
class ar{
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of name array: ");
     int size = sc.nextInt();
        String names[] = new String[size];
        
        //input
        for(int i=0;i<size;i++){
         System.out.println("Enter name : ["+i+"]");
            names[i]=sc.next();
        }
        //output
        System.out.println("Names are: ");
        for(int i=0;i<names.length;i++){
            System.out.println("name["+i+"] ="+names[i]);
         }
        // Q2 
         System.out.println("Enter size : ");
         size = sc.nextInt();
         int arr[] = new int[size];

         for(int i=0;i<arr.length;i++){
            System.out.println("Enter value of arr["+i+"]");
            arr[i]=sc.nextInt();
         }

         int min = Integer.MIN_VALUE;
         int max = Integer.MAX_VALUE;

         System.out.println(min);
         System.out.println(max);
         for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
         }
            System.out.println("Greatest number in arr is : "+max+"\nSmallest number is : "+min);
         // Q3 
         System.out.println("Enter size : ");
         size = sc.nextInt();
         
         //input
         int arr1[] = new int[size];
         for(int i=0;i<arr1.length;i++){
            System.out.println("Enter value of arr["+i+"]");
            arr1[i]=sc.nextInt();
         }         
         boolean ascending = true;
         for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]>arr1[i+1]){
                ascending = false;
            }        
         }   
         if(ascending){
            System.out.println("Array is in ascending order");
         }else{
            System.out.println("Array is in descending order");
         }      

    }
}