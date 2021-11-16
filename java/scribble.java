import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="scribble.class" width=300 height=100>
</applet>*/
public class scribble extends Applet implements MouseListener{
private int lastx,lasty;
public void init(){
	this.addMouseListener();
	this.addMouseMotionListener();
}
public void mousePressed(MouseEvent e){
	lastx=e.getX();
	lasty=e.getY();
}
public void mouseDragged(MouseEvent e){
	Graphics g=this.getGraphics();
	int x=e.getX(),y=e.getY();
	g.drawLine(lastx,lasty,x,y);
	lastx=x;lasty=y;
}
public void mouseClicked(MouseEvent e){showStatus("mouse clicked");}
public void mouseMoved(MouseEvent e){}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mouseReleased(MouseEvent e){}
}