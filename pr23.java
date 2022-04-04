/*wap to show the sum of 1st n even numbers usinge loop*/
import java.util.Scanner;
public class pr23 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int sum=0;
        int i;
      for(i=0;i<=n;i++){
            sum=(2*i);
            System.out.println(sum);
      }

    }
}