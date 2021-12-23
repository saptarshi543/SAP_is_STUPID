using System;

namespace interfaceExample
{
    interface polygon{
        void calculateArea(int l,int b);
    }
    class rectangle:polygon{
        public void calculateArea(int l,int b){
            int area=l*b;
            Console.WriteLine("area: {0}",area);
            }
    }
    class Program
    {
        static void Main(string[] args)
        {
            rectangle R=new rectangle();
            R.calculateArea(100,200);
        }
    }
}
