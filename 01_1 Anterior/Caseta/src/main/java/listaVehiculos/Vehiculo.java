
package listaVehiculos;


import java.io.BufferedReader;
import java.io.PrintWriter;


public class Vehiculo {
    private String Tipo_de_vehiculo;
    private int Numero_de_ejes;
    private String Placa;
    private int total;
    private int cuota;

    public Vehiculo(String Tipo_de_vehiculo, String Placa, int Numero_de_ejes, int total, int cuota) {
        this.Tipo_de_vehiculo = Tipo_de_vehiculo;
        this.Numero_de_ejes = Numero_de_ejes;
        this.Placa = Placa;
         this.total = total;
         this.cuota = cuota;
    }

    public Vehiculo() {
        
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    

    public String getTipovehiculo() {
        return Tipo_de_vehiculo;
    }

    public void setTipovehiculo(String Tipo_de_vehiculo) {
        this.Tipo_de_vehiculo = Tipo_de_vehiculo;
    }

    public int getNumero_de_ejes() {
        return Numero_de_ejes;
    }

    public void setNumero_de_ejes(int Numero_de_ejes) {
        this.Numero_de_ejes = Numero_de_ejes;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    void guardar(PrintWriter Escribe) {
        Escribe.println(Tipo_de_vehiculo);
        Escribe.println(Numero_de_ejes);
        Escribe.println(Placa);
         Escribe.println(total);
         Escribe.println(cuota);
    }

    public Vehiculo cargar(BufferedReader Almacen) {
        String Veh, Placa;
        int ejes;
        int total=0;
        int cuota;
        try {
            Veh = Almacen.readLine();
            ejes = Integer.parseInt(Almacen.readLine());
            Placa = (Almacen.readLine());
            cuota = Integer.parseInt(Almacen.readLine());
            total = Integer.parseInt(Almacen.readLine());
            return new Vehiculo(Veh,Placa,ejes,total,cuota);
        } catch (Exception e) {
        }
        return null;
    }

    
    
}

