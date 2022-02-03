
package Pincipal;

import caseta.Peaje;
import caseta.Vehiculo;


public class Main {
    public static void main (String[] args){
        Peaje peaje = new Peaje ();
        Vehiculo V1 = new Vehiculo();
        //recibir vehiculo
        peaje.recibirVehiculo(V1);
        //pagar peaje
        peaje.pagar(300);
        peaje.salirVehiculo();
        //total recaudado
       System.out.println( peaje.totalrecaudado());
    }
}
