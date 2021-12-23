using System;

namespace structExample
{
    struct example
    {
        public int age;
        public string name;
        public void getAge(int age){
            Console.WriteLine("age: {0}",age);
        }
        public void getName(string name){
            Console.WriteLine("name: {0}",name);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("enter your age and name");
            example E;
            E.age=Convert.ToInt32(Console.ReadLine());
            E.name=Console.ReadLine();
            E.getAge(E.age);
            E.getName(E.name);
        }
    }
}
