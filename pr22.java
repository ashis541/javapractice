/*wap to the sum of 1st n even numbers using while loop*/
import java.util.Scanner;
public class pr22 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int sum=0;
        int i;
      for(i=0;i<=n;i++){
            sum=sum+(2*i);
            System.out.println(sum);
      }

    }
}
