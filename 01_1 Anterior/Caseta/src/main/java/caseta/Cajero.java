
package caseta;


public class Cajero {
    private String nombre;
    private int monto;

    void recibirDinero(int i) {
       monto = i;
    }
    public int entregardinero(){
       //cajero dejo dinero en la caja
        int dinero = monto;
       monto = 0;
       return dinero;
    }
}
