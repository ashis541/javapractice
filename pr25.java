//wap to print the multiplication table of n numbers
import java.util.Scanner;   
public class pr25 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for(int i=0;i<=10;i++)
        {
            
            System.out.println(n+"X"+i+"="+n*i);
        }

    }
}
