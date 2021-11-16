import java.awt.*;
public class frametwo{//working..........
	public static void main(String g[]){//success......
		for(int r=0;r<3;r++){
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
}