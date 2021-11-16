import java.util.Scanner;
public class binarytodecimal{//working.......
	public static void main(String d[]){
		Scanner nrt=new Scanner(System.in);//success......
		System.out.println("enter a binary no. we will convert it to decimal");
	    String n=nrt.nextLine();
	    int no=Integer.parseInt(n);
	    int l=n.length(),tobemul,fin,k=0;
	    for(int r=(l-1),h=0;r>=0 && h<l;r--,h++){
	    	char c=n.charAt(r);
            tobemul=Integer.parseInt(""+c);
            fin=(int)((tobemul)*(Math.pow(2,h)));
            k+=fin;
	    }
	    System.out.println(k);
	    nrt.close();
	}
}