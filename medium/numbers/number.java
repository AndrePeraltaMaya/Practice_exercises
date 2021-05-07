package ejercicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Text : ");
        String text = input.nextLine();
        
        Map<String,String> dict_numbers = new HashMap();
        
        dict_numbers.put("0","zero");
        dict_numbers.put("1","one");
        dict_numbers.put("2","two");
        dict_numbers.put("3","three");
        dict_numbers.put("4","four");
        dict_numbers.put("5","five");
        dict_numbers.put("6","six");
        dict_numbers.put("7","seven");
        dict_numbers.put("8","eight");
        dict_numbers.put("9","nine");    
        
        text = text.replace("10","ten");
        
        //De esta manera iteramos sobre un HashMap
        for (Map.Entry<String, String> entry : dict_numbers.entrySet()) {
            //entry.getKey(), entry.getValue() es para obtener la key t el valor
            text = text.replace(entry.getKey(), entry.getValue());
        }
        
        System.out.println(text);

    }
}
