// Java is 0 indexed language
// size of 2d array = rows*cols*4bytes for an int type array

import java.util.*;

class twod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                System.out.println("Enter value for : a["+i+"]["+j+"]:");
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
              System.out.println("number["+i+"]["+j+"]is : "+numbers[i][j]);
            }
        }
        // or best way to print
                for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
              System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        // to search a number in user defined array in java
        System.out.println("Enter rows and cols: ");
        rows = sc.nextInt();
        cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        System.out.println("Enter values in array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // printing array
        System.out.println("Printing array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter value to search in array : ");
        int search = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(search==a[i][j]){
                    System.out.println("Element "+search+" is found at index a["+i+"]["+j+"]");
                }
            }
        }

    }
}