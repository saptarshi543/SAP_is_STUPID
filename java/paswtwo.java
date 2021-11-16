import java.util.*;
public class paswtwo{
	public static void main(String d[]){//working.....
		Scanner nrt=new Scanner(System.in);//success.......
		System.out.println("enter 1st password\nenter 2nd password");
		String s1=nrt.nextLine(),s2=nrt.nextLine();
		int l=s1.length(),l2=s2.length();
		char arr1[]=new char[l];
		char arr2[]=new char[l2];
		int err=0;
		if((arr1.length)==(arr2.length)){
			for(int r=0;r<arr1.length;r++){
				arr1[r]=s1.charAt(r);
				arr2[r]=s2.charAt(r);
			}
             for(int t=0;t<arr1.length;t++){
                 if((arr1[t])!=(arr2[t])){
                       err++;
                 }
                 	}
                 	if(err==0){System.out.println("correct password");}
                 	else
                 		System.out.println("wrong password");
                 }
             
		else 
			System.out.println("wrong password\n they do not match");
}
}