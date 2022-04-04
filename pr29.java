/* Write a program to find the factorial of a number using while loops */
import java.util.Scanner;
public class pr29 {
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter ur no");
    int b=a.nextInt();
    int f=1;
    while (b>0) {
        f=f*b;
        b--;
    }
    System.out.println(f);
}
    
}