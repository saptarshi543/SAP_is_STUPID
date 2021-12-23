using System;

// static constructors are called only once no matter how many instances are run

namespace static_constructor
{
    class Program
    {
        static Program(){
            Console.WriteLine("this is a static constructor ..it will run only once..");
        }
        Program(){
            Console.WriteLine("normal consrtuctor...");
        }
        static void Main(string[] args)
        {
            // Console.WriteLine("examples of static constructor");
            Program p1=new Program();
            Program p2=new Program();
            Program p3=new Program();
        }
    }
}
