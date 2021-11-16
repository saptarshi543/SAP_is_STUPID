import java.util.*;
/*working...success....*/
class circularQueue{
	int size,front,rear;
	int items[];
	circularQueue(int s){size = s;front=-1;rear=-1;items=new int[s];}
	boolean isFull(){
		if(front==0 && rear==size-1){return true;}
		if(front==rear+1){return true;}
		return false;}
	boolean isEmpty(){
		if(front==-1){return true;}
		else{return false;}}
	void enqueue(int x){
		if(isFull()){System.out.println("queue is full");}else{
			if(front==-1){front=0;}
			rear=(rear+1)%size;
			items[rear]=x;
			System.out.println("inserted.."+x);}}
	int dequeue(){
		int element;
		if(isEmpty()){System.out.println("queue is empty");return (-1);}else{
			element=items[front];
			if(front==rear){front=-1;rear=-1;}else{front=((front+1)%size);}
			return element;
		}}
	void display(){int i;if(isEmpty()){System.out.println("empty queue");}else{
			System.out.println("front.."+front);System.out.println("items...");
			for(i=front;i!=rear;i=(i+1)%size){
				System.out.print(items[i]+" ");}
				System.out.println(items[i]);
				System.out.println("rear..."+rear);}}
	public static void main(String ff[]){
		Scanner nrt=new Scanner(System.in);
		System.out.println("enter capacity...");int cap=nrt.nextInt(),tmp,top,pop;
		circularQueue CQ=new circularQueue(cap);
		while(true){
		System.out.println("1: add\t 2:remove\t 3: show queue\nenter any other no. to exit..");
		tmp=nrt.nextInt();
		if(tmp==1){System.out.println("enter element to enter..");
			pop=nrt.nextInt();
			CQ.enqueue(pop);}
			else if(tmp==2){System.out.println("deleted element.."+(CQ.dequeue()));}
			else if(tmp==3){CQ.display();}
			else{break;}
		}
	}
	}