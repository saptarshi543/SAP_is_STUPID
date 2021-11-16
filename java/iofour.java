import java.util.*;
import java.io.*;
public class iofour{
	public static void main(String a[]){//working....
		Scanner nrt=new Scanner(System.in);//success......
		System.out.println("enter a file directory we will check if it exists and much more..");
		String s=nrt.nextLine();
		nrt.close();
		try{
           File f=new File(s);
           if(f.exists()){
           	System.out.println("file exists");
           	System.out.println("is file readable?--"+(f.canRead()?"yes":"no"));
           	System.out.println("is file writable?--"+(f.canWrite()?"yes":"no"));
           	System.out.println("file was last modified--"+f.lastModified());
           	System.out.println("size of file is"+f.length()+"bytes");
           }
           else
           	System.out.println("files does not exist..");
		}
		catch(Exception e){System.out.println(e);}
	}
}