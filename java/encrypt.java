import java.util.*;
import java.io.*;
public class encrypt{
	//working...success...
	//looks like encrypt_MSG is working..
	public String encrypt_MSG(String user){
		/*encrypt algo..
		1.take string..
		2.split into words...
		3.separate words with "///" 
		4.words will be converted to simple ascii
		5.manipulate the numbers..
		6. return encrypted string..*/
		char s[]=new char[user.length()];
		String final_pass="";
		int ascii,count=0,n;
		for(int wq=0;wq<user.length();wq++){
			s[wq]=user.charAt(wq);}
		for(int r=0;r<s.length;r++){
			if(s[r]==' '){final_pass+="///";continue;}
			ascii=(int)s[r];
			n=(ascii*1086);
			final_pass+="/";
			final_pass+=n;
		}
		//got the string which contains ascii value of all
		//characters 
		//if there is space it is denoted by "///"
		//and other characters are separated by "/"
		//now to encrypt it even more...
		return final_pass;
	}
	//now to make a function to decrypt it..
	public String decrypt_MSG(String target){
		String decrypt="";
		// System.out.println("start..");
		String de[]=target.split("///");
		for(String tmp:de){
			// System.out.println(">>>>>"+tmp+"\n"+decrypt);
			String tmp_array[]=tmp.split("/");
			for(String tmp2:tmp_array){
				// System.out.println(">"+tmp2+"\n"+decrypt);
				try
				{decrypt+=String.valueOf((char)(((Integer.parseInt(tmp2))/1086)));}
				catch (NumberFormatException e){
					// System.out.println(e);
				}
			}
			decrypt+=" ";
		}
		String str=decrypt.substring(1,(decrypt.length()-1));
		return str;
	}
	public static void main(String dd[]){
		Scanner nrt=new Scanner(System.in);
		encrypt E=new encrypt();
		// System.out.println(">>"+E.decrypt_MSG(case1)+"<<");
	int io;
	String userE,userD;
	while(true){
		System.out.println("1:encrypt message...\n 2:decrypt message...\n any other number to break");
        System.out.println("enter messageto encrypt or decrypt");
	    System.out.println("if you chose option 1 then write the message in the same line separated by a  sapce");
	    System.out.println("examples");
	    System.out.println(" 1 <message_to_be_encrypted>");
     	System.out.println(" 2 <message_to_be_decrypted>");
      io=nrt.nextInt();
		if(io==1){
			// System.out.println("enter message to encrypt..");
			userE=nrt.nextLine();
			System.out.println("after encrypting..>"+(E.encrypt_MSG(userE))+"<");
		}
		else if (io==2) {
			// System.out.println("enter message to decrypt..");
			userD=nrt.nextLine();
			System.out.println("after deccrypting..>"+(E.decrypt_MSG(userD))+"<");
		}
		else{break;}
	}
	}
}
//   ////124890/105342/121632
//      /124890/105342/121632