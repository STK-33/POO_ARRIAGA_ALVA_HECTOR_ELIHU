package Interfaz;



import Interfaz.*;
import java.io.*;
import java.util.*;

public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu prinicipal para poder manipular los datos del libros y
        //de los demas documentos
        
        //instancia de ManipularLibros
         
        
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la Bliblioteca Virtual Patitos SA de CV");
            System.out.println("---ARRIAGA ALVA HECTOR ELIHU ------ GRUPO 15--- ");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1.- GESTIONAR LIBROS");
            System.out.println("2.- GESTIONAR REVISTAS");
            System.out.println("3.- GESTIONAR PERIODICOS");
            System.out.println("4.- SALIR");
            
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    // libro
                   PrincipalLibro.main(args);
                    break;
                case 2:
                     //revistas
                     PrincipalRevista.main(args);
                    break;
                case 3: 
                     //periodicos
                     PrincipalPeriodico.main(args);
                    break;
                case 4:
                    // salir
                    System.out.println("Adios gracias por su alma");
                    break;
                
                default:
                    System.out.println("Error ingrese una opcion valida");
            }
        
        }while((opcion >= 1)&&(opcion < 4));
    }

    
    
}
