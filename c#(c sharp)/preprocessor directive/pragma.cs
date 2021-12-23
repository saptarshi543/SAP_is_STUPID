using System;

namespace pragma
{
    class Program
    {
        static void Main(string[] args)
        {
            #pragma warning disable
            #warning this is warning 1
            #warning this is warning 2
            #warning this is warning 3
            #warning this is warning 4
            #pragma warning restore
            #warning this is warning 5
        }
    }
}
