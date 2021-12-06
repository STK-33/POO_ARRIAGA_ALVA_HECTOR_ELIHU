

    import java.text.DecimalFormat;
    import javax.swing.JOptionPane;
    
    public class costo {
        
            public static void main(String[] args){
            String nombreCliente;
            double costoPorLibro, descuento, total;
            int tipoCliente, cantidadLibros, porcentajeDescuento;
            
            DecimalFormat formatter = new DecimalFormat("#,###");
            
            nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
            
            tipoCliente = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese 1 para confirmar prestamo (1,2 o 3): ")
            );
            
            cantidadLibros = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese el número de libros que se llevarán:")
            );
            
            costoPorLibro = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Ingrese el precio por libro: ")
            );
            
            switch(tipoCliente){
                case 1:
                    porcentajeDescuento = 30;
                    
                    break;
                case 2:
                    porcentajeDescuento = 20;
                    break;
                case 3:
                    porcentajeDescuento = 10;
                    break;
                default:
                    porcentajeDescuento = 0;
                    break;
            }
            
            total = (cantidadLibros * costoPorLibro);
            descuento = (total * porcentajeDescuento) / 100;
            
            JOptionPane.showMessageDialog(
                null, 
                "Factura a nombre de: " + nombreCliente + "\n"
                + "Tipo de cliente: " + tipoCliente + "\n"
                + "Total de libros: " + cantidadLibros + "\n"
                + "Costo por libro: $" + formatter.format(costoPorLibro) + "\n"
                + "Subtotal: $" + formatter.format(total) + "\n"
                + "Descuento: - $" + formatter.format(descuento) + "\n"
                + "Total a pagar: $" + formatter.format(total - descuento)
            );
            }
        
    }

