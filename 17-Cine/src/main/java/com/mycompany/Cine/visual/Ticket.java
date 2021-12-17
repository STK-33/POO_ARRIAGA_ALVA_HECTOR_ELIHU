/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cine.visual;

import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class Ticket extends javax.swing.JFrame {
    
    public Ticket() {
        super.setUndecorated(true);
        initComponents();
        super.setLocationRelativeTo(this);
        fecha();
    }

    void fecha() {
        Date dia = new Date();
        jLabelFecha.setText("Fecha: " + (dia.getDay() + 6) + "/" + (dia.getMonth() + 1) + "/" + (dia.getYear() + 1900));
        jLabelHora.setText("Hora: " + (dia.getHours()) + ":" + (dia.getMinutes()) + ":" + (dia.getSeconds()));
    }
    
    void limpiar() {
        ImageIcon i = new ImageIcon("");
        Menu.jLabelPelicula.setIcon(i);
        Menu.jTextFieldCantidadDeBoletosAdultos.setText("");
        Menu.buttonGroup1.clearSelection();
        Menu.jComboBoxHora.setSelectedIndex(0);
        Menu.jComboBoxPeliculas.setSelectedIndex(0);
        Menu.jLabelMenores.setText("");
        Menu.jTextFieldCantidadDeBoletosNiños.setVisible(true);
        Menu.jTextFieldCantidadDeBoletosNiños.setText("");

    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelTanda = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabeNiños = new javax.swing.JLabel();
        jLabeNiñosTotal = new javax.swing.JLabel();
        jLabeAdultos = new javax.swing.JLabel();
        jLabeAdultosTotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabeTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabeEfectivoRecibido = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabeCambio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel4.setText("Cine-DeltaStk");

        jLabel5.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel5.setText("Atendio......................");

        jLabel6.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel6.setText("STK");

        jLabelHora.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 

        jLabelFecha.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel7.setText("Pelicula................");

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel8.setText("Sala.....................");

        jLabel9.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14));
        jLabel9.setText("Hora..................");

        jLabelTanda.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabelTanda.setText("...");

        jLabelSala.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabelSala.setText("...");

        jLabelPelicula.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabelPelicula.setText("...");

        jLabel10.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel10.setText("Niños..................");

        jLabel11.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel11.setText("Adultos...............");

        jLabeNiños.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeNiños.setText("...");

        jLabeNiñosTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeNiñosTotal.setText("...");

        jLabeAdultos.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeAdultos.setText("...");

        jLabeAdultosTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeAdultosTotal.setText("...");

        jLabel12.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel12.setText("TOTAL.............................");

        jLabeTotal.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeTotal.setText("...");

        jLabel13.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel13.setText("Efectivo recibido.............");

        jLabeEfectivoRecibido.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeEfectivoRecibido.setText("...");

        jLabel14.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel14.setText("Cambio...........................");

        jLabeCambio.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabeCambio.setText("...");

        jLabel15.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel15.setText("¡Gracias por preferirnos!");

        jLabel16.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel16.setText("Cine-STK");

        jButton1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 11)); 
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/rgb.png"))); 
        jButton1.setText("Imprimir Ticket");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 196, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPelicula)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTanda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSala))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabeNiños))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabeAdultos))
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabeTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabeAdultosTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabeNiñosTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18))))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabeCambio)
                                        .addComponent(jLabeEfectivoRecibido)))))
                        .addGap(0, 161, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelPelicula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelSala))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelTanda))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabeNiños)
                    .addComponent(jLabeNiñosTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabeAdultos)
                        .addComponent(jLabeAdultosTotal))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabeTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabeEfectivoRecibido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabeCambio))
                .addGap(41, 41, 41)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        limpiar();
        JOptionPane.showMessageDialog(this, "Listo!!!", "Pida sus Palomitas", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel jLabeAdultos;
    public static javax.swing.JLabel jLabeAdultosTotal;
    public static javax.swing.JLabel jLabeCambio;
    public static javax.swing.JLabel jLabeEfectivoRecibido;
    public static javax.swing.JLabel jLabeNiños;
    public static javax.swing.JLabel jLabeNiñosTotal;
    public static javax.swing.JLabel jLabeTotal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    public static javax.swing.JLabel jLabelPelicula;
    public static javax.swing.JLabel jLabelSala;
    public static javax.swing.JLabel jLabelTanda;
    private javax.swing.JPanel jPanel1;
    
}
