
package modelo;

import java.util.ArrayList;
import java.util.Iterator;


public class operacion_vehiculos {

   static ArrayList<vehiculo> cargarProduc = new ArrayList<vehiculo>();
    static ArrayList<String> listCateg = new ArrayList<String>();
    ArrayList<String> cargListCatg;

    //Agregar Categorias
    public void AddCategorias(String Categoria) {
        try {
            listCateg.add(Categoria);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        // return listCateg;
    }//fin
    //IMPRIMIR CATEGORIAS
    public ArrayList imprimirCategorias(String dato) {
        Iterator<String> nombreIterator = listCateg.iterator();
        cargListCatg = new ArrayList<String>();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + " / ");
            cargListCatg.add(elemento);
        }
        return cargListCatg;
    }

   //Agregar productos a la lista
     public void AddListProducto(String cat,String prod,String um, double prec, String imagen) {//Verificar si puedo llenar tablas con este metodo
        try {          
            cargarProduc.add(new vehiculo(cat, prod, um,prec,imagen));   
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//fin

    
    //public vehiculo(String categoria, String vehiculo, String um, double precio)
    public ArrayList CargarListProducto(String dato) {//Verificar si puedo llenar tablas con este metodo
        try {
            // cn = bd.Conectar();
            // cargarProduc = new ArrayList<producto>();  
           // cargarProduc.clear();
            
            cargarProduc.add(new vehiculo("Automovil", "Sedan", "1200kg", Double.parseDouble("78.00"), "auto.jpg"));
            cargarProduc.add(new vehiculo("Automovil", "Pickup", "1800kg", Double.parseDouble("78.00"), "pick.jpg"));
            cargarProduc.add(new vehiculo("Automovil", "Cabriolet", "900kg", Double.parseDouble("78.00"), "cabrio.jpg"));
            

            cargarProduc.add(new vehiculo("Camion", "2 Ejes", "2400kg", Double.parseDouble("120.0"), "2 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "3 Ejes", "3600kg", Double.parseDouble("120.0"), "3 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "4 Ejes", "4500kg", Double.parseDouble("145.00"), "4 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "5 Ejes", "5700kg", Double.parseDouble("170.00"), "5 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "6 Ejes", "6600kg", Double.parseDouble("195.00"), "6 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "7 Ejes", "7200kg", Double.parseDouble("220.00"), "7 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "8 Ejes", "8100kg", Double.parseDouble("245.00"), "8 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "9 Ejes", "9000kg", Double.parseDouble("270.00"), "9 ejes.jpg"));
            cargarProduc.add(new vehiculo("Camion", "Mas de 9 Ejes", "15000kg", Double.parseDouble("295.00"), "9 ejes.jpg"));

            cargarProduc.add(new vehiculo("Motocicleta", "Mototneta", "120cc.", Double.parseDouble("56.0"), "moto.jpg"));
            cargarProduc.add(new vehiculo("Motocicleta", "Trail", "150cc.", Double.parseDouble("56.0"), "moto.jpg"));
            cargarProduc.add(new vehiculo("Motocicleta", "Supermotard", "300cc.", Double.parseDouble("56.0"), "moto.jpg"));
            cargarProduc.add(new vehiculo("Motocicleta", "Naked", "1000cc.", Double.parseDouble("56.0"), "moto.jpg"));

            cargarProduc.add(new vehiculo("Vehiculos de Emergencia", "Patrullas", "1800kg", Double.parseDouble("0.0"), "policia.jpg"));
            cargarProduc.add(new vehiculo("Vehiculos de Emergencia", "Ambulancias", "3000kg", Double.parseDouble("0.0"), "ambulancia.jpg"));
            cargarProduc.add(new vehiculo("Vehiculos de Emergencia", "Bomberos", "6000kg", Double.parseDouble("0.0"), "bombero.jpg"));


            
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return cargarProduc;
    }//fin

    //imprimir para comprobar
  /*  ArrayList<producto> prueba;
    public void impirmriPorductos(String dato) {
       
        prueba = CargarListProducto("");
        for (vehiculo pd : prueba) {
            System.out.println(pd.getCategoria()+ " "+pd.getProducto()+ "  "+pd.getImagen());        
        }   
    }*/
    
    
    ArrayList<vehiculo> cargarProduc1;
    public ArrayList cargarProdCatg(String dato) {
        cargarProduc1 = new ArrayList<vehiculo>();
        cargarProduc = CargarListProducto("");
        for (vehiculo pd : cargarProduc) {
            System.out.println(dato + "==" + pd.getCategoria());
            if (dato.equals(pd.getCategoria())) {
                cargarProduc1.add(new vehiculo(pd.getCategoria(), pd.getProducto(), pd.getUm(), pd.getPrecio(), pd.getImagen()));
                System.out.println("Guardo");
            }
        }
        return cargarProduc1;
    }

    //cargar datos del vehiculo
    ArrayList<vehiculo> cargarProduc2;
    public ArrayList cargarProd_datos(String producto) {
        cargarProduc2 = new ArrayList<vehiculo>();
        cargarProduc = CargarListProducto("");
        for (vehiculo pd : cargarProduc) {
            if (producto.equals(pd.getProducto())) {
                cargarProduc2.add(new vehiculo(pd.getCategoria(), pd.getProducto(), pd.getUm(), pd.getPrecio(), pd.getImagen()));
                System.out.println("Guardo");
            }
        }
        return cargarProduc2;
    }

}
