
package caseta;


public class Caseta {
 private Barrera barrera;
 private Caja caja;
 private Cajero cajero;
 
 public Caseta(){
     barrera = new Barrera();
     caja = new Caja();
     cajero = new Cajero();
 }
    void bajarBarrera() {
        /*Barrera.bajarBarrera();*/
    }

    void pagar(int i) {
        //cajero TEMPORALMENTE tienen el dinero
       cajero.recibirDinero(i);
       caja.guardardinero(cajero.entregardinero());
       barrera.levantarbarrera();
    }

    int totalrecaudado() {
        return caja.obteermonto();
    }
}
