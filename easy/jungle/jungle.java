package ejercicios;

import java.util.Scanner;

/**
 *06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        /*Esto es para que acepte una entrada con espacios: 
        ejemplo: Rawr Chirp Ssss*/
        System.out.println("Noises: ");
        Scanner input = new Scanner(System.in);
        
        String noises = input.nextLine();

        //Separamos el string por espacios
        String[] NoisesList = noises.split("\\s+");
 
        String ouput = "";
        
        
        for(String item : NoisesList){

            switch (item) 
            {
                case "Grr":  ouput = ouput + "Lion ";
                         break;
                case "Rawr":  ouput = ouput + "Tiger ";
                         break;
                case "Ssss":  ouput = ouput + "Snake ";
                         break;
                case "Chirp":  ouput = ouput + "Bird ";
                         break;
            }
        }
        System.out.println(ouput);    
    }
}
