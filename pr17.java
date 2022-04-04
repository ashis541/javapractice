/*calculate the income tax by an employee to the govt as per the salaries mention bellow
            less than 2.5l--------------0%
            2.5l-5.0l--------------------5%
            5.0l-10l---------------------20%
            above 10l--------------------30% */
import java.util.Scanner;                 
public class pr17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income in number");
        int income=sc.nextInt();
        if(income< 250000)
    {
        System.out.println("you have to pay "+income*0+" to govt");
    }
        else if(income>250000&&income<500000)
        {
        System.out.println("you have to pay "+income*0.05f+" to govt");
        }
        else if(income>500000&&income<1000000)
        {
        System.out.println("you have to pay "+income*0.20f+" to govt");
        }
        else if(income>1000000)
        {
        System.out.println("you have to pay "+income*0.30f+" to govt");
        }
    

    }
}
