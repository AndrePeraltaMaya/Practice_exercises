using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearnPrograms
{
    internal class Program
    {

        public static int CalcularTiempo(string name,int agents, string names)
        {



            names = names + ' ' + name;
            string[] namesList = names.Split(' ');
            Array.Sort(namesList);

            int indice = Array.IndexOf(namesList, name);
            indice += 1;

            //System.Console.WriteLine("indice : " + indice + "agents: " + agents + " = " + indice % agents);

            if (indice%agents == 0)
            {
                return ((indice / agents) * 20 );
            }
            else
            {
                return ((indice / agents) * 20 + 20);
            }

           

        }

        static void Main(string[] args)
        {
            
            string name = Console.ReadLine();
            int agents = Convert.ToInt32(Console.ReadLine());
            string names = Console.ReadLine();

            int tiempo = CalcularTiempo(name,agents,names);

            Console.WriteLine(tiempo);


            


        }
    }
}
