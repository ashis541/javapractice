/*calcilate the percentage of 5 subject where the marks are input through keyboard  */
import java.util.Scanner;
public class Pr4 {
  
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter your sub1 mark");
        int sub1=a.nextInt();
        System.out.println("enter your sub2 mark");
        int sub2=a.nextInt();
        System.out.println("enter your sub3 mark");
        int sub3=a.nextInt();
        System.out.println("enter your sub4 mark");
        int sub4=a.nextInt();
        System.out.println("enter your sub5 mark");
        int sub5=a.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5;
        System.out.println(total);
        System.out.println("enter your full mark");
        float fullmark=a.nextFloat();
        float percentage=(total/fullmark)*100;
        System.out.println(percentage);
    }
}
