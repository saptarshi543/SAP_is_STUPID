using System;

namespace MyNamespace{
    class myClass{
        public static void func(){
            Console.WriteLine("calling from another namespace");
        }
    }
}
namespace namespaces
{
    class Program
    {
        static void Main(string[] args)
        {
            MyNamespace.myClass.func();
        }
    }
}
