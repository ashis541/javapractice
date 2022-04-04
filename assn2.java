import java.awt.*;
public class assn2 {
    public static void main(String[] args) {
        Frame f=new Frame("LOGIN");
    f.setVisible(true);
    f.setSize(650,700);
    f.setBackground(Color.ORANGE);
        Label usr=new Label("USERID");
        Label ps=new Label("PASSWORD");
        Label he=new Label("heading");
        TextField tf=new TextField(15);
        TextField tf1=new TextField(10);
        Panel p=new Panel(); 
        f.add(p);
        p.add(he);
        p.add(usr);
        p.add(tf);
        p.add(ps);
        p.add(tf1);
        



    }
}
