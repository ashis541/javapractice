import java.awt.*;
public class assn {
public static void main(String[] args) {
    Frame f=new Frame();
    f.setVisible(true);
    f.setSize(650,700);
   // f.setResizable(false);
    f.setBackground(Color.CYAN);
    Button b1=new Button("submit");
    Button b2=new Button("reset");
    Checkbox ch=new Checkbox();
    Checkbox ch1=new Checkbox();
    Checkbox ch2=new Checkbox();
    b1.setBackground(Color.GREEN);
    b2.setBackground(Color.LIGHT_GRAY);
    Label name=new Label("Name");
    Label adrs=new Label("Address");
    Label phn=new Label("Phoneno");
    Label gn=new Label("GENDER");
    Label mail=new Label("Email");
    Label cn=new Label("Qualification");
    Label ql=new Label("country");
    Label rd=new Label("reading");
    Label pl =new Label("playing");
    f.add(name);
    TextField tf=new TextField(15);
    TextField tf1=new TextField(10);
    TextField tf2=new TextField(15);
    TextArea ta=new TextArea(3,15);
    CheckboxGroup cbg=new CheckboxGroup();
       Checkbox cb1=new Checkbox("male",cbg,false);
       Checkbox cb2=new Checkbox("female",cbg,false);
       Checkbox cb3=new Checkbox("others",cbg,false);
       List lst=new List(3,true);
       lst.add("10th");
       lst.add("+2");
       lst.add("graduate");
       lst.add("postgraduate");
       Choice c=new Choice();
       c.add("india");
       c.add("pakistan");
       c.add("america");
       c.add("austrelia");
       c.add("china");
       FlowLayout fl=new FlowLayout();
    f.setLayout(fl);
    Panel p=new Panel();
    f.add(p);
    p.add(name);
    p.add(tf);
    p.add(adrs);
    p.add(ta);
    p.add(phn);
    p.add(tf1);
    Panel p1=new Panel();
    f.add(p1);
    p1.add(gn);
    p1.add(cb1);
    p1.add(cb2);
    p1.add(cb3);
    Panel p2=new Panel();
    f.add(p2);
    p2.add(mail);
    p2.add(tf2);
    p2.add(cn);
    p2.add(lst);
    p2.add(ql);
    p2.add(c);
    Panel p3=new Panel();
    f.add(p3);
    p3.add(rd);
    p3.add(ch);
    p3.add(pl);
    p3.add(ch1);
    p3.add(b1);
    p3.add(b2);




}
    
}