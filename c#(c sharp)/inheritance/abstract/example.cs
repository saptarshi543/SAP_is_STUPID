using System;

namespace example
{
    abstract class MotorBike{
        public abstract void brake();
    }
    class SportsBike:MotorBike{
        public override void brake(){
            Console.WriteLine("sports bike brake");
        }
    }
    class MountainBike:MotorBike{
        public override void brake()
        {
            Console.WriteLine("mountain bike brake");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            SportsBike s=new SportsBike();
            MountainBike m=new MountainBike();
            s.brake();
            m.brake();
        }
    }
}
