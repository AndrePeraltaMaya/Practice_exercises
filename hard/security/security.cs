using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearnPrograms
{
    internal class Program
    {

        public static string ComprobarSeguridad(string pasillo)
        {
            int index = pasillo.IndexOf('$');
            int thief = pasillo.IndexOf('T');

            if (thief > index)
            {

                if( pasillo.Substring(index, thief - index).IndexOf('G') == -1)
                {
                    return "ALARM";
                }
                 

            }
            if (index > thief)
            {
                if(pasillo.Substring(thief, index - thief).IndexOf('G') == -1)
                {
                    return "ALARM";

                }
                 
            }
            

            return "quiet";

        }

        static void Main(string[] args)
        {
            
            string password = Console.ReadLine();

            string comprobar = ComprobarSeguridad(password);

            Console.WriteLine(comprobar);

            


        }
    }
}
