import java.awt.*;
public class assn4 {
    public static void main(String[] args) {
        Frame fm=new Frame("my frame");
        fm.setSize(720,720);
        fm.setBackground(Color.CYAN);
        fm.setVisible(true);
        MenuBar mb=new MenuBar();
        fm.setMenuBar(mb);
        Label l1=new Label("name");
        TextField tx=new TextField(30);
        TextArea ta=new TextArea(5,60);
        Button b1=new Button("submit");
        b1.setBackground(Color.GREEN);
        Button b2=new Button("send");
        b2.setBackground(Color.GRAY);
        Menu mf=new Menu("file");
        Menu mo=new Menu("open");
        mb.add(mf);
        mb.add(mo);
        MenuItem cut=new MenuItem("cut");
        MenuItem ms=new MenuItem("save");
        MenuItem print=new MenuItem("print");
        MenuItem edt=new MenuItem("edit");
        BorderLayout bl=new BorderLayout();
        fm.setLayout(bl);
        fm.add(ta);
        mf.add(cut);
        mf.add(ms);
        mo.add(print);
        mo.add(edt);
        Panel p=new Panel();
        fm.add(p,BorderLayout.SOUTH);
        p.add(l1);
        p.add(tx);
        p.add(b1);
        p.add(b2);

    }
}
