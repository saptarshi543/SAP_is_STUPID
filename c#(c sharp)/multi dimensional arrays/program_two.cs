using System;

namespace multi_dimensional2
{
    class Program
    {
        static void Main(string[] args)
        {//working...
             Console.WriteLine("enter 2 values");
            int row=Convert.ToInt32(Console.ReadLine()),column=Convert.ToInt32(Console.ReadLine());
            int[ , ] x=new int[row,column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    Console.WriteLine("enter element at Row {0} Column {1}",i,j);
                    x[i,j]=Convert.ToInt32(Console.ReadLine());
                }
            }
            Console.WriteLine("\n \n");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                  Console.Write("{0}  ",x[i,j]); 
                }
                Console.WriteLine();
            }
        }
    }
}
