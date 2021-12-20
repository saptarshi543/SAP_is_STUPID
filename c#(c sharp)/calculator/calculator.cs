using System;

namespace calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("welcome to calculator...");
            char op;
            double first,second,result=0.0;
            Console.WriteLine("enter 2 numbers..");
            first=Convert.ToDouble(Console.ReadLine());
            second=Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("enter a operator (+ , - , * , /)");
            op=Convert.ToChar(Console.ReadLine());
            switch(op){
                case '+':
                result=first+second;
                break;
                case '-':
                result=first-second;
                break;
                case '*':
                result=first*second;
                break;
                case '/':
                result=first/second;
                break;
                default:
                Console.WriteLine("error...maybe invalid operator");
                break;
            }
            Console.WriteLine("result= {0}",result);
        }
    }
}
