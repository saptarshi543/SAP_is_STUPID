import java.util.*;
public class distance{
	public static void main(String f[]){//working.....
		Scanner nrt=new Scanner(System.in);//success......
		System.out.println("we will find the distance b/w 2 plots in a graph");
		System.out.println("if plots are for example>(a,b) & (c,d)\nenter like this>\na\nb\nc\nd");
	    int a=nrt.nextInt(),b=nrt.nextInt(),c=nrt.nextInt(),d=nrt.nextInt();
	    nrt.close();
	    double dis=Math.sqrt((Math.pow((c-a),2))+(Math.pow((d-b),2)));
	    System.out.println("the distance is "+dis+" units");
	}
}