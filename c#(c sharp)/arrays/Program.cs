using System;
using System.Linq;
namespace arrays1
{
    class Program
    {
        static void Main(string[] args)
        // working...success...
        {
            Console.WriteLine("enter number of elements...");
            int len=Convert.ToInt32(Console.ReadLine());
            int[] user=new int[len];
            Console.WriteLine("enter the elements");
            for(int i=0;i<len;i++){
                user[i]=Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("smallest element {0}", user.Min());
            Console.WriteLine("largest element {0}", user.Max());
            Console.WriteLine("sum of all  elements {0}", user.Sum());
            Console.WriteLine("total no. of elements..  {0}",user.Count());
            Console.WriteLine("average of all elements   {0}",user.Average());
        }
    }
}
