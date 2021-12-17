/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cine.visual;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        super.setTitle("Menú-CineSTK");
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        jLabelMenores.setVisible(false);
        Desactivados();
    }

    void Encender() {
        if (jToggleButtonEncender.isSelected()) {
            jComboBoxPeliculas.setEnabled(true);
            jComboBoxHora.setEnabled(true);
            AgregarAComboboxPelicula();

            jToggleButtonEncender.setText("Cerrar Sesion");
        } else {
            jComboBoxPeliculas.setEnabled(false);
            jComboBoxHora.setEnabled(false);
            limpiar();
            Desactivados();
            jToggleButtonEncender.setText("Iniciar Sesion");
        }
    }

    void Desactivados() {
        jComboBoxPeliculas.setEnabled(false);
        jComboBoxHora.setEnabled(false);
        jRadioButtonEfectivo.setEnabled(false);
        jRadioButtonTCredito.setEnabled(false);
        jTextFieldCantidadDeBoletosAdultos.setEnabled(false);
        jTextFieldCantidadDeBoletosNiños.setEnabled(false);
        jButtonContinuar.setEnabled(false);
    }

    void Activar() {
        jRadioButtonEfectivo.setEnabled(true);
        jRadioButtonTCredito.setEnabled(true);
        jTextFieldCantidadDeBoletosAdultos.setEnabled(true);
        jTextFieldCantidadDeBoletosNiños.setEnabled(true);
        jButtonContinuar.setEnabled(true);
    }

    void AgregarAComboboxPelicula() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        modelo.addElement("Viernes 13");
        modelo.addElement("La masacre en texas 3");
        modelo.addElement("Cars 3");
        modelo.addElement("Spider-Man");
        modelo.addElement("Batman");

        jComboBoxPeliculas.setModel(modelo);

    }

    void seleccionPelicula() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        if (combo == 1 || combo == 2 || combo == 3 || combo == 4 || combo == 5) {
            Activar();
            MenoresEdad();
        } else {
            jRadioButtonEfectivo.setEnabled(false);
            jRadioButtonTCredito.setEnabled(false);
            jTextFieldCantidadDeBoletosAdultos.setEnabled(false);
            jTextFieldCantidadDeBoletosNiños.setEnabled(false);
            jButtonContinuar.setEnabled(false);
        }
    }

    void caratulas() {
        int combo;
        combo = jComboBoxPeliculas.getSelectedIndex();
        switch (combo) {
            case 0: {
                ImageIcon i = new ImageIcon("");
                jLabelPelicula.setIcon(i);
                break;
            }
            case 1: {
                LimCantidad();
                Preview.jLabelSala.setText("4");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/Viernes13.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("4:00 pm");
                modelo.addElement("6:00 pm");
                modelo.addElement("8:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 2: {
                LimCantidad();
                Preview.jLabelSala.setText("2");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/masacre.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("5:00 pm");
                modelo.addElement("7:00 pm");
                modelo.addElement("9:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 3: {
                LimCantidad();
                Preview.jLabelSala.setText("3");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/cars.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("12:00 pm");
                modelo.addElement("2:00 pm");
                modelo.addElement("4:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 4: {
                LimCantidad();
                Preview.jLabelSala.setText("5");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/spider.jpg");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("1:00 pm");
                modelo.addElement("3:00 pm");
                modelo.addElement("6:30 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            case 5: {
                LimCantidad();
                Preview.jLabelSala.setText("1");
                ImageIcon i = new ImageIcon("src/com/nic/pelis/bat.png");
                jLabelPelicula.setIcon(i);
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Seleccione");
                modelo.addElement("2:00 pm");
                modelo.addElement("5:00 pm");
                modelo.addElement("8:00 pm");
                jComboBoxHora.setModel(modelo);
                break;
            }
            default:
                break;
        }
    }

    void LimCantidad() {
        jTextFieldCantidadDeBoletosAdultos.setText("");
        jTextFieldCantidadDeBoletosNiños.setText("");
    }

    void limpiar() {
        ImageIcon i = new ImageIcon("");
        jLabelPelicula.setIcon(i);
        jTextFieldCantidadDeBoletosAdultos.setText("");
        buttonGroup1.clearSelection();
        jComboBoxPeliculas.removeAllItems();
        jComboBoxHora.removeAllItems();
    }

    void calculo() {

        double cantidadAdultos = 0.0, cantidadNiños = 0.0;
        double precioAdultos = 0.0, precioNiños = 0.0;
        double TotalN = 0, TotalA = 0, Total;

        if ("".equals(jTextFieldCantidadDeBoletosNiños.getText())) {
            String ninguno = "0.0";
            Preview.jLabelTotalNiños.setText(ninguno);
            Preview.jTextFieldCantidadDeBoletosNiños.setText("0");
        } else {
            cantidadNiños = Double.parseDouble(jTextFieldCantidadDeBoletosNiños.getText());
            precioNiños = Double.parseDouble(jLabelPrecio2DNiños.getText());
            TotalN = (cantidadNiños * precioNiños);
            Preview.jLabelTotalNiños.setText(TotalN + "");
        }

        if ("".equals(jTextFieldCantidadDeBoletosAdultos.getText())) {
            jTextFieldCantidadDeBoletosAdultos.setText("");
        } else {

            cantidadAdultos = Double.parseDouble(jTextFieldCantidadDeBoletosAdultos.getText());
            precioAdultos = Double.parseDouble(jLabelPrecio2DAdulto.getText());
            TotalA = (cantidadAdultos * precioAdultos);
            Preview.jLabelTotalAdultos.setText(TotalA + "");
        }
        Total = TotalA + TotalN;
        Preview.jLabelTotalPago.setText(Total + "");

    }

    void pasaDatos() {
        Preview.jTextFieldCantidadDeBoletosAdultos.setText(jTextFieldCantidadDeBoletosAdultos.getText());
        Preview.jTextFieldCantidadDeBoletosNiños.setText(jTextFieldCantidadDeBoletosNiños.getText());
    }

    void MenoresEdad() {
        int combo = jComboBoxPeliculas.getSelectedIndex();
        if (combo == 1 || combo == 2) {
            jLabelMenores.setVisible(true);
            jTextFieldCantidadDeBoletosNiños.setVisible(false);
            jLabelMenores.setText("No apta para menores de edad");
        }
        if (combo == 3 || combo == 4 || combo == 5) {
            jTextFieldCantidadDeBoletosNiños.setVisible(true);
            jLabelMenores.setVisible(false);
        }
    }
    
    void tarjeta(){
        if (jRadioButtonTCredito.isSelected()) {
            Preview.jTextFieldEfectivoRecibido.setText("Paga con tarjeta");
            Preview.jTextFieldEfectivoRecibido.setEditable(false);
            Preview.jLabel14.setVisible(false);
            Preview.jButton3.setVisible(false);
            Preview.jButton1.setEnabled(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBoxPeliculas = new javax.swing.JComboBox<>();
        jToggleButtonEncender = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelPrecio2DAdulto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPrecio2DNiños = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosAdultos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonEfectivo = new javax.swing.JRadioButton();
        jRadioButtonTCredito = new javax.swing.JRadioButton();
        jButtonContinuar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCantidadDeBoletosNiños = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelMenores = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelPrecio2DAdulto1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); 
        jLabel1.setText("Los Miercoles la entrada cuesta $45 Pesos");
        jPanel3.add(jLabel1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxPeliculas.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxPeliculas.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jComboBoxPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeliculasActionPerformed(evt);
            }
        });

        jToggleButtonEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/power.png"))); 
        jToggleButtonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEncenderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel2.setText("Peliculas");

        jComboBoxHora.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel3.setText("Hora");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelPrecio2DAdulto.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jLabelPrecio2DAdulto.setText("60");

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel4.setText("Precios Adultos");

        jLabel8.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel8.setText("Precios Niños");

        jLabelPrecio2DNiños.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jLabelPrecio2DNiños.setText("42");

        jLabel11.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel11.setText("Adultos");

        jLabel12.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel12.setText("Cantidad:");

        jTextFieldCantidadDeBoletosAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadDeBoletosAdultosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel7.setText("Forma de pago");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(jRadioButtonEfectivo);
        jRadioButtonEfectivo.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jRadioButtonEfectivo.setText("Efectivo");

        buttonGroup1.add(jRadioButtonTCredito);
        jRadioButtonTCredito.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jRadioButtonTCredito.setText("Tarjeta de crédito");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButtonEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButtonTCredito)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jRadioButtonEfectivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTCredito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonContinuar.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nic/imgs/approve.png"))); 
        jButtonContinuar.setText("Confirmar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        jLabel17.setText("$");

        jLabel18.setText("$");

        jLabel14.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel14.setText("Boletos");

        jLabel15.setFont(new java.awt.Font("Ubuntu Condensed", 1, 14)); 
        jLabel15.setText("Niños");

        jLabelMenores.setText("jLabel6");

        jLabel19.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jLabel19.setText("3D");

        jLabel20.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jLabel20.setText("2D");

        jLabelPrecio2DAdulto1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 14)); 
        jLabelPrecio2DAdulto1.setText("80");

        jLabel21.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrecio2DAdulto1)
                                    .addComponent(jLabelPrecio2DAdulto))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPrecio2DNiños)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCantidadDeBoletosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelMenores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCantidadDeBoletosNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonContinuar)
                        .addGap(106, 106, 106))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(65, 65, 65)
                .addComponent(jLabel14)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabelPrecio2DAdulto))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabelPrecio2DNiños)
                                .addComponent(jLabel11)
                                .addComponent(jLabel15)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextFieldCantidadDeBoletosAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCantidadDeBoletosNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMenores))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabelPrecio2DAdulto1)
                            .addComponent(jLabel21))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonContinuar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabelPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButtonEncender))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonEncender)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Peliculas");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }

    private void jToggleButtonEncenderActionPerformed(java.awt.event.ActionEvent evt) {
        Encender();
    }

    private void jComboBoxPeliculasActionPerformed(java.awt.event.ActionEvent evt) {
        seleccionPelicula();
        caratulas();
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
      
    }

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBoxPeliculas.getSelectedIndex() == 0 || jComboBoxHora.getSelectedIndex() == 0 || jTextFieldCantidadDeBoletosAdultos.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Todavía hacen falta datos por completar", "Complete datos", JOptionPane.WARNING_MESSAGE);
        } else {
            Preview obj = new Preview();
            pasaDatos();
            Preview.jTextFieldPelicula.setText(jComboBoxPeliculas.getSelectedItem().toString());
            Preview.jTextFieldHora.setText(jComboBoxHora.getSelectedItem().toString());
            tarjeta();
            calculo();
            obj.setVisible(true);
        }
    }

    private void jTextFieldCantidadDeBoletosAdultosActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "Gracias :\n Felizes Fiestas", "byeee", JOptionPane.INFORMATION_MESSAGE);
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonContinuar;
    public static javax.swing.JComboBox<String> jComboBoxHora;
    public static javax.swing.JComboBox<String> jComboBoxPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabelMenores;
    public static javax.swing.JLabel jLabelPelicula;
    private javax.swing.JLabel jLabelPrecio2DAdulto;
    private javax.swing.JLabel jLabelPrecio2DAdulto1;
    private javax.swing.JLabel jLabelPrecio2DNiños;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JRadioButton jRadioButtonEfectivo;
    public static javax.swing.JRadioButton jRadioButtonTCredito;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosAdultos;
    public static javax.swing.JTextField jTextFieldCantidadDeBoletosNiños;
    public static javax.swing.JToggleButton jToggleButtonEncender;
    
}
