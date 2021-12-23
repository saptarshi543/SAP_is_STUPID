using System;

namespace sealedMethod
{
    class animal{
        public virtual void makeSound(){Console.WriteLine("bark bark");}
    }
    class dog:animal{
        // public sealed override void makeSound()
        // this will give an error
        public override void makeSound(){Console.WriteLine("dog sound");
        }
    }
    class puppy:dog{
        public override void makeSound(){
            Console.WriteLine("puppy sound");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            puppy P=new puppy();
            P.makeSound();
        }
    }
}
