using System;

namespace inheritingInnerClass
{
    // outer class
    public class computer{
        public class cpu{
            public void display(){
                Console.WriteLine("cpu");
            }
        }
    }
    class laptop:computer.cpu{

    }
    class Program
    {
        static void Main(string[] args)
        {
            laptop L=new laptop();
            L.display();
        }
    }
}
