package ejercicios;
import java.util.*;
/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("String in PigLatin  : ");
        String message = input.nextLine();
        
        String[] message_list = message.split("\\s+");
        
        for(String word: message_list){
            System.out.print(word.substring(1,word.length())+ 
                    word.substring(0,1)+ "ay ");
        }

    }
}
