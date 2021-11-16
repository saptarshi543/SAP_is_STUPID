import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="scribble.class" width=300 height=100>
</applet>*/
public class scribble extends Applet implements MouseListener{
private int lastx,lasty;
public void init(){
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
}
public void mousePressed(MouseEvent e){
	lastx=e.getX();
	lasty=e.getY();
}
public mouseDragged(MouseEvent e){
	Graphics g=this.getGraphics();
	int x=e.getX(),y=e.getY();
	g.drawLine(lastx,lasty,x,y);
	lastx=x;lasty=y;
}
public mouseClicked(MouseEvent e){showStatus("mouse clicked");}
public mouseMoved(MouseEvent e){}
public mouseEntered(MouseEvent e){}
public mouseExited(MouseEvent e){}
public mouseReleased(MouseEvent e){}
}