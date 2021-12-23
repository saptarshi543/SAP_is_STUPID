using System;

namespace constructor_overloading
{
    class Program
    {
        Program(int q){
            Console.WriteLine("original constructor..."+q);
        }
        Program(int q,string s){
            Console.WriteLine("overloaded.. "+q+"  "+s);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("constructor overloading..");
           int n=34;
           String s="sap";
            new Program(n);
            new Program(n,s);
        }
    }
}
