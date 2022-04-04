//Write a program to find out whether a given integer is present in an array or not.//
import java.util.Scanner;
public class pr33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a = {1,2,3,4,5,6,7,8,9};
        System.out.println("enter a no to check wheather it is present in array");
        int b=sc.nextInt();
        for(int i=0;i<=9;i++){
            if (b==a[i]) {
                System.out.println("got it");
                break;
            } else {
                System.out.println("sorry");
            }
        }
    }
    }

