using System;

namespace Protectedinheritance
{
    class animal{
        protected void eat(){
            Console.WriteLine("i can eat");
        }
    }
    class Program:animal
    {
        static void Main(string[] args)
        {
            Program p=new Program();
            p.eat();
            // p.eat will only work if the class Program is inheriting 
            // from class animal otherwise not...
        }
    }
}
