/*Write a program to sum first n even numbers using a for loop*/
import java.util.Scanner;
public class pr31 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int i;
        System.out.println("enter ur no");
        int b=a.nextInt();
        for (i=0;i<=b;i++) {
           if(i%2==0)
           System.out.println(i);
        }
    }
}
