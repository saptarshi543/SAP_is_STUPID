using System;

namespace sum_of_natural_num
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("we will find the sum of first n number of natural numbers...!");
            Console.WriteLine("enter value of n");
            int n=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("result =  {0}",((n*(n+1))/2));
        }
    }
}
