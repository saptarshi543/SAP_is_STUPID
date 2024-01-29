import java.util.*;
/*working...success..*/
class MakeStack{
private int arr[];
private int top;
private int capacity;
MakeStack(int size){
arr=new int[size];
capacity=size;
top=-1;
}
public void push(int x){
if(isFull()){System.out.println("FULL....exiting...");System.exit(1);}
System.out.println("Inserting ..."+x);
arr[++top]=x;}
public int pop(){
if(isEmpty()){System.out.println("EMPTY..");}
return arr[top--];}
public int size(){return top+1;}
public Boolean isEmpty(){return top==-1;}
public Boolean isFull(){return top==capacity-1;}
public void printStack(){for(int i=0;i<=top;i++){System.out.print(arr[i]+" ");}System.out.println();}
public static void main(String[] s){
System.out.println("enter capacity..");
Scanner nrt=new Scanner(System.in);
int cap=nrt.nextInt(),tmp,pop;
MakeStack S=new MakeStack(cap);
while(true){
System.out.println("1: add\t 2:remove\t 3: show stack\nenter any other no. to exit..");
tmp=nrt.nextInt();
if(tmp==1){System.out.println("enter element to enter..");
pop=nrt.nextInt();
S.push(pop);}
else if(tmp==2){S.pop();}
else if(tmp==3){S.printStack();}
else{break;}}
}
}
