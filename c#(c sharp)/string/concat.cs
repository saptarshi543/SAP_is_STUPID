using System;

namespace concat
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1="sap",s2=" stupid";
            Console.WriteLine("String 1:{0}\nstring 2:{1}",s1,s2);
            string joinedString=string.Concat(s1,s2);
            Console.WriteLine("joined string is: {0}",joinedString);
        }
    }
}
