using System;

namespace compare
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1="same",s2="same",s3="different";
            Console.WriteLine("String 1:{0}\nstring 2:{1}\n string 3:{2}",s1,s2,s3);
            Boolean result1=s1.Equals(s2);
            Boolean result2=s1.Equals(s3);
            Console.WriteLine("\n\nstring 1 and 2 are equal {0}\nstring 1 and 3 equal {1}",result1,result2);
        }
    }
}
