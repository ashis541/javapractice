//copyright reserved(by ashis rout)
import java.awt.*;
import java.awt.event.*;

public class assn8 implements ActionListener,MouseMotionListener {
Frame f;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bclr,beq;
String s0,s1,s2,s3,s4,s5,s6;
int c,n;
Panel p,p2;
GridLayout g;
BorderLayout b=new BorderLayout();
TextField t=new TextField(5);
TextField t1=new TextField(5);
assn8()
{   
    f=new Frame();
  //  f.setLayout(new FlowLayout());
    p=new Panel();
    g=new GridLayout(4,4,2,2); 
    p2=new Panel();
    p.setLayout(g);
    p2.add(t);
    p2.add(t1);
    f.setResizable(false);
    f.add(p2,BorderLayout.NORTH);
    b0=new Button("0");
    b0.addActionListener(this);
    b0.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b0.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b0.setBackground(Color.white);
        }
        });
    b1=new Button("1");
    b1.addActionListener(this);
    b1.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b1.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b1.setBackground(Color.white);
        }
        });
    b2=new Button("2");
    b2.addActionListener(this);
    b2.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b2.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b2.setBackground(Color.white);
        }
        });
    b3=new Button("3");
    b3.addActionListener(this);
    b3.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b3.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b3.setBackground(Color.white);
        }
        });
    b4=new Button("4");
    b4.addActionListener(this);
    b4.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b4.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b4.setBackground(Color.white);
        }
        });
    b5=new Button("5");
    b5.addActionListener(this);
    b5.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b5.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b5.setBackground(Color.white);
        }
        });
    b6=new Button("6");
    b6.addActionListener(this);
    b6.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b6.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b6.setBackground(Color.white);
        }
        });
    b7=new Button("7");
    b7.addActionListener(this);
    b7.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b7.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b7.setBackground(Color.white);
        }
        });
    b8=new Button("8");
    b8.addActionListener(this);
    b8.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b8.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b8.setBackground(Color.white);
        }
        });
    b9=new Button("9");
    b9.addActionListener(this);
    b9.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            b9.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent e)
        {
            b9.setBackground(Color.white);
        }
        });
    badd=new Button("+");
    badd.addActionListener(this);
    badd.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            badd.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            badd.setBackground(Color.white);
        }
        });
    bsub=new Button("-");
    bsub.addActionListener(this);
    bsub.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            bsub.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            bsub.setBackground(Color.white);
        }
        });
    bmul=new Button("*");
    bmul.addActionListener(this);
    bmul.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            bmul.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            bmul.setBackground(Color.white);
        }
        });
    bdiv=new Button("/");
    bdiv.addActionListener(this);
    bdiv.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            bdiv.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            bdiv.setBackground(Color.white);
        }
        });
    bclr=new Button("clr");
    bclr.addActionListener(this);
    bclr.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            bclr.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            bclr.setBackground(Color.white);
        }
        });
    beq=new Button("=");
    beq.addActionListener(this);
    beq.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e)
        {
            beq.setBackground(Color.green);
        }
        public void mouseExited(MouseEvent e)
        {
            beq.setBackground(Color.white);
        }
        });
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(bclr);
    p.add(b4);
    p.add(b5);
    p.add(b6);
    p.add(badd);
    p.add(b7);
    p.add(b8);
    p.add(b9);
    p.add(bsub);
    p.add(bmul);
    p.add(b0);
    p.add(bdiv);
    p.add(beq);
    f.add(p,BorderLayout.CENTER);
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
        t.setText(s2);
    }
    if(e.getSource()==b1){
        s1=t.getText();
        s0="1";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b2){
        s1=t.getText();
        s0="2";
         s2=s1+s0;  
        t.setText(s2);
    }
    if(e.getSource()==b3){
        s1=t.getText();
        s0="3";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b4){
        s1=t.getText();
        s0="4";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b5){
        s1=t.getText();
        s0="5";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b6){
        s1=t.getText();
        s0="6";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b7){
        s1=t.getText();
        s0="7";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b8){
        s1=t.getText();
        s0="8";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==b9){
        s1=t.getText();
        s0="9";
         s2=s1+s0;
        t.setText(s2);
    }
    if(e.getSource()==badd)
    {
        s4=t.getText();
        t.setText("");
        c=1;

    }
    if(e.getSource()==bsub)
    {
        s4=t.getText();
        t.setText("");
        c=2;

    }
    if(e.getSource()==bmul)
    {
        s4=t.getText();
        t.setText("");
        c=3;

    }
    if(e.getSource()==bdiv)
    {
        s4=t.getText();
        t.setText("");
        c=4;

    }
    if(e.getSource()==beq)
    {
        s5=t.getText();
        t1.setText("");
        if(c==1)
        {
            n=Integer.parseInt(s4)+Integer.parseInt(s5);
            t1.setText(String.valueOf(n));
        }
        if(c==2)
        {
            n=Integer.parseInt(s4)-Integer.parseInt(s5);
            t1.setText(String.valueOf(n));
        }
        if(c==3)
        {
            n=Integer.parseInt(s4)*Integer.parseInt(s5);
            t1.setText(String.valueOf(n));
        }
        if(c==4)
        {
            n=Integer.parseInt(s4)/Integer.parseInt(s5);
            t1.setText(String.valueOf(n));
        }

    }
    if(e.getSource()==bclr){
        t.setText("");
        t1.setText("");
    }
}
   public static void main(String[] args) {
       assn8 cl=new assn8();
   }
@Override
public void mouseDragged(MouseEvent e) {
    // TODO Auto-generated method stub
    
}
@Override
public void mouseMoved(MouseEvent e) {
    // TODO Auto-generated method stub
    
}
    
} 
