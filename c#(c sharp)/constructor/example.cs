using System;

namespace constructor
{
    class Program
    {
        Program(){
            Console.WriteLine("I am a constructor...\n i am called automatically");
        }
        static void Main(string[] args)
        {
            Console.WriteLine("examples of constructors...\n\n");
            new Program();
        }
    }
}
