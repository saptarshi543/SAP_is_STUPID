using System;

namespace invokeConstructor
{
    class Program
    {
        Program(int n1,int n2){
            Console.WriteLine("constructor with 2 parameters  {0} {1}",n1,n2);
        }
        Program(int n):this(11,43){
            Console.WriteLine("invoke constructor..{0}",n);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("examples of invoke constructor\nenter a number");
            int user=Convert.ToInt32(Console.ReadLine());
            Program p=new Program(user);
        }
    }
}
