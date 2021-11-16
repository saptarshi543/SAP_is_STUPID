import java.io.*;
import java.util.*;
public class iothree{//working...
	public static void main(String d[]){
		try{//success........
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter what you want to write...\nenter location where you want to save it..");
        String s=nrt.nextLine();
        String save=nrt.nextLine();
        FileOutputStream f=new FileOutputStream(save);
        byte b[]=s.getBytes();
        f.write(b);
        f.close();}
        catch(Exception e){System.out.println(e);}
	}
}