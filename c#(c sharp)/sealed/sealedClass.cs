using System;

namespace sealedClass
{
    sealed class animal{

    }
    // class dog:animal{}
    // this will give a error...
    class dog{

    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("sealed class");
        }
    }
}
