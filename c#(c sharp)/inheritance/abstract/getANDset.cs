using System;

namespace getANDset
{
    abstract class animal{
        protected string name;
        public abstract string Name{
            get;
            set;
        }
    }
    class dog:animal{
        public override string Name{
            get{
                return name;
            }
            set{
                name=value;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            dog d= new dog();
            d.Name="cute";
            Console.WriteLine("name: {0}",d.Name);
        }
    }
}
