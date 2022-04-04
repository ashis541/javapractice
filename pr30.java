/*wap to display like using for loop {****
                                      ***
                                      **
                                      *}*/

import java.util.Scanner;                      
 public class pr30 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("enter ur number");
        int n=a.nextInt();
        int i=1;
        while(i<=n){//outer while loop
            int j=1;
            while(j<=i){//inner while loop
                System.out.print("*");
                 j++;
        }
        System.out.println();
        i++;
   }           
   }

        }
        
    
