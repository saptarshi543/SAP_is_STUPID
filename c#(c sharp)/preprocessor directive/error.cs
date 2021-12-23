using System;

namespace error
{
    class Program
    {
        static void Main(string[] args)
        {
            #if(!CSHARP)
            //explicitly made error
            #error CSHARP is undefined
            #endif
            Console.WriteLine("error directive example");
        }
    }
}
