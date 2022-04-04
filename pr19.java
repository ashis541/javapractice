/*wap to find wheather a year is a leap year or not where the year is entered by the user */
import java.util.Scanner;
public class pr19 {
   public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      System.out.println("enter a year to check wheather the year is a leap year or not");
      int yr=a.nextInt();
      if(yr%4==0)
      {
         System.out.println(yr+" is a leap year");
      }
       else if(yr%400==0)
       {
         System.out.println(yr+" is a leap year");
       }
       else if(yr%100==0)
       {
         System.out.println(yr+" is not a leap year");
       }
       else
       {
         System.out.println(yr+" is not a leap year");
       }
   } 
}
