import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
import java.lang.Math;
import java.text.DecimalFormat;


public class proveedores {
    //suma de lso costos  costo mayor costo menor  costo promedio  costo total de los productos
    private String nombre_cliente;
    private String producto [] = new String[10];
    private int costo[] = new int[10];
    private int producto_existente[] = new int[10];
    char letra;
    Scanner entrada = new Scanner(System.in);
    int opcione = 0;
    public ArrayList<libro> listalibros = new ArrayList<libro>();
    //1-20

    //menu
    public void menudeproovedores(){
        String text;
        //try catch para manejo de errores
        try{
             //un ciclo do while para repeti las opcioness
            do{
                text = JOptionPane.showInputDialog("seleccione la funcion deseada: "
                +"\n 1. Suma total de costos"
                +"\n 2. Costo mayor"
                +"\n 3. Costo menor"
                +"\n 4. Costo promedio"
                +"\n 5. Costo total del producto");
    
                opcione = entrada.nextInt();
    
               
        switch (opcione) {
                case 1 :
                suma();
                break;
                case 2 :
                costomayor();
                break;
                case 3 :
                costomenor();
                break;
                case 4 :
                costopromedio();
                break;
                case 5 :
                costototaldelproducto();
                break;
        
            default:
                break;
            }
            
                System.out.println("Desea repetir el programa? S para repetir");
                letra = entrada.next().charAt(0);
    
            }while(letra == 's' || letra == 'S');
            
        }catch(Exception e){
            System.out.println("Ingresa unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

            
        }
       
        /*
        de los libros que se crearon deberan de agregar la clase costo aplicando herencia
        para que se pueda manejar el costo de cada libro

        Libro drama = new libro(La cumbre escarlata, nome lo se, 12345-bn,5,44);
         objeto libro  fantasmas = new libro("las cronicas mutantes","autor","12345.bn",3,608)

        si elijo la opcion 1 total del costo de la cumbre escarlata : 5*44

        si elijo la opcion 2 se debe de obtener cual  es el libro que tiene mayor costo: las cronicas

        si elijo la opcion 3 debe de salir el libro comprado mas barato:  la cumbre escarlata
        
        si elijo la opcion 4 de debe de sacar el promedio de los costos de los libros

        si la opcion 5 : deben de multiplicar cantidad de libros de los ejemplares * cost

        */

        //aqui ahay que agregar el menu de las opciones
       
    }
     public void suma(){
        String nombreCliente, nombre_libro1,nombre_libro2,nombre_libro3;
        double costoPorLibro,costoPorLibro2,costoPorLibro3, descuento, total,sumatotal;
        int  cantidadLibros, porcentajeDescuento,tipoCliente = 0;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        nombre_libro1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro1: ");
        nombre_libro2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro2: ");
        nombre_libro3 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro3: ");
        cantidadLibros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de libros que se llevarán:")
        );
        
        costoPorLibro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro1: ")
        );
        costoPorLibro2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro2: ")
        );
        costoPorLibro3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro3: ")
        );
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento = 30;
                
                break;
            case 2:
                porcentajeDescuento = 20;
                break;
            case 3:
                porcentajeDescuento = 10;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        total = (cantidadLibros);
        descuento = (total * porcentajeDescuento) / 100;
        sumatotal = (costoPorLibro+costoPorLibro2+costoPorLibro3);
        JOptionPane.showMessageDialog(
            null, 
            "Factura a nombre de: " + nombreCliente + "\n"
            +  nombre_libro1 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro) + "\n"
            +  nombre_libro2 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro2) + "\n"
            +  nombre_libro3 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro3) + "\n"
            + "Sumatotal: $" + formatter.format(sumatotal) + "\n"
            + "Descuento: - $" + formatter.format(descuento) + "\n"
            + "Total a pagar: $" + formatter.format(sumatotal - descuento)
        );
    }
    public void costomayor(){
        String nombreCliente, nombre_libro1,nombre_libro2,nombre_libro3;
        double costomayor, costoPorLibro,costoPorLibro2,costoPorLibro3, descuento, total,sumatotal;
        int  cantidadLibros, porcentajeDescuento,tipoCliente = 0;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        nombre_libro1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro1: ");
        nombre_libro2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro2: ");
        nombre_libro3 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro3: ");
        cantidadLibros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de libros que se llevarán:")
        );
        
        costoPorLibro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro1: ")
        );
        costoPorLibro2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro2: ")
        );
        costoPorLibro3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro3: ")
        );
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento = 30;
                
                break;
            case 2:
                porcentajeDescuento = 20;
                break;
            case 3:
                porcentajeDescuento = 10;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        total = (cantidadLibros * costoPorLibro);
        descuento = (total * porcentajeDescuento) / 100;
        sumatotal = (costoPorLibro+costoPorLibro2+costoPorLibro3);
        
        if (costoPorLibro > costoPorLibro2) {
            if ( costoPorLibro > costoPorLibro3) {
                JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro mayor es: $" + formatter.format(costoPorLibro) + "\n");                                            
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Factura a nombre de: " + nombreCliente + "\n"
                    +  nombre_libro1 +"  " + "Costo del libro mayor es: $" + formatter.format(costoPorLibro3) + "\n");     
            }
        } else if ( costoPorLibro2 > costoPorLibro3) {
            JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro mayor es: $" + formatter.format(costoPorLibro2) + "\n");
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro mayor es: $" + formatter.format(costoPorLibro3) + "\n");
        }
        
        
    }
    public void costomenor(){
        String nombreCliente, nombre_libro1,nombre_libro2,nombre_libro3;
        double costomayor, costoPorLibro,costoPorLibro2,costoPorLibro3, descuento, total,sumatotal;
        int  cantidadLibros, porcentajeDescuento,tipoCliente = 0;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        nombre_libro1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro1: ");
        nombre_libro2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro2: ");
        nombre_libro3 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro3: ");
        cantidadLibros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de libros que se llevarán:")
        );
        
        costoPorLibro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro1: ")
        );
        costoPorLibro2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro2: ")
        );
        costoPorLibro3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro3: ")
        );
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento = 30;
                
                break;
            case 2:
                porcentajeDescuento = 20;
                break;
            case 3:
                porcentajeDescuento = 10;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        total = (cantidadLibros * costoPorLibro);
        descuento = (total * porcentajeDescuento) / 100;
        sumatotal = (costoPorLibro+costoPorLibro2+costoPorLibro3);
        
        if (costoPorLibro < costoPorLibro2) {
            if ( costoPorLibro < costoPorLibro3) {
                JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro menor es: $" + formatter.format(costoPorLibro) + "\n");                                            
            } else {
                JOptionPane.showMessageDialog(
                    null, 
                    "Factura a nombre de: " + nombreCliente + "\n"
                    +  nombre_libro1 +"  " + "Costo del libro menor es: $" + formatter.format(costoPorLibro3) + "\n");     
            }
        } else if ( costoPorLibro2 < costoPorLibro3) {
            JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro menor es: $" + formatter.format(costoPorLibro2) + "\n");
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                +  nombre_libro1 +"  " + "Costo del libro menor es: $" + formatter.format(costoPorLibro3) + "\n");
        }
        
    }
    public void costopromedio(){
        String nombreCliente, nombre_libro1,nombre_libro2,nombre_libro3;
        double costoPorLibro,costoPorLibro2,costoPorLibro3, descuento, total,sumatotal,totalpagar;
        int  cantidadLibros, porcentajeDescuento,tipoCliente = 0;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        nombre_libro1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro1: ");
        nombre_libro2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro2: ");
        nombre_libro3 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro3: ");
        cantidadLibros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de libros que se llevarán:")
        );
        
        costoPorLibro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro1: ")
        );
        costoPorLibro2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro2: ")
        );
        costoPorLibro3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro3: ")
        );
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento = 30;
                
                break;
            case 2:
                porcentajeDescuento = 20;
                break;
            case 3:
                porcentajeDescuento = 10;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        total = (cantidadLibros * costoPorLibro);
        totalpagar=(costoPorLibro+costoPorLibro2+costoPorLibro3);
        descuento = (total * porcentajeDescuento) / 100;
        sumatotal = (costoPorLibro+costoPorLibro2+costoPorLibro3)/ 3;
        JOptionPane.showMessageDialog(
            null, 
            "Factura a nombre de: " + nombreCliente + "\n"
            +  nombre_libro1 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro) + "\n"
            +  nombre_libro2 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro2) + "\n"
            +  nombre_libro3 +"  " + "Costo del libro: $" + formatter.format(costoPorLibro3) + "\n"
            + "Promedio del precio es: $" + formatter.format(sumatotal) + "\n"
            + "Descuento: - $" + formatter.format(descuento) + "\n"
            + "Total a pagar: $" + formatter.format(totalpagar - descuento)
        );
    }
    public void costototaldelproducto(){
        String nombreCliente, nombre_libro1,nombre_libro2,nombre_libro3;
        double costoPorLibro,costoPorLibro2,costoPorLibro3, descuento, total,total2,total3,sumatotal,totalpagar;
        int  cantidadLibros,cantidadLibros2,cantidadLibros3, porcentajeDescuento,tipoCliente = 0;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        nombre_libro1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro1: ");
        cantidadLibros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el numero de libros que se llevaran:")
        );
        nombre_libro2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro2: ");
        cantidadLibros2 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el numero de libros que se llevaran:")
        );
        
        nombre_libro3 = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro3: ");
        cantidadLibros3 = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el numero de libros que se llevaran:")
        );
        
        costoPorLibro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro1: ")
        );
        costoPorLibro2 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro2: ")
        );
        costoPorLibro3 = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por libro3: ")
        );
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento = 30;
                
                break;
            case 2:
                porcentajeDescuento = 20;
                break;
            case 3:
                porcentajeDescuento = 10;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
        total = (cantidadLibros * costoPorLibro);
        total2 = (cantidadLibros2 * costoPorLibro2);
        total3 = (cantidadLibros3 * costoPorLibro3);
        totalpagar=(total+total2+total3);
        descuento = (total * porcentajeDescuento) / 100;
       
        JOptionPane.showMessageDialog(
            null, 
            "Factura a nombre de: " + nombreCliente + "\n"
            +  nombre_libro1 +"  " + "El Costo de los ejemplares es: $" + formatter.format(total) + "\n"
            +  nombre_libro2 +"  " + "El Costo de los ejemplares es: $" + formatter.format(total2) + "\n"
            +  nombre_libro3 +"  " + "El Costo de los ejemplares es: $" + formatter.format(total3) + "\n"
            + "Descuento: - $" + formatter.format(descuento) + "\n"
            + "Total a pagar: $" + formatter.format(totalpagar - descuento)
        );
    }
    
}

