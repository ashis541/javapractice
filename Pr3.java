//calculate cgpa of 5 subject where marks re input through keyboard
import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter your sub1");
        int s1= sc.nextInt();
        System.out.println("enter your sub2");
        int s2= sc.nextInt();
        System.out.println("enter your sub3");
        int s3= sc.nextInt();
        System.out.println("enter your sub4");
        int s4= sc.nextInt();
        System.out.println("enter your sub5");
        int s5= sc.nextInt();
        int secure=s1+s2+s3+s4+s5;
        System.out.print(secure);
        System.out.println("enter ur total mark");
        float total=sc.nextFloat();
        float pr=(secure/total)*100;
        System.out.println(pr);
        float cgpa=pr/10;
        System.out.println(cgpa);
        
        
    }
}
