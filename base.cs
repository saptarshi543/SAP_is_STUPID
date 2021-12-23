using System;

namespace baseInCSharp
{
    class animal{
        public virtual void eat(){
            Console.WriteLine("animals eat food.");
        }
    }
    class dog:animal{
        public override void eat()
        {
            base.eat();
            Console.WriteLine("dogs eat dog food.");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            dog d=new dog();
            d.eat();
        }
    }
}
