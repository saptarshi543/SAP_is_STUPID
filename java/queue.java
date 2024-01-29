import java.util.*;
/*working...success..*/
public class queue{
	int items[];
	int front,rear,size;
	queue(int se){
		size=se;
		items=new int[size];
		front=-1;rear=-1;}

boolean isFull(){
			if(front==0 && rear==size-1){return true;}
			else{return false;}}

boolean isEmpty(){if(front==-1){return true;}
else{return false;}}

		void enqueue(int x){
			if(isFull()){System.out.println("queue is full...exiting");}
			else{
				if(front==-1){front=0;}
				rear++;
				items[rear]=x;
				System.out.println("inserted.."+x);}}
		int dequeue(){
			int element;
			if(isEmpty()){System.out.println("queue is empty..");return (-1);}
			else{element=items[front];
				if(front>=rear){front=-1;rear=-1;}
				else{front++;}
				System.out.println("deleted..."+element);
				return (element);}
		}
		void display(){
			if(isEmpty()){System.out.println("empty queue");}else{
				System.out.println("\n front index..."+front);
				System.out.println("items");
				for(int i=front;i<=rear;i++){System.out.print(items[i]+" ");}
					System.out.println("\nrear index..."+rear+"\n");}}
				public static void main(String f[]){
					System.out.println("enter capacity..");
	Scanner nrt=new Scanner(System.in);
	int cap=nrt.nextInt(),tmp,pop;
	queue Q=new queue(cap);
	while(true){
		System.out.println("1: add\t 2:remove\t 3: show queue\nenter any other no. to exit..");
		tmp=nrt.nextInt();
		if(tmp==1){System.out.println("enter element to enter..");
			pop=nrt.nextInt();
			Q.enqueue(pop);}
			else if(tmp==2){Q.dequeue();}
			else if(tmp==3){Q.display();}
			else{break;}}
}}
