import java.util.*;
public class password{//makes unique password based on user's choice
//working...success....
public static int add(char[] a,char[] b,int tmp){
for(char forB:b){
	a[tmp]=forB;
	++tmp;
}
return tmp;
}
	public static void main(String v[]){Scanner nrt=new Scanner(System.in);String final_pass="";
		char special_char[]={'!','@','#','$','%','&','*'};
		char space[]={' '};
		char numbers[]={'1','2','3','4','5','6','7','8','9','0'};
		char alpha_char[]={'A','B', 'C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char letter_char[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char final_array[]=new char[70];
		System.out.println("welcome to password generator..");
		System.out.println("enter min-length of password");
		int l_min=nrt.nextInt();
		System.out.println("enter max-length of password");
		int l_max=nrt.nextInt();
		if(l_max<l_min){System.out.println("password lengths are wrong...exiting..");System.exit(0);}
		int k_space,k_num,k_alpha,k_letter,k_special,final_len=0;
		System.out.println("do you wish to include...");
		System.out.println("space :1-yes :2-no");
		k_space=nrt.nextInt();
		System.out.println("numbers :1-yes :2-no");
		k_num=nrt.nextInt();
		System.out.println("alphabets  :1-yes :2-no");
		k_alpha=nrt.nextInt();
		System.out.println("letters  :1-yes  :2-no");
		k_letter=nrt.nextInt();
		System.out.println("special characters :1-yes :2-no");
		k_special=nrt.nextInt();
		Random r=new Random();
		final_len=(int)(l_min+r.nextInt(l_max-l_min+1));
		if(k_space==2 && k_num==2 && k_letter==2 && k_alpha==2 &&k_special==2){System.out.println("poor choice..exiting..");System.exit(0);}
		int tmpM=0;
		if(k_space==1){tmpM=add(final_array,space,tmpM);}
		if (k_num==1){tmpM=add(final_array,numbers,tmpM);}
		if(k_alpha==1){tmpM=add(final_array,alpha_char,tmpM);}
		if(k_letter==1){tmpM=add(final_array,letter_char,tmpM);}
		if(k_special==1){tmpM=add(final_array,special_char,tmpM);}
		// for (char a :final_array ) {System.out.print(a);}
		int ptmp;
		if(l_max==l_min)
			final_len=l_max;
		for(int xz=0; xz<final_len;xz++){
			ptmp=(int)(0 + r.nextInt((final_array.length-1)-0+1));
			final_pass+=(final_array[ptmp]);
		}
		System.out.println(">> "+final_pass+" <<");
	nrt.close();
	}
}