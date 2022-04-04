import java.util.*;
class area{
    void rect(int a, int b){
        int rectn=a*b;
        System.out.println(rectn);
    }
    void tri(int a, int b){
        int trn=a*b/2;
        System.out.println(trn);

    }
}
public class pr41 {
    public static void main(String[] args) {
        area ar=new area();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        ar.rect(x,y);
        ar.tri(x,y);

        
    }
    
}
