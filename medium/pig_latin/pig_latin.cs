using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearnPrograms
{
    internal class Program
    {

        public static string PigLatin(string text)
        {

            string textConvertido = "";

            string[] words = text.Split(' ');


            foreach (string word in words)
            {
                textConvertido += word.Substring(1, word.Length - 1) + word[0] + "ay " ; 
            }

            return textConvertido;

        }

        static void Main(string[] args)
        {
            
            string text = Console.ReadLine();

            string conversion = PigLatin(text);

            Console.WriteLine(conversion);


            


        }
    }
}
