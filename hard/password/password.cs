using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearnPrograms
{
    internal class Program
    {

        public static string ComprobarPassword(string password)
        {
            int numeros = 0;
            int especiales = 0;

            if (password.Length >= 7)
            {
                foreach (var c in password)
                {
                    int character = (int)c;
                    if (character >= 48 && character <= 57)
                    {
                        numeros++;
                    }
                    else if ((character >= 33 && character <= 38) || character == 64 || character == 42)
                    {
                        especiales++;
                    }

                }

                if(numeros >= 2 && especiales >= 2) { 
                    return "Strong ";
                }
                else
                {

                    return "Weak";
                }
            }
            return "Weak";

        }

        static void Main(string[] args)
        {
            
            string password = Console.ReadLine();

            string comprobar = ComprobarPassword(password);

            Console.WriteLine(comprobar);

            


        }
    }
}
