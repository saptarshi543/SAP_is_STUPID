using System;

namespace nested
{
    public class Car{
        public void displayCar(){
            Console.WriteLine("Car: Nissan 350z");
        }
        public class Engine{
            public void displayEngine(){
                Console.WriteLine("engine: Petrol Engine");
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Car C=new Car();
            C.displayCar();
            Car.Engine petrolEngine=new Car.Engine();
            petrolEngine.displayEngine();
        }
    }
}
