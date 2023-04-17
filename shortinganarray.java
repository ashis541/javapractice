
import java.util.*;
public class shortinganarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element you want to add");
        int b=sc.nextInt();
        int []a=new int[b];
            for(int i=0;i<a.length;i++){
         System.out.println("enter the"+i+"th element");
          a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<a.length;j++){
        System.out.println(a[j]); 
        }
    }
}