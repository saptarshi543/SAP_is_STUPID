import java.util.*;
public class randomcharacter{//working......
	public static void main(String d[]){//success......
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a line without any special character");
		String s=nrt.nextLine();
		int len=s.length(), o;
		String s2=s.toLowerCase();
		for(int r=0;r<len;r++){
			char c=s2.charAt(r);
			if(c==' '){
				System.out.print(" ");
				continue;
			}
			else {
              o=1+(int)(Math.random()*10);
              if(2%o==0){
              	System.out.print((""+c).toUpperCase());
              	}else
              		System.out.print(c);
			}
		}
		nrt.close();
	}
}/*this program takes a string input and randomly converts some of the
characters of the string to uppercase*/