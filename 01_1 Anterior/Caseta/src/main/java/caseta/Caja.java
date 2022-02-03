
package caseta;


public class Caja {
private int monto;    
public Caja(){
    monto = 0;
}
    void guardardinero(int entregardinero) {
      monto = monto + entregardinero;
    }

    int obteermonto() {
        return monto;
    }
}
