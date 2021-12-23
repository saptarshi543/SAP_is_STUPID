using System;

namespace multipleInterfaceExample
{
    interface Ipolygon{
        void calculateArea(int l,int b);
    }
    interface Icolor{
        void getColor();
    }
    class rectangle:Ipolygon,Icolor{
        public void calculateArea(int l,int b){
            int area=l*b;
            Console.WriteLine("area: {0}",area);
        }
        public void getColor(){
            Console.WriteLine("RED Rectangle");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            rectangle r=new rectangle();
            r.calculateArea(100,200);
            r.getColor();
        }
    }
}
