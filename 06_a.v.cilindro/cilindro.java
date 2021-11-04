
    import java.awt.Font;
 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class cilindro {
 
    public static void main(String[] args) {
         
        double radio, altura, area, volumen;
         
        String strRadio = JOptionPane.showInputDialog(null, 
                "Introduce el radio de la base del cilindro (cm)", 
                "area y Volumen de un cilindro", 
                JOptionPane.QUESTION_MESSAGE);
        radio = Double.parseDouble(strRadio);
        String strAltura = JOptionPane.showInputDialog(null, 
                "Introduce la altura del cilindro (cm)", 
                "area y Volumen de un cilindro", 
                JOptionPane.QUESTION_MESSAGE);
        altura = Double.parseDouble(strAltura);
         
        area = calcularAreaCilindro(radio, altura);
        volumen = calcularVolumenCilindro(radio, altura);
        String textoMostrar = "El area es " + String.format("%.2f", area) + " cm cuadrados";
        textoMostrar += " y el volumen es " + String.format("%.2f", volumen) + " cm cúbicos.";
         
        JLabel lblVolumen = new JLabel(textoMostrar);
        Font fuente = new Font("Arial", Font.PLAIN, 17);
        lblVolumen.setFont(fuente);
         
        JOptionPane.showMessageDialog(null, 
                lblVolumen, 
                "area y Volumen del cilindro ", 
                JOptionPane.INFORMATION_MESSAGE);
         
    }
     
    static double calcularAreaCilindro(double radio, double altura){
        //Area de un cilindro = 2 Π r ( h + r ) 
        return 2 * Math.PI * radio * (altura + radio);
    }
     
    static double calcularVolumenCilindro(double radio, double altura){
        //Volumen de un cilindro = Π r2 h
        return Math.PI * Math.pow(radio, 2) * altura;
    }

}
