package ejercicios;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        
        System.out.println("Mi name : ");
        String mi_name = input.next();
        
        System.out.println("Number of agents : ");
        int agents = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Names : ");
        String people_names = input.nextLine();

        //Separamos el string por espacios
        String[] p_names = people_names.split("\\s+");
        
        LinkedList<String> names_list = new LinkedList();
        
        //Pasamos de String[] a LinkedList para usar el metodo sort
        for(String name: p_names){
            names_list.add(name.toLowerCase());
            //En minusculas para que haya problemas co sort
        }
        names_list.add(mi_name.toLowerCase());
        Collections.sort(names_list);
        
        //Obtenemos la posición de mi nombre con la lista ya ordenada
        int posicion = names_list.indexOf(mi_name);
        //Hacemos el pequeno calculo con respecto al número de agentes
        double calculation = Math.ceil(posicion+1/agents)*20;
        
        System.out.println((int)calculation);

   }
}
