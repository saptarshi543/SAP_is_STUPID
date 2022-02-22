/*
input: Abcd Efr Xy
output: Xy A.E.

input: Wwwd Kdfd
output: kdfd W.

input: Sap is StuPiD
output: STUPID S.I.
*/

import java.util.*;
public class initials{
	public static void main(String l[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter your name");
		String name=((nrt.nextLine()).toUpperCase()).trim(),ans="";
		// assuming input: "Sap Is Stupid"
		int last_whitespace=name.lastIndexOf(" ");
		ans+=(name.substring(last_whitespace,name.length())+" "+((name.charAt(0)))+". ").trim();// returns "Stupid S."
		
		for(int i=0;i<last_whitespace;i++){//this loop takes care of rest of the words in the full name if any
			if(name.charAt(i)==' '){
				ans+= name.charAt(i+1)+".";
			}
		}
		System.out.println(ans.trim());
	}
}
