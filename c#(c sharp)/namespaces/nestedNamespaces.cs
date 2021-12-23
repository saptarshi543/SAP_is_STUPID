using System;
namespace nested{
    namespace nested2{
        public class Sample{
            public static void display(){
            Console.WriteLine("calling from inside a nested namespace");
        }
        }
    }
}
namespace nestedNamespaces
{
    class Program
    {
        static void Main(string[] args)
        {nested.nested2.Sample.display();
        }
    }
}
