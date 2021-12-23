using System;

namespace referenceVariable
{
    interface Ipolygon{
        void calculateArea(int l,int b);
    }
    class rectangle:Ipolygon{
        public void calculateArea(int l,int b){
            int area=l*b;
            Console.WriteLine("Area: {0}",area);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Ipolygon r=new rectangle();
            r.calculateArea(100,200);
        }
    }
}
