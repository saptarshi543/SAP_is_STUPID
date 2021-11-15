//to take a string as input and count the number of vowels,spaces,consonants, and other characters
#include <stdio.h>
#include <string.h>
int main(){
	printf("enter a string\nwe will count the number of vowels,spaces,consonants, and other characters\n");
	char user[100];
	char *ch;
	int alphabets=0,space=0,consonants=0,other=0;
	scanf("%s",&user);
	int len=strlen(user);
	for(int r=0;r<len;r++){
       ch=user[r];
       if ((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U')) {
				++alphabets;
			}
	    else if ((ch=='b')||(ch=='B')||(ch=='c')||(ch=='C')||(ch=='d')||(ch=='D')||(ch=='f')||(ch=='F')||(ch=='g')||(ch=='G')||(ch=='h')||(ch=='H')||(ch=='j')||(ch=='J')||(ch=='k')||(ch=='K')||(ch=='l')||(ch=='L')||(ch=='m')||(ch=='M')||(ch=='n')||(ch=='N')||(ch=='p')||(ch=='P')||(ch=='q')||(ch=='Q')||(ch=='r')||(ch=='R')||(ch=='s')||(ch=='S')||(ch=='t')||(ch=='T')||(ch=='v')||(ch=='V')||(ch=='w')||(ch=='W')||(ch=='x')||(ch=='X')||(ch=='y')||(ch=='Y')||(ch=='z')||(ch=='Z')){
				++consonant;
			}
	    else if(ch==' '){
	    	++space;
	    }
	    else
	    	++other;
	}
	print("the Number of vowel characters are >"+alphabets);
print("the Number of consonant characters are >"+consonant);
print("the Number of spaces in the string  are >"+space);
print("the other characters in the string are >"+other);
}