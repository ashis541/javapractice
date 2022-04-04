import java.util.*;
class metthod{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(double m,double n){
        double k=m+n;
        System.out.println(k);
    }
    void add(int a,double m){
        double u=a+m;
        System.out.println(u);
    }
}
public class pr42 {
    public static void main(String[] args) {
        metthod s=new metthod();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        s.add(x,y);
        s.add(e,f);
        s.add(x,e);
    }
    
}
