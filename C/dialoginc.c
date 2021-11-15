#include <windows.h>//displays a simple dialog box...
int main(){//with "ok" and "cancel" option to quit...
	MessageBox(0,"hello","welcome message",1);
}
/*the last integer in MessageBox() has many uses
0-only "ok"
1-provides user with "ok" and "cancel"
2-provides user with "abort" , "retry" and "ignore"
3- .................. "yes" , "no" and "cancel"
4- .................."yes" and "no"
5-...................."retry" and "cancel"
6-.................."cancel" , "try again" and "continue"*/