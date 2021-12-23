using System;

namespace methods
{
    class Program
    {
        public void split_num(int n){
            int copy=n;
            while(copy>0){
                Console.WriteLine(copy%10);
                copy/=10;
            }
        }
        static void Main(string[] args)
        {
            Program P=new Program();
            Console.WriteLine("enter a number");
            int user=Convert.ToInt32(Console.ReadLine());
            P.split_num(user);
        }
    }
}
