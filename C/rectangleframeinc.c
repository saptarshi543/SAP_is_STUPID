#include <graphics.h>
int main(){
	int gd= DETECT, gm;
	int left=150, top=150, right=450, bottom=450;
	initgraph(&gd,&gm, "");
	rectangle(left,top,right,bottom);
	getch();
	closegraph();
}