#define CSHARP
#undef PYHTON

using System;
namespace elif
{
    class Program
    {
        static void Main(string[] args)
        {
            #if(CSHARP && PYTHON)
            Console.WriteLine("CSHARP and PYTHON are defined");
            #elif(CSHARP && !PYTHON)
            Console.WriteLine("CSHARP IS defined but PYTHON is not defined");
            #elif(!CSHARP && PYTHON)
            Console.WriteLine("CSHARP is not defined but PYTHON is defined");
            #else
            Console.WriteLine("CSHARP and PYTHON are both undefined");
            #endif
        }
    }
}
