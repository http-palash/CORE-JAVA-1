// javac 6_Advance_patterns.java

class butterfly{
    public static void main(String[] args){
        
        int i;
        int j;

        /*
        ****
        ****
        ****
        ****
        */
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         /*
          *****
          *   *
          *   *
          *   *
          *****
        */
         int n=5;
            for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         n=5;
         for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         n=5;
         for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
            *
            **
            ***
            ****
        */
         n=4;
         for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
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
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
         /* 1
            22
            333
            4444
            55555*/
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        /*     
        54321
        5432
        543
        54
        5*/
        System.out.println();
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        /*
         12345
         1234
         123
         12
         1
        */
        System.out.println();
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
         n=5;
         /*
             1     2     3    4    5
             6     7     8    9
             10    11    12
             13    14
             15
            */
         int c=1;
         for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print("    ");
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
          /*1
            23
            456
            78910
            1112131415*/
        c=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(c);
                c++;
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

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }

        //butterfly pattern
        /*
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        */
         n =5;
         //upper half
         for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
             for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         // lower half
         for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
             for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Solid rhombus
        /*
            
                 *****
                *****
               *****
              *****
             *****
        */
        n=5;
        for(i=1;i<=n;i++){
            //spaces
            for(j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // or
           for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
              1 
             2 2
            3 3 3
           4 4 4 4
          5 5 5 5 5
        */
        for(i=1;i<=n;i++){
            //space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();

        }

        /*
                11
               2112
              321123
             43211234
            5432112345
        */

        for(i=1;i<=5;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*


        */ 
            n=4;
            //upperhalf
            for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
             }
            for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
           }
    }
} 