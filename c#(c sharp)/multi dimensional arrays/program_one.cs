using System;

namespace multi_dimensional
{
    class Program
    {
        static void Main(string[] args)//working...
        {
            Console.WriteLine("enter 2 values");
            int row=Convert.ToInt32(Console.ReadLine()),column=Convert.ToInt32(Console.ReadLine());
            int[ , ] x=new int[row,column];
            // row=3 column=2
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    Console.WriteLine("enter element at Row {0} Column {1}",i,j);
                    x[i,j]=Convert.ToInt32(Console.ReadLine());
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    Console.WriteLine("element at ROW {0} COLUMN {1} is {2}",i,j,x[i,j]);
                }
            }
        }
    }
}
