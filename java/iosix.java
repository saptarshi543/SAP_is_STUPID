import java.util.*;
import java.io.*;
import java.awt.*;//success.........
public class iosix{//working.....
	public static void main(String a[]){
       String path="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
       try{
       	Desktop.getDesktop().open(new File(path));
       }
       catch(IOException e){e.printStackTrace();}
	}
	}
	/*it literally opens any file....*/