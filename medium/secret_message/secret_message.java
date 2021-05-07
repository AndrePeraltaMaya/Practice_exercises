package ejercicios;
import java.util.*;
/**
 *07/05/2021
 * @author Andre Peralta
 */
public class metodo {



   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Mensaje : ");
        String s=sc.nextLine();
        char []ch= s.toCharArray();//Pasamos el string a un array de tipo char
        
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))

                if(ch[i]>=97&&ch[i]<=122)
                /*Se pueden hacer operaciones con los char
                    Por ejemplo pasar de cha a algun elemento del codigo ASCII
                    */
                ch[i]=(char)(122-(int)ch[i]+97);//O pasar de ASCII a char

            else if(ch[i]>=65&&ch[i]<=90)
            ch[i]=(char)(90-(int)ch[i]+65);
        }
        String op=new String(ch);
        System.out.println(op.toLowerCase());
   
    }
}
