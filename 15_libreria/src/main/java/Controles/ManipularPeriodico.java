/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;


//apuntador -> nivel del acceso a la clase, porque esta separada en paquetes
import Documentos.CPeriodico;
import java.util.*;
import java.io.*;

public class ManipularPeriodico implements Serializable{
    
    //vamos a crear un metodo para agregar varios libros
    
    //los objetos que son capaces de soportar diferentes tipos de dato
    
    private ArrayList<CPeriodico> listadelibros;
    
    //un objeto para el archivo de mis libros
    
    private ArchivoP objetoarchivoPeriodico = new ArchivoP();
    /*
    esta clase u objeto es la que se va a encargar de poder
    crear y leer los archivos del documento de libro
    */
    
    //vamos a hacer el crud de libros
    //c create, r read, u update, d delete
    
    @SuppressWarnings("Convert2Diamond")
    public ManipularPeriodico(){
        //vamos a cargar la instancia de la lista de los libros
        listadelibros = new ArrayList<CPeriodico>();
        //vamos aplicar una sobrecarga al objeto para mandar
        //a llamara su lectura correspondiente del archivo creado
        listadelibros = objetoarchivoPeriodico.leer();
    }
    
    //crud
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        //ciclo para solicitar datos de los libros
        while(resp == 's'){
            //hago un objeto de CLibro y mando a llamar al metodo de los datos
            CPeriodico objlibro = new CPeriodico();
            objlibro.aceptarDatos();
            //lo agrego al array
            listadelibros.add(objlibro);
            System.out.println("¿Deseas agregar otro Periodico?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //consultar un libro de forma general
    
    public void consultaGeneral(){
        
        //si hay libros??
        //y si la lista esta vacia que hago?
        if(listadelibros.isEmpty()){
            System.out.println("No hay Periodicos agregados");
        }else{
            //no esta vacia
            System.out.println("Los Periodicos son:");
            //recorrer la lista de los listos
            for(int i = 0; i < listadelibros.size(); i++){
                //System.out.println("El ID del Libro" + listadelibros.get(i));
                System.out.println("Nombre del Periodico: " + listadelibros.get(i).getNombre()+"\n");
                System.out.println("Autor del Periodico: " + listadelibros.get(i).getAutor()+"\n");
                System.out.println("Fecha de publicacion: " + listadelibros.get(i).getEditorial()+"\n");
                System.out.println("Precio del Periodico: " + listadelibros.get(i).getPrecio()+"\n");
            }
        }
    }
    
    //vamos a realizar una busqueda por nombre
    // sangre y fuego de juego de tronos
    private int traePosicion (String buscarNombre){
        int pos = 0;
        boolean existe = false;

        //recorrer la lista de los libros
        for(int i = 0; i < listadelibros.size(); i++){
            //aqui tendria que colocar los casos
            
            //buscar el nombre del libro
            if(buscarNombre.equalsIgnoreCase(listadelibros.get(i).getNombre())){
                //si lo encuentra
                pos = i;
                existe = true;
            }else{
                System.out.println("Periodico no encontrado. Favor de ponerse en contacto con el admin");
            }
        }
        
        if(!existe){
            //porque esta fuera del arreglo o la lista osea no existe
            System.out.println("No existe registro del Periodico");
            pos = -1;
        }
        return pos;
    }
    
    
    //el metodo de la busqueda
    
    //puedo buscar por nombre, editorial, precio
    
    public int buscar(){
        int posbuscar = 0;
        String nombreBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del Periodico que desea buscar");
        nombreBuscar = entrada.nextLine();
        
        posbuscar = traePosicion(nombreBuscar);
        
        //visualizo los datos
        
        System.out.println("Nombre del Periodico: " + listadelibros.get(posbuscar).getNombre());
        System.out.println("Autor del Periodico: " + listadelibros.get(posbuscar).getAutor());
        System.out.println("Fecha de publicacion: " + listadelibros.get(posbuscar).getEditorial());
        System.out.println("Precio del Periodico: " + listadelibros.get(posbuscar).getPrecio());
        
        return posbuscar;
    }
    
    
    public void borrar(){
        
        Scanner entrada = new Scanner(System.in);
        
        String libroborrar;
        int posborrar;
        
        //verificar que lista de libros no este vacia
        
        if(listadelibros.isEmpty()){
            System.out.println("No hay Periodicos registrados");
        }else{
            System.out.println("Eliminar Periodico ");
            posborrar = buscar();
            
            if(posborrar < listadelibros.size()){
                //si esta dentro de la lista
                listadelibros.remove(posborrar);
                System.out.println("Periodico eliminado");
            }else{
                //esta afuera del rango
                System.out.println("Imposible elminar ese registro");
            }
        }
        
        
    }
    
    //modificar
    // autor, editorial, precio
    
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String modificar;
        String opcion = "s";
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del periodico que deseas modificar: ");
        modificar = entrada.nextLine();
        
        
        while("s".equalsIgnoreCase(opcion)){
            posmodificar = traePosicion(modificar);
            
            //ya se obtuvieron los datos
            System.out.println("¿Que dato deseas modificar del Periodico?"
                    + "\n 1.- Autor. "
                    + "\n 2.- Fecha de publicacion"
                    + "\n 3.- Precio"
                    + "\n");
            
            resmod = entrada.nextInt();
            
            switch (resmod) {
                case 1:
                    //autor
                    System.out.println("El autor es: ");
                    System.out.println("Autor: " + listadelibros.get(posmodificar).getAutor());
                    System.out.println("Ingresa el nuevo autor");
                    listadelibros.get(posmodificar).setAutor(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Autor: " + listadelibros.get(posmodificar).getAutor());
                    
                    break;
                    
                case 2:
                    //editorial
                    System.out.println("La Fecha de publicacion es: ");
                    System.out.println("Fecha de publicacion: " + listadelibros.get(posmodificar).getEditorial());
                    System.out.println("Ingresa la nueva Fecha");
                    listadelibros.get(posmodificar).setEditorial(entrada.next());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Fecha de publicacion: " + listadelibros.get(posmodificar).getEditorial());
                    
                    break;
                
                case 3: 
                    //precio
                    System.out.println("El precio es: ");
                    System.out.println("Precio: " + listadelibros.get(posmodificar).getPrecio());
                    System.out.println("Ingresa el nuevo precios");
                    listadelibros.get(posmodificar).setPrecio(entrada.nextFloat());
                    System.out.println("El dato a sido modificado");
                    System.out.println("Precio: " + listadelibros.get(posmodificar).getPrecio());
                    
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("¿Quieres cambiar algun otro dato s/n?");
            opcion = entrada.nextLine();
        }
    }
    
    //para grabar el archivo
    //hacer el archivo para guardar la info de los libros
    
    public void grabar(){
        //mandando a llamar a que se cree el archivo
        getObjetoarchivolibros().serializar(listadelibros);
    }

    public ArrayList<CPeriodico> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<CPeriodico> listadelibros) {
        this.listadelibros = listadelibros;
    }

    @SuppressWarnings("NonPublicExported")
    public ArchivoP getObjetoarchivolibros() {
        return objetoarchivoPeriodico;
    }

    @SuppressWarnings("NonPublicExported")
    public void setObjetoarchivolibros(ArchivoP objetoarchivolibros) {
        this.objetoarchivoPeriodico = objetoarchivolibros;
    }
    
    
    
}