/*wap to find out wheather a student is pass or fail; if it requries total 40% and at least 33% in each 
subject to pass assume 3 subject and take marks an input from the user */
import java.util.Scanner;
public class pr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your s1 mark");
        int s1=sc.nextInt();
        System.out.println("enter your s2 mark");
        int s2=sc.nextInt();
        System.out.println("enter your s3 mark");
        int s3=sc.nextInt();
        int secure=s1+s2+s3;
        float total=(secure/300f)*100f;
        System.out.println("ur percentage is "+total);
        if(s1>33&&s2>33&&s3>33&&total>44)
        {
        System.out.println("you are pass");
        }
        else
        {
        System.out.println("you are fail");
        }
    }
    
}
