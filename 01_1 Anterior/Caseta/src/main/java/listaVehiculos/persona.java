
package listaVehiculos;


import java.io.BufferedReader;
import java.io.PrintWriter;


public class persona {
    private String Nombre;
    private String Cedula;
    private int Edad;

    public persona(String Nombre, String Cedula, int Edad) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Edad = Edad;
    }
    public persona(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    void guardar(PrintWriter Escribe) {
        Escribe.println(Nombre);
        Escribe.println(Cedula);
        Escribe.println(Edad);
    }

    public persona cargar(BufferedReader Almacen) {
        String Nom, Ced;
        int edad;
        try {
            Nom = Almacen.readLine();
            Ced = Almacen.readLine();
            edad = Integer.parseInt(Almacen.readLine());
            return new persona(Nom, Ced, edad);
        } catch (Exception e) {
        }
        return null;
    }

    
}

