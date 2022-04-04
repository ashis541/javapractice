 /*wap to the sum of 1st n odd numbers using while loop*/
import java.util.Scanner;
public class pr24 {
    public static void main(String[] args) {
     

 Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int sum=0;
        int i=0;
      while(i<n)
      {
         sum=sum+1+(2*i);
        i++; 
      }
      System.out.println(sum);
      }
  
    }

