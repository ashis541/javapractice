/*wap to find out the type of web site from url
.com-------Commercial
.Org-------organaisational website
.in--------indian website
.edu-------educational website */
import java.util.Scanner;
public class pr20 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the url to check which type of website it");
        String url=a.next();
        if (url.endsWith(".com")) 
        {
            System.out.println("its a commercial website");
        }
            else if (url.endsWith(".org"))
                 {
                 System.out.println("its a organaisational website");
                 }
               else if(url.endsWith(".in"))
                    {
                    System.out.println("its a indian website");
                     }
                  else if (url.endsWith(".edu")) 
                        {
                        System.out.println("its a eucational website");
                            }
                    else
                          {
                          System.out.println("we can't find ur url");
                              }
                
    }
}
