using System;

namespace line
{
    class Program
    {
        static void Main(string[] args)
        {
            // we will change file name and line no.
            #line 200 "anotherProgram.cs"
            #warning Actual warning was generated in line 10...
        }
    }
}
