import java.util.*;
class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
              System.out.print("*");
            }
            System.out.println();
        }

     System.out.println();
     // Hollow rectangle

     int n = 4;
     int m = 4;
        
        for(int i=1;i<=n;i++){       
        for(int j=1;j<=m;j++){
            if(i==1||j==1||i==m||j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
         }
         System.out.println();
        }


        System.out.println();
      /*
      *
      **
      ***
      ****
      *****
      */ 
       
       int i;
       int j ;

       for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }


        System.out.println();

       for(i=5;i>=1;i--){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }

        System.out.println();

            /*
                *
                **
                ***
                ****
            */
        //outer loop
        for(i=1;i<=4;i++){

            //space loop
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Star loop
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
          1
          12
          123
          1234
          12345
        */
        // System.out.println("Enter a number for pyramid : ");
        // n = sc.nextInt();
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        1
        22
        333
        4444
        */
        // System.out.println("Enter a number for pyramid : ");
        // n = sc.nextInt();
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        /*
            12345
            1234
            123
            12
            1
        */
        n=5;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Floyd's triangle
        /*
          1
          23
          456
          78910
          1112131415
        */

        n=5;
        int number = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
             System.out.print(number);
             number++;
            }
            System.out.println();
        }

        /*
        1
        01
        101
        0101
        10101
        */
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                System.out.print("0");
                }

            }
            System.out.println();
        }

    }
}