/*wap to display like using for loop {****
                       ***
                       **
                       *}*/
import java.util.Scanner;
public class pr21 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter a number");
        int n=a.nextInt();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
            System.out.print("*");
        }
 System.out.print("\n");
        }
       
    }
}
