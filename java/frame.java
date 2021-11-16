import java.awt.*;
public class frame{//working..............
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
	}
}