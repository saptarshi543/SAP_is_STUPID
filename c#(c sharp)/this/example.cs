using System;

namespace thisInCSharp
{
    class Program
    {
        int num;
        Program(int num){
            this.num=num;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("enter a number");
            int user=Convert.ToInt32(Console.ReadLine());
            Program p1=new Program(user);
            Console.WriteLine("value of num: "+p1.num);
        }
    }
}
