import java.util.*;
public class test{
public static int add(char[] a,char[] b,int tmp){
for(char forB:b){
	a[tmp]=forB;
	++tmp;
}
return tmp;
}
public static int reverse(int r){//working...
int rev=0;
while(r!=0){
	rev*=10;
	rev+=(r%10);
	r/=10;}
	return rev;}
	public static void main(String[] args){
		// int tmpM = 0;
		// char[] one={'a','b','c','d'};
		// char[] two={'q','w','e','r','t'};
		// char three[]=new char[9];
		// tmpM=add(three,one,tmpM);
		// tmpM=add(three,two,tmpM);
		// for(char w:three){System.out.print(w+" ");}
		// String s="wskdskm";
		// System.out.println(s.indexOf('a'));
		test T=new test();
		System.out.println(T.reverse(1234));
}}
