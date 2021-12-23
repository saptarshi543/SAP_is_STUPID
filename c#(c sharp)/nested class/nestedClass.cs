using System;

namespace CsharpNestedClass
{
    // outer class
    public class car{
        public string brand="Bugatti";
        // nested class 
        public class engine{
            public void displayCar(){
                car c=new car();
                // this object creation won't be required if string is declared static
                Console.WriteLine("brand: "+c.brand);
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            car.engine e=new car.engine();
            e.displayCar();
        }
    }
}
