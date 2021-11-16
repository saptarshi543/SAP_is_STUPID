import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class myappletcalculator extends Applet implements ActionListener{
String msg=" ";
int v1,v2;
TextField t1;
Button b[]=new Button[10];
Button add,sub,mul,div,clear,mod,EQ;
char OP;
public void init(){
	Color k=new Color(120,89,90);
	setBackground(k);
	t1=new TextField(10);
	GridLayout gl=new GridLayout(2,0);
	setLayout(gl);
	add(t1);
	for(int i=0;i<10;i++){
		b[i]=new Button(""+i);
	}
	add=new Button("+");
	sub=new Button("-");
	mul=new Button("X");
	div=new Button("/");
	mod=new Button("%");
	clear=new Button("CLEAR");
	EQ=new Button("=");
	t1.addActionListener(this);
	for(int i=0;i<10;i++){
		add(b[i]);
	}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(mod);
	add(clear);
	add(EQ);
	for(int i=0;i<10;i++){
		b[i].addActionListener(this);
	}
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	mod.addActionListener(this);
	clear.addActionListener(this);
	EQ.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
	String str=e.getActionCommand();
    char ch=str.charAt(0);
    int result;
    if(Character.isDigit(ch))
    	t1.setText(t1.getText()+str);
    else
    	if(str.equals("+")){
    		v1=Integer.parseInt(t1.getText());
    		OP='+';
    		t1.setText("");
    	}
    	else if(str.equals("-")){
    		v1=Integer.parseInt(t1.getText());
    		OP='-';
    		t1.setText("");
    	}
    	else if(str.equals("x")){
    		v1=Integer.parseInt(t1.getText());
    		OP='*';
    		t1.setText("");
    	}
    	else if(str.equals("/")){
    		v1=Integer.parseInt(t1.getText());
    		OP='/';
    		t1.setText("");
    	}
    	else if(str.equals("%")){
    		v1=Integer.parseInt(t1.getText());
    		OP='%';
    		t1.setText("");
    	}
    	if(str.equals("=")){
    		v2=Integer.parseInt(t1.getText());
    		if (OP=='+')
    			result=v1+v2;
    		else if(OP=='-')
    			result=v1-v2;
    		else if(OP=='*')
    			result=v1*v2;
    		else if(OP=='/')
    			result=v1/v2;
    		else if(OP=='%')
    			result=v1%v2;
    		t1.setText(""+result);
    	}
    	if(str.equals("CLEAR"))
    		str.setText("");
}
}
/*
<html>
   <body>
      <applet width="300" height="50" code="myappletcalculator.class">
      </applet>
   </body>
</html>
*/