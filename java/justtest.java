/*this file is for testing miscellaneous programs before using them in big projects...
feel free to use it...*/
import java.util.*;
public class justtest{
	/*in web u can't search a sentence with space in it >server won't understand
	so all the space(s) are converted to '+'*/
	public static void string_search_in_web(String str){
     String well;
     if(str.contains(" ")){
      well=str.replace(' ','+');}
      else
      	well=str;
     System.out.println(well) ;
	}
	public static void main(String h[]){
		int r=0001;
		System.out.println("int r="+r);
		int t=(int)(0001);
		System.out.println("(int)(0001)"+t);
		String s="00001";
		int ne=Integer.parseInt(s);
		System.out.println(ne);
		String test="hello world i am sap",t2="saptarshi";
		string_search_in_web(test);
		string_search_in_web(t2);
	}
}