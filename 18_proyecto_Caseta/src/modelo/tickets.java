
package modelo;

import javax.swing.table.DefaultTableModel;

public class tickets {
    
     static DefaultTableModel datos;
     public DefaultTableModel label_det_vnta() {
        String[] column = {"Descripcion", "Cantidad", "Peso", "Cuota Regular", "Importe"};
        datos = new DefaultTableModel(null, column) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        return datos;
    }
}
