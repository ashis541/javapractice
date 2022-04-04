import java.awt.*;
import java.awt.event.*;

public class assn9 implements ItemListener
{
	Frame f;
	Label l1;
	TextField tf1;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg;

assn9()
	{
	f=new Frame("Display");
	f.setVisible(true);
	f.setLayout(null);
	f.setSize(400,350);
    	f.setBackground(Color.YELLOW);
	f.addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent e)
	{
	System.exit(0);
        	}
    	});

	l1=new Label("Who is the father of JAVA ?");
	tf1=new TextField(10);

	CheckboxGroup cbg=new CheckboxGroup();

       Checkbox cb1=new Checkbox("Aditya Moharana.",cbg,false);
	   cb1.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
				tf1.setText("false");
		}
			});
       Checkbox cb2=new Checkbox("Ashish Kumar Rout",cbg,false);
	   cb2.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent e){
		tf1.setText("true");
}
	});
       Checkbox cb3=new Checkbox("James Gosling",cbg,false);
	   cb3.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
				tf1.setText("false");
		}
			});
       Checkbox cb4=new Checkbox("Ritesh Basantia",cbg,false);
	   cb4.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
				tf1.setText("false");
		}
			});

	l1.setBounds(50,100,150,20);
	cb1.setBounds(50,150,150,20);
	cb2.setBounds(50,175,150,20);
	cb3.setBounds(50,200,150,20);
	cb4.setBounds(50,225,150,20);
	tf1.setBounds(50,300,150,20);

	f.add(l1);
	f.add(cb1);
	f.add(cb2);
	f.add(cb3);
	f.add(cb4);
	f.add(tf1);
	}
public static void main(String args[])
	{
		assn9 a=new assn9();
	}
}