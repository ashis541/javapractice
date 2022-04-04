/*wap to find out the day of the week given the number[1 for monday 2 for tuesday...and so on] */
import java.util.Scanner;      
public class pr18 {
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter the no between 1-7 to view week");
    int key=a.nextInt();
    switch (key)
     {
            case 1:
        System.out.println("monday");
        break;
            case 2:
            System.out.println("tuesdy");
        break;
            case 3:
        System.out.println("wednesday");
            break;
            case 4:
        System.out.println("thursday");
         break;
            case 5:
        System.out.println("friday");
        break;
            case 6:
        System.out.println("saturday");
        break;
            case 7:
        System.out.println("sunday");
        break;
        default:
        System.out.println("enter corect no between 1-7");
        break;
        
    }
 
    }
}