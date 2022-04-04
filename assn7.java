import java.awt.*;
import java.awt.event.*;
public class assn7 implements ActionListener {
    Frame f;
Button b0,b1,b2;
Panel p,p2;
GridLayout g;
BorderLayout b=new BorderLayout();
TextField t=new TextField(50);
assn7()
{   
    f=new Frame();
  //  f.setLayout(new FlowLayout());
    p=new Panel();
    p2=new Panel();
    p.add(t);
    f.setResizable(false);
    f.add(p,BorderLayout.NORTH);
    b0=new Button("RED");
    b0.addActionListener(this);
    b0.setBackground(Color.RED);
    b1=new Button("BLUE");
    b1.addActionListener(this);
    b1.setBackground(Color.BLUE);
    b2=new Button("GREEN");
    b2.addActionListener(this);
    b2.setBackground(Color.GREEN);
    p2.add(b0);
    p2.add(b1);
    p2.add(b2);
    f.add(p2,BorderLayout.CENTER);
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
        t.setBackground(Color.RED);
        t.setText("red");
    }
    if(e.getSource()==b1){
        t.setBackground(Color.BLUE);
        t.setText("blue");
    }
    if(e.getSource()==b2){
        t.setBackground(Color.GREEN);
        t.setText("green");
    }
    }
       public static void main(String[] args) {
      assn7 a=new assn7();
   }

} 
