using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearnPrograms
{
    internal class Program
    {

        public static string Dejavu(string text)
        {

            string textCopy = "";


            for (int i = 0; i < text.Length; i++)
            {
                if (textCopy.IndexOf(text[i]) != -1)
                {
                    return "Deja Vu";
                }
                textCopy += text[i];
            }

            return "Unique";

        }

        static void Main(string[] args)
        {
            
            string text = Console.ReadLine();

            string revision = Dejavu(text);

            Console.WriteLine(revision);


            


        }
    }
}
