/*TO GET SCREEN RESOLUTION..*/
import java.util.*;
import java.awt.*;
public class screen_res{
	public static void get_screen_res(){
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		float width=size.getWidth();
		float height=size.getHeight();
		System.out.println(width+" X "+height);
	}
	public static void main(String f[]){
		System.out.println("screen RESOLUTION is ");
		get_screen_res();
	}
}