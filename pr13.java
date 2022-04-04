/*wap to fill in a letter template which like 
letter = "dear <|name|>, Thanks alot" Replce the name with a string(some name)*/
public class pr13 {
    public static void main(String[] args) {
        String letter = "dear <|name|>, Thanks alot";
        letter=letter.replace("<|name|>","ashis");
        System.out.println(letter);
    }
    
}
