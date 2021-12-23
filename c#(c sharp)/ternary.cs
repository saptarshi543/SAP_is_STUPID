using System;

namespace if_else
{
    class Program
    {
        static void Main(string[] args)
        //working...success...
        {
            Console.WriteLine("enter your age");
            int user;
            String tmp=Console.ReadLine();
            user=Convert.ToInt32(tmp);
            if(user>=18){Console.WriteLine("eligible to vote");}
            else{Console.WriteLine("not eligible to vote");}
        }
    }
}
