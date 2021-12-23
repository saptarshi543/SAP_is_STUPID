using System;

namespace thisAsAnObject
{
    class Program
    {
        int n1,n2;
        Program(){
            n1=22;
            n2=13;
        }
        public void passParameter(Program p1){
            Console.WriteLine("num1: {0}\nnum2: {1}",n1,n2);
        }
        public void display(){
            passParameter(this);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("example of this as an object");
            Program p=new Program();
            p.display();
        }
    }
}
