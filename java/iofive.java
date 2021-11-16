import java.util.*;
import java.io.*;
public class iofive{
	public static void main(String g[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a directory address we will check if it exists.");
		String d=nrt.nextLine();
		String s2;
		int n;
		FileOutputStream f=new FileOutputStream(d);
		File fl=new File(d);
		try{
		if (fl.exists()) {
			System.out.println("it exists..do you want to write-1 or read-2 or exit-3");
            n=nrt.nextInt();
            if(n==1){
             System.out.println("what do you want to write?");
             s2=nrt.nextLine();
             byte b[]=s2.getBytes();
             f.write(b);
             System.out.println("writing complete...exiting interface");
            }
            else if(n==2){
           	System.out.println("is file readable?--"+(fl.canRead()?"yes":"no"));
           	System.out.println("is file writable?--"+(fl.canWrite()?"yes":"no"));
           	System.out.println("file was last modified--"+fl.lastModified());
           	System.out.println("size of file is"+fl.length()+"bytes");
            System.out.println("reading complete...exiting interface");
            }
            else if(n==3){
             System.exit(1);
            }
            else{
            	System.out.println("invalid choice..exiting anyway");
            }
		}
		else{
			System.out.println("it does not exist");
		}
	}
	catch(Exception e){System.out.println(e);}
	finally{
        nrt.close();
        f.close();
        fl.close();
	}
	}
}