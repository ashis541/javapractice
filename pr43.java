import java.util.Scanner;

// Java program to illustrate
// Constructor Overloading
class rect
{
	double width, height, depth;
	volume(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	
	void volm()
	{
		double result=width * height * depth;
        System.out.println(result);

	}
    double length,breadth;
	rectarea(double l, double b);
    void area(){
    double resultt=length*breadth;
    System.out.println(resultt);
    }
}

// Driver code
public class pr43
{
	public static void main(String args[])

	{
        rect m=new rect();
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        rect m=new rect(a,b,c);
        m.volm();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        rect n=new rect(d,e);
        n.rectarea();
	}
}
