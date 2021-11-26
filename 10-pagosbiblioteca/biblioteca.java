import java.util.Scanner;
import java.util.*;
import javax.swing.*;
public class biblioteca {
    // las funciones 
    //prestamos de libros
    Scanner entrada = new Scanner(System.in);
    //autor,titulo,isbn,genero
    //ejemplares,costodel prestamo,
     String titulo, autor, isbn, genero;
     int ejemplares;
     double costo_prestamo, total;

     public void Libros(){
         //menu para el prestamo del libro

         //agreagr el try catch para manejo de errores
         //identificar si son variables publicas o privados para el manejo de datos
         String text;
         text = JOptionPane.showInputDialog("elija la funcion que desea ejecutar"
                                    +"\n 1. Prestamo del libro"
                                    +"\n 2. Devolucion del libro");
            int opcion;
            opcion = Integer.parseInt(text);

            switch(opcion){
                case 1:
                prestamo();
                break;
                case 2:
                devolucion();
                break;
                default:
                JOptionPane.showInputDialog("gracias por usar el programa de prestamos de libros");
                break;
            }
     }

     public void prestamo(){
         /*
         lo primero es qu deberan de crear los objetos libros
         donde cada uno de ustedes debera de tener 5 libros diferentes
         se debera de precarga la informacion del libro 

        primero creas clase libro
         objeto libre  drama = ew libro("lacumbre escarlata","autor","12345.bn",5)
         objeto libro  fantasmas = new libro("las cronicas mutantes","autor","12345.bn",3)

        segundo
         Tiene que aparecer la lista de todos los libros
        tercero
         ingrese el titulo que desea para su prestamo, y la cantidad de libros la debes de ir registrando
         porque se debe de preguntar , si sesea agragar otro libro (ciclo for  si d)

        cuarto 
         se debe vidsualizar los datos del libro que se presto y quedan x cantidad de exixtencias

         */
     }

     public void devolucion(){
         /*
         primero 
            buscar en el sistema el libro que se presto

        segundo
            cambiar el estado de ese prestamo -> volver a sumar la cantidad del ejemplar
        tercero
            visualizar los datos del libro de nuevo  con los datos actualizado
         */
     }
}
