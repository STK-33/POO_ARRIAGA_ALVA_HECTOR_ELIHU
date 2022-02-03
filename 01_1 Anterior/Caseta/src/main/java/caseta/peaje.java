
package caseta;


public class Peaje {
    private Caseta caseta;
    private Vehiculo vehiculo;

    public Peaje(){
        caseta = new Caseta();
    caseta.bajarBarrera();
}
    public void recibirVehiculo(Vehiculo V1) {
       vehiculo = V1;
    }

    public void pagar(int i) {
       caseta.pagar(i);
    }

    public void salirVehiculo() {
        vehiculo = null;
        caseta.bajarBarrera();
    }

    public String totalrecaudado() {
       int total = caseta.totalrecaudado();
        return "El monto recaudado es: " + total;
    }
}
