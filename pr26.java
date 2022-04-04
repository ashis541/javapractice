//wap to print the multiplication table of n numbers in reverse order
import java.util.Scanner; 
public class pr26 {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for(int i=10;i>0;i--)
        {
            
            System.out.println(n+"X"+i+"="+n*i);
        }

    }
}
