import java.util.*;
class pr46
{
 public static void main(String s[])
 {
     try
        { 
          Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception has occurred");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException has occurred");
        }
        catch(Exception e)
        {
            System.out.println("Commonexception has occurred");
        }
    }
}