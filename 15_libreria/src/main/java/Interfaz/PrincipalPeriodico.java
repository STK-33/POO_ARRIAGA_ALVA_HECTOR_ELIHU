
package Interfaz;



import Controles.ManipularPeriodico;
import java.io.*;
import java.util.*;

public class PrincipalPeriodico {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        //menu prinicipal para poder manipular los datos del libros y
        //de los demas documentos
        
        //instancia de ManipularLibros
        
        ManipularPeriodico listadelibrosobj = new ManipularPeriodico();
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la Hemeroteca del tiempo");
            System.out.println("---ARRIAGA ALVA HECTOR ELIHU ------ GRUPO 15--- ");
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1.- Agregar nuevo Periodico");
            System.out.println("2.- Consultar Periodico");
            System.out.println("3.- Consultar todos los Periodico");
            System.out.println("4.- Borrar un Periodico");
            System.out.println("5.- Modificar los datos de un Periodico");
            System.out.println("6.- Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    //agregar libro
                    listadelibrosobj.agregarLibro();
                    
                    break;
                case 2:
                    //consultar libros por el id
                    listadelibrosobj.buscar();
                    break;
                case 3: 
                    //consulta de todos los libros
                    listadelibrosobj.consultaGeneral();
                    break;
                case 4: 
                    listadelibrosobj.borrar();
                    break;
                case 5:
                    listadelibrosobj.modificar();
                    break;
                case 6:
                    System.out.println("Adios gracias por su alma");
                    //cuando vamos a generar el archivo
                    listadelibrosobj.grabar();
                default:
                    System.out.println("Error ingrese una opcion valida");
            }
        
        }while((opcion >= 1)&&(opcion < 6));
    }
    
}
