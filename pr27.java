//find the factorial of n number
import java.util.Scanner;
public class pr27 {
        public static void main(String[] args) {
            Scanner a=new Scanner(System.in);
            int n=a.nextInt();
            int b=1;
            for(int i=n;i>0;i--){
               b=b*i;
               
            }
            System.out.println(b);
        }
}
