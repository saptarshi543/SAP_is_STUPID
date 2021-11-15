#include <stdio.h>
#include<math.h>
int main()
{
	double ki,radius,uy,cd,vh,df,al,jp;
	printf("welcome to a scientific calculator>\n");
	printf("circle-1\ntriangle-2\ncylinder-3\nother-4\n");
    char sign,i,hk,ch,side1,side2,side3,si,iso,iso2,ui,ui1;
	scanf("%c",&sign);
switch(sign)
{
case'1':
	printf("enter radius..\n");
	printf("area-1\nsemicircle-2\n");
	scanf("%d\n",&radius);
	scanf("%c",&hk);
	switch(hk)
	{
	case'1':
    uy=(3.1416*radius*radius);
    ki=(2*3.1416*radius);
    printf("the area is-%d\tthe circumference is-%d\n",uy,ki);
    break;
    case'2':
    uy=(1/2)*(3.1416*radius*radius);
    ki=(1/2)*(2*3.1416*radius);
    printf("the area is-%d\tthe circumference is-%d\n",uy,ki);
    break;
    default:
    printf("error..\n");
    }
    return 0;
break;    
case '2':
    printf("scalene-1\nequilateral-2\nisoceles-3\n");
    scanf("%c",&ch);
    switch(ch)
    {
    case'1':
    printf("enter the three sides\n");
    scanf("%d %d %d",&side1,&side2,&side3);
    cd=(side1+side2+side3)/2;
    vh=sqrt((cd-side1)*(cd-side2)*(cd-side3));
    df=(side3+side2+side1);
    printf("the area is-%d\nthe perimetre is-%d\n",vh,df);
    break;
    case'2':
    printf("enter the same and common side\n");
    scanf("%d",&si);
    cd=(3*si);
    al=pow(si,2);
    vh=(sqrt(3))*(al/4);
    printf("the area is-%d\nthe perimetre is-%d\n",cd,vh);
    break;
    case'3':
    printf("enter height\nenter base\n");
    scanf("%d %d",&iso,&iso2);
    cd=(1/2)*(iso2)*(iso);
    jp=(pow(iso,2))+(pow(iso2,2));
    vh=sqrt(jp);
    printf("the area is-%d\nthe perimetre is-%d",cd,vh);
    break;
    }
    return 0;
break;    
case'3':
    printf("enter the radius\nenter the height\n");
    scanf("%d %d",&ui,&ui1);
    vh=(2*(ui*ui))+(2*ui1);
    cd=(2*(3.1416*ui*ui))+ui1*(2*3.1416*ui);
    printf("the area is-%d\tthe perimetre is-%d\n",cd,vh);
break;    
case '4':
    printf("value of:\n");
    printf("sin 0=0\nsin 30=1/2\nsin 45=1/√2\nsin 60=√3/2\nsin 90=1\n");
    printf("cos 0=1\ncos 30=√3/2\ncos 45=1/√2\ncos 60=1/2\ncos 90=0\n");
    printf("tan 0=0\ntan 30=1/√3\ntan 45=1\ntan 60=√3\ntan 90=undefined\n");
    printf("cosec 0=undefined\ncosec 30=2\ncosec 45=√2\ncosec 60=2/√3\ncosec 90=1\n");
    printf("sec 0=1\nsec30=2/√3\nsec 45=√2\nsec 60=2/√3\nsec 90=undefined\n");
    printf("cot 0=undefined\ncot 30=√3\ncot 45=1\ncot 60=1/√3\ncot 90=0");
break;
default:
printf("error....\n");
}
return 0;
}