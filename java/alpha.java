import java.util.*;//success....
public class alpha{//working...
	public static void main(String sap[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter a string..");
		int len,consonant=0,alphabets=0,space=0,other=0;
		String user=nrt.nextLine();
		len=user.length();
		int i;
		for (i=0;i<len ;i++ ) {
			char ch=user.charAt(i);
			if ((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U')) {
				++alphabets;
			}
			else if ((ch=='b')||(ch=='B')||(ch=='c')||(ch=='C')||(ch=='d')||(ch=='D')||(ch=='f')||(ch=='F')||(ch=='g')||(ch=='G')||(ch=='h')||(ch=='H')||(ch=='j')||(ch=='J')||(ch=='k')||(ch=='K')||(ch=='l')||(ch=='L')||(ch=='m')||(ch=='M')||(ch=='n')||(ch=='N')||(ch=='p')||(ch=='P')||(ch=='q')||(ch=='Q')||(ch=='r')||(ch=='R')||(ch=='s')||(ch=='S')||(ch=='t')||(ch=='T')||(ch=='v')||(ch=='V')||(ch=='w')||(ch=='W')||(ch=='x')||(ch=='X')||(ch=='y')||(ch=='Y')||(ch=='z')||(ch=='Z')){
				++consonant;
			}
			else if (ch==' ') {
				++space;
			}
			else
               other++;
		}
		System.out.println("the Number of vowel characters are >"+alphabets);
		System.out.println("the Number of consonant characters are >"+consonant);
		System.out.println("the Number of spaces in the string  are >"+space);
        System.out.println("the other characters in the string are >"+other);
    }
}