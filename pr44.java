import java.util.*;
class rectangle{
    int area,length,breadth;
    rectngle(int l,int b){
        length=l;
        breadth=b;
    }
    void rectarea()
    {
        area=length*breadth;
        System.out.println(area);
    }
    int len,width,perimeter;
    rectangle(int x,int y)
    {
        len=x;
        width=y;
    }
    void perimeter()
    {
        perimeter=2*(len+width);
        System.out.println(perimeter);
    }
}
public class pr44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        rectangle rect=new rectangle(length,breadth);
        int len,width;
        len=sc.nextInt();
        width=sc.nextInt();
        rectangle ren=new rectangle();
        ren.perimeter();

    }
    
}
