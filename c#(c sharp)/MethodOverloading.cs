using System;

namespace method_overloading
{
    // working...success..
    class Program
    {
        public void print(int n){
            Console.WriteLine("inside original\n"+n);
        }
        public void print(int n,String s){
            Console.WriteLine("in overloaded\n"+n+" "+s);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("examples of method overloading...");
            Program p=new Program();
            p.print(12);
            p.print(13,"sap");
        }
    }
}
