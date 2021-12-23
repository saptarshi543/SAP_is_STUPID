using System;

namespace methodOverriding
{
    class animal{
        public virtual void eat(){
            Console.WriteLine("i can eat");
        }
    }
    class Dog:animal{
        public override void eat()
        {
            Console.WriteLine("i eat dog food");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Dog d=new Dog();
            d.eat();
        }
    }
}
