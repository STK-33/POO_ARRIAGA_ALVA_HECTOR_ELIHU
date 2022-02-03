
package caseta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculosPeaje extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_numero_de_ejes, field_tarifa_regular;
    private JComboBox<String> choice_tipo_de_vehiculo, choice_tipo_de_hora;
    private JLabel label_peaje;
    private JButton button;

    public CalculosPeaje() {
        field_numero_de_ejes = new JTextField(4);
        field_tarifa_regular = new JTextField(4);
        label_peaje = new JLabel("", JLabel.RIGHT);
        choice_tipo_de_vehiculo = new JComboBox<String>(new String[]{"cami\u00F3n", "autom\u00F3vil"});
        choice_tipo_de_hora = new JComboBox<String>(new String[]{"alta congesti\u00F3n", "menos congesti\u00F3n"});
        button = new JButton("Procesar");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(4, 1));
        subpanel.add(new JLabel("Ingresa el valor de numero de ejes:   "));
        subpanel.add(new JLabel("Ingresa el valor de tarifa regular:   "));
        subpanel.add(new JLabel("Selecciona el valor de tipo de vehiculo:   "));
        subpanel.add(new JLabel("Selecciona el valor de tipo de hora:   "));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(4, 1));
        subpanel.add(field_numero_de_ejes);
        subpanel.add(field_tarifa_regular);
        subpanel.add(choice_tipo_de_vehiculo);
        subpanel.add(choice_tipo_de_hora);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Tarifa de peaje :"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(label_peaje);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int numero_de_ejes, peaje, tarifa_regular, tipo_de_hora, tipo_de_vehiculo;
        try {
            numero_de_ejes = Integer.parseInt(field_numero_de_ejes.getText());
            tarifa_regular = Integer.parseInt(field_tarifa_regular.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        tipo_de_vehiculo = choice_tipo_de_vehiculo.getSelectedIndex()+1;
        tipo_de_hora = choice_tipo_de_hora.getSelectedIndex()+1;
        peaje=0;
        if(tipo_de_hora==1&&tipo_de_vehiculo==1&&numero_de_ejes<3)
            peaje=tarifa_regular;
        if(tipo_de_hora==1&&tipo_de_vehiculo==2)
            peaje=50;
        if(tipo_de_hora==2&&tipo_de_vehiculo==2)
            peaje=30;
        if(tipo_de_hora==2&&tipo_de_vehiculo==1)
            peaje=25;
        label_peaje.setText(String.valueOf(peaje));
        pack();
    }

    public static void main(String[] args) {
        new CalculosPeaje().setVisible(true);
    }

}