using System;

namespace vowel
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello there...\n enter an alphabet or a letter");
            char tmp=Convert.ToChar(Console.ReadLine());
            switch(Char.ToLower(tmp)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                Console.WriteLine("VOWEL");
                break;
                default:
                Console.WriteLine("NOT A VOWEL");
                break;
            }
        }
    }
}
