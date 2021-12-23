using System;

namespace thisIndexer
{
    class Program
    {
        private string[] name=new string[3];
        public string this[int index]{
            get{
                return name[index];
            }
            set{
                name[index]=value;
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("example of indexer with this in c#");
            Program p1=new Program();
            Console.WriteLine("enter three names");
            p1[0]=Console.ReadLine();
            p1[1]=Console.ReadLine();
            p1[2]=Console.ReadLine();
            for(int i=0;i<3;i++){
                Console.WriteLine(p1[i]+"  at index {0}",i);
            }
        }
    }
}
