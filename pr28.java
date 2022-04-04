/*Write a program to calculate the sum of the numbers occurring in the multiplication table of 8 */
import java.util.Scanner;
public class pr28 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter ur number");
        int n=a.nextInt();
        int sum=0;
          for(int i=0;i<=10;i++)
        {
            sum +=n*i;
        
        }
    System.out.println(sum);
    }
}
