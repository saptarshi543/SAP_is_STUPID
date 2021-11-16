import java.io.*;
public class iotwo{//success........
	public static void main(String g[]){//working...
		try{
		FileInputStream f=new FileInputStream("E:/dap/experimental.txt");
		int i=0;
		while((i=f.read())!=-1){
			System.out.println((char)i);
		}
		f.close();
		System.out.println("file accessing is done");}
		catch(Exception e){System.out.println(e);}
	}
}/*each character is printed in a separate line ..to get output in one line
change>>System.out.println()
with>>system.out.print()*/