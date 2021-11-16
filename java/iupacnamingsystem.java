import java.util.*;
public class iupacnamingsystem{//working...
	public static void main(String d[]){//success......
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a Number...we will convert it to IUPAC System\nfor example 107 becomes>Unnilseptium");
		String s=nrt.nextLine();
		String f="";
		char one;
        int n;
		for(int r=0;r<(s.length());r++){
            one=s.charAt(r);
            n=Integer.parseInt(""+one);
            switch(n){
                case 0:
                f+="nil";
                break;
                case 1:
                f+="un";
                break;
                case 2:
                f+="bi";
                break;
                case 3:
                f+="tri";
                break;
                case 4:
                f+="quad";
                break;
                case 5:
                f+="pent";
                break;
                case 6:
                f+="hex";
                break;
                case 7:
                f+="sept";
                break;
                case 8:
                f+="oct";
                break;
                case 9:
                f+="enn";
                break;
            }
        }
        int newlen=f.length();
        char b=f.charAt(newlen-1);
        String x="";
        if(b=='i')
          x=f+"um";
        else
             x=f+"ium";
		//now to make the first letter capital
		String q= x.substring(0,1).toUpperCase() + x.substring(1);
		System.out.println(q);
		nrt.close();
	}
}