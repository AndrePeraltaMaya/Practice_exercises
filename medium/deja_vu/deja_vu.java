package ejercicios;
import java.util.Scanner;
/**
 *09/05/2021
 * @author Andre Peralta
 */
public class metodo {
   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Text: ");
        String text = input.nextLine();
        
        String repit = "";
        
        for (int i = 0; i < text.length(); i++) {
            
           if(repit.indexOf(text.charAt(i)) != -1){
               System.out.println("Deja Vu");
               break;
           }
           else{
               repit = repit + text.charAt(i);
           }
           if(i+1 == text.length()){
               System.out.println("Unique");
           }
       }
    }
}
