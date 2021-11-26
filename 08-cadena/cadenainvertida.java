import java.util.*;

public class cadenainvertida{
    Scanner entrada = new Scanner(System.in);
    public void cadenainvertidapalabras(){
        String cadena="";
        System.out.println("ingresa la oracion a invertir:");

        cadena = entrada.nextLine();
        String invertida ="";

        for(int i = cadena.length()-1; i >= 0; i--){
            char car= cadena.charAt(i);
            invertida += car;

            ystem.out.println("la cadena invertida es: "+ invertida);
        }
    }
}