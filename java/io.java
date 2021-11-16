import java.io.*;
import java.util.*;
public class io{//success......
	public static void main(String g[]){//working...
		try{
		FileOutputStream  fo=new FileOutputStream("E:/dap/experimental.txt");
        Scanner nrt=new Scanner(System.in);
	    System.out.println("enter the string you want to store in E:/dap/experimental.txt");
	    String n=nrt.nextLine();
        byte b[]=n.getBytes();
        fo.write(b);
        fo.close();
        System.out.println("file writing is done.");}
        catch(Exception e){
        	System.out.println(e);
        }	    
	}
}