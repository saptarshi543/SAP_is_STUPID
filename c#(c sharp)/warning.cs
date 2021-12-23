using System;

namespace warning
{
    class Program
    {
        static void Main(string[] args)
        {
            #if(!CSHARP)
            //explicitly made warning
            #warning CSHARP is undefined
            #endif
            Console.WriteLine("warning directive example");
        }
    }
}
