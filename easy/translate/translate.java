package ejercicios;

import java.util.Scanner;

/**
 * 06/05/2021
 * @author Andre Peralta
 */
public class metodo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String text = entrada.nextLine();
        
        String text_translate = "";
        
        for (int x=text.length()-1;x>=0;x--){
            text_translate = text_translate + text.charAt(x);
            //El método charAt() regresa el caracter en el indice dado
        }
        
        System.out.println(text_translate);
 
        
    }
    
}
