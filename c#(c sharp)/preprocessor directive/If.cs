#define CSHARP
using System;
namespace If
{
    class Program
    {
        static void Main(string[] args)
        {
            #if(CSHARP)
            Console.WriteLine("CSHARP is defined");
            #endif
        }
    }
}
