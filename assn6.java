//import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class assn6 implements ActionListener {
Frame f;
Button b0;
String s0,s1,s2,s3,s4,s5,s6;
int c,n;
Panel p,p2;
GridLayout g;
BorderLayout b=new BorderLayout();
TextField t=new TextField(50);
assn6()
{   
    f=new Frame();
  //  f.setLayout(new FlowLayout());
    p=new Panel();
    p2=new Panel();
    p.add(t);
    f.setResizable(false);
    f.add(p,BorderLayout.NORTH);
    b0=new Button("center");
    b0.addActionListener(this);
    p2.add(b0);
    f.add(p2);
    f.setSize(450,450);
    f.setBackground(Color.CYAN);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
}
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==b0){
        s1=t.getText();
        s0="0";
        s2=s1+s0;
        t.setText("hello");
    }
    }
       public static void main(String[] args) {
      assn6 a=new assn6();
   }

} 
