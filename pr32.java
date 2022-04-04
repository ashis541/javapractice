//Create an array of 5 floats and calculate their sum
public class pr32 {
    public static void main(String[] args) {
        float [] a = {2.7f,3.2f,3.9f,6.7f,8.9f};
        float sum=0;
        for(int i=0;i<5;i++)
        {
             sum= sum + a[i];
             
        }
                System.out.println(sum);
    
    }
}
