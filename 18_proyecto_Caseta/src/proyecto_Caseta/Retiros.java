
package proyecto_Caseta;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Retiros extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_cantidad_en_caja, field_cantidad_retirada;
    private JLabel label_caja;
    private JButton button;

    public Retiros() {
         
        field_cantidad_en_caja = new JTextField(4);
        field_cantidad_retirada = new JTextField(4);
        label_caja = new JLabel("", JLabel.RIGHT);
        button = new JButton("Retirar Efectivo");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(new JLabel("Ingresa el monto de la caja:   "));
        subpanel.add(new JLabel("Ingresa el monto de la cantidad a retirar:   "));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(field_cantidad_en_caja);
        subpanel.add(field_cantidad_retirada);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Cambio en caja :"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(label_caja);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double cantidad_en_caja, cantidad_retirada, corte_caja;
        try {
            cantidad_en_caja = Double.parseDouble(field_cantidad_en_caja.getText());
            cantidad_retirada = Double.parseDouble(field_cantidad_retirada.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        corte_caja=cantidad_en_caja - cantidad_retirada;
        label_caja.setText(String.valueOf(corte_caja));
        field_cantidad_en_caja.setText(String.valueOf(corte_caja));
        pack();
       
    }

    public static void main(String[] args) {
        new Retiros().setVisible(true);
       
    }

}
