using System;

namespace inheritance
{
    public class animal{
        public string name;
        public void display(){
            Console.WriteLine("i am an animal");
        }
    }
    public class Dog : animal{
        public void getName(){
            Console.WriteLine("my name is {0}",name);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Dog st_bernard=new Dog();
            st_bernard.name="cute";
            st_bernard.display();
            st_bernard.getName();
        }
    }
}
