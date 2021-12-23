using System;

namespace abstractMethod
{
    abstract class animal{
        public abstract void makeSound();
    }
    class dog:animal {
        public override void makeSound()
        {Console.WriteLine("bark bark");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            dog d=new dog();
            d.makeSound();
        }
    }
}
