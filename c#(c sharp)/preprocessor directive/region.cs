using System;

namespace region
{
    class Program
    {
        // it works only in vs code
        static void Main(string[] args)
        {
            #region region1
            Console.WriteLine("Hello World!");
            Console.WriteLine("Hello World!");
            Console.WriteLine("Hello World!");
            Console.WriteLine("Hello World!");
            Console.WriteLine("Hello World!");
            #endregion

            #region  region2
           Console.WriteLine("Hello World");
           Console.WriteLine("Hello World");
           Console.WriteLine("Hello World");
           Console.WriteLine("Hello World");
           Console.WriteLine("Hello World");
            #endregion
        }
    }
}
