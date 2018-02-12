using PC.Framework;
using System;

namespace PC.Freamwork.Test
{
    class Program
    {
        static void Main(string[] args)
        {
            string txt = "<script>alert(1);<script><h1>Hello World!</h1><br/>";
            string enc = Security.AntiXSS(txt);
            Console.WriteLine(txt);
            Console.WriteLine(enc);
        }
     }
}
