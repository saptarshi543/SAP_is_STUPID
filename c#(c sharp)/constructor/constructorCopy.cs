using System;

namespace constructor_copy
{
    class Program
    {
        string brand;
        Program(string _brand){
            brand=_brand;
        }
        Program(Program p){
            brand=p.brand;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("examples of copy constructors");
            Program p1=new Program("BRAND 1");
            Console.WriteLine("brand of p1: "+p1.brand);
            Program p2=new Program(p1);
            Console.WriteLine("brand of p2: "+ p2.brand);
        }
    }
}
