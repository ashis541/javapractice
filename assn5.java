import java.awt.*;
public class assn5 {
    public static void main(String[] args) {
        Frame fm=new Frame("my frame");
        fm.setBackground(Color.CYAN);
        fm.setResizable(false);
        fm.setSize(450,450);
        fm.setVisible(true);
        FlowLayout fl=new FlowLayout();  
        Panel p=new Panel();
        Panel p1=new Panel();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b10=new Button("0");
        Button b11=new Button(".");
        Button b12=new Button("#");
        // b1.setBackground(Color.LIGHT_GRAY);
        // b2.setBackground(Color.LIGHT_GRAY);
        // b3.setBackground(Color.LIGHT_GRAY);
        // b4.setBackground(Color.LIGHT_GRAY);
        // b5.setBackground(Color.LIGHT_GRAY);
        // b6.setBackground(Color.LIGHT_GRAY);
        // b7.setBackground(Color.LIGHT_GRAY);
        // b8.setBackground(Color.LIGHT_GRAY);
        // b9.setBackground(Color.LIGHT_GRAY);
        // b10.setBackground(Color.LIGHT_GRAY);
        // b12.setBackground(Color.LIGHT_GRAY);
        // b11.setBackground(Color.LIGHT_GRAY);
       BorderLayout bl=new BorderLayout();
        TextField tx=new TextField(50);
        fm.setLayout(bl);
         p1.add(tx);
         fm.add(p1,BorderLayout.NORTH);
         p1.setLayout(fl);
        GridLayout layout = new GridLayout(4,3,2,2); 
        p.setLayout(layout);
        fm.add(p);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b11);
        p.add(b10);
        p.add(b12);

    }
}
