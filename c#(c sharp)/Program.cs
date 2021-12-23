using System;

namespace class_eg
{
    // working.....
    //example of a class
    class Dog
    {
        String breed;
        public void bark(){
            Console.WriteLine("bark! bark!");
        }
        static void Main(string[] args)
        {
            Console.WriteLine("examples of class in c# !");
            Dog bull_dog=new Dog();
            bull_dog.breed="St. Bernard";
            Console.WriteLine(bull_dog.breed);
            bull_dog.bark();
        }
    }
}
