import java.util.Arrays;
import java.util.Scanner;

public class smallno {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);   
        int a=sc.nextInt();
        int []array=new int [a];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        } 
        Arrays.sort(array);
      
            System.out.println("..............................................");
           System.out.print(array[0]);
           System.out.print(array[1]);
           System.out.println("");
           System.out.print(array[array.length-1]);
           System.out.print(array[array.length-2]);
      
    }
}
