using System;

namespace constructor
{
    abstract class animal{
        public animal(){
            Console.WriteLine("animal constructor");
        }
    }
    class dog:animal{
        public dog(){
            Console.WriteLine("dog constructor");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            dog d=new dog();
        }
    }
}
