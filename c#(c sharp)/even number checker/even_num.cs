using System;
namespace even_num{
    class Program{
        static void Main(string[] args){
            // working...
            int user;
            String tmp;
            Console.WriteLine("today we will check if a number is even or not..\n enter a number");
            tmp=Console.ReadLine();
            user=Convert.ToInt32(tmp);
            String ans=(user%2==0)?"even number":"not even number";
            Console.WriteLine(ans);
        }
    }
}
