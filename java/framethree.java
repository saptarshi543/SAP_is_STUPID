import java.awt.*;
public class framethree{//working..............
	public static void main(String g[]){//success....
		Frame f=new Frame("frame in java");
		Panel panel=new Panel();
		f.resize(500,500);
		f.setBackground(Color.blue);
        f.setLayout(null);
        panel.resize(100,100);
        panel.setBackground(Color.yellow);
		f.add(panel);
		f.show();
		Frame j1=new Frame("j1");
		Frame j2=new Frame("j2");
		j1.setBackground(Color.red);
		j2.setBackground(Color.green);
		j1.setLayout(null);
		j2.setLayout(null);
		j1.show();
		j2.show();
	}
}