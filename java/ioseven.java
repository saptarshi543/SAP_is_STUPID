import java.util.*;
import java.io.*;
import java.awt.*;//success.........
public class ioseven{//working.....
	public static void main(String a[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter file location ...we will open it");
       String path=nrt.nextLine();
       try{
       	Desktop.getDesktop().open(new File(path));
       }
       catch(IOException e){e.printStackTrace();}
	}
	}
	/*it literally opens any file....*/