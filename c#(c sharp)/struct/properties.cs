using System;

namespace structProperties
{
    struct example
    {
        public int id;
        public int Id{
            get{return id;}
            set{
                id=value;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            example E=new example();
            E.Id=2;
            Console.WriteLine("id: {0}",E.Id);
        }
    }
}
