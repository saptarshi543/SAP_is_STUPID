import java.util.*;
public class pasw{
	public static void main(String f[]){//working.....
		Scanner nrt=new Scanner(System.in);//success.....s
		System.out.println("create a password\nshould contain uppercase alphabet, lowercase alphabet,number, special characters");
		System.out.println("enter length of password");
		int l=nrt.nextInt();
		char arr[]=new char[l];
		for(int r=0;r<l;r++){
			arr[r]=(nrt.next().charAt(0));
		}
		int err=0;
	    System.out.println("enter length of password\nenter password");
		int l2=nrt.nextInt();
		char arr2[]=new char[l2];
		for (int a=0;a<l2 ;a++ ) {
			arr2[a]=(nrt.next().charAt(0));
		}
		if(arr.length==arr2.length){
              for (int y=0;y<arr.length ;y++ ) {
              	if(arr[y]!=arr2[y]){
              		err++;
              	}
              }
              if (err==0) {
              	System.out.println("correct password");
              }
              else if(err!=0){
              	System.out.println("wrong password");
              }
		}
		else if(arr.length!=arr2.length){
			System.out.println("the 2 passwords doesn't match");
		}
		nrt.close();
	}
}