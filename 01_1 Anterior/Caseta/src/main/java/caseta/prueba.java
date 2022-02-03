/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class prueba extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JComboBox<String> choice_tipo_de_vehiculo;
    private JLabel label_cuota, label_descuento, label_monto_a_pagar;
    private JButton button;

    public prueba() {
        label_cuota = new JLabel("", JLabel.RIGHT);
        label_descuento = new JLabel("", JLabel.RIGHT);
        label_monto_a_pagar = new JLabel("", JLabel.RIGHT);
        choice_tipo_de_vehiculo = new JComboBox<String>(new String[]{"Moto", "Coche", "Carga", "Escolar"});
        button = new JButton("Procesar");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Selecciona el valor de tipo de vehiculo:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(choice_tipo_de_vehiculo);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(new JLabel("Valor de cuota:"));
        subpanel.add(new JLabel("Valor de descuento:"));
        subpanel.add(new JLabel("Valor de monto a pagar:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(label_cuota);
        subpanel.add(label_descuento);
        subpanel.add(label_monto_a_pagar);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int tipo_de_vehiculo;
        double cuota, descuento, monto_a_pagar;
        cuota=0;
        descuento=0;
        tipo_de_vehiculo = choice_tipo_de_vehiculo.getSelectedIndex()+1;
        if(tipo_de_vehiculo==1)
        {
            cuota=20;
            descuento=cuota*0.04;
        }
        if(tipo_de_vehiculo==2)
        {
            cuota=35;
            descuento=cuota*0.05;
        }
        if(tipo_de_vehiculo==3)
        {
            cuota=50;
            descuento=cuota*0.06;
        }
        monto_a_pagar=cuota-descuento;
        label_cuota.setText(String.valueOf(cuota));
        label_descuento.setText(String.valueOf(descuento));
        label_monto_a_pagar.setText(String.valueOf(monto_a_pagar));
        pack();
    }

    public static void main(String[] args) {
        new prueba().setVisible(true);
    }

}
