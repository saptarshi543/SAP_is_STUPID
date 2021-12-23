using System;

namespace structConstructor
{
    struct example
    {
        public string name;
        public example(string n){
            name=n;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            example E=new example("sapIsStupid");
            Console.WriteLine("name: {0}",E.name);
        }
    }
}
