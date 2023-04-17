import java.util.Scanner;

public class numberadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int []array=new int[a] ;
        int check =sc.nextInt();
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++){
            for(int k=1;k<array.length;k++){
                if (array[j]+array[k]==check) {
                    System.out.println(array[j]+"and"+array[k]);
                    
                }
           
            }
            
        }


    }
}
