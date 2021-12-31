
package proyecto_Caseta;


import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;

import modelo.tickets;
import modelo.num_letras;
import static proyecto_Caseta.Cajero.getPathImagenes;
import static proyecto_Caseta.Cajero.getPathPortadas;


public class Gerente extends javax.swing.JDialog {

    
    public Gerente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        labelTable();
        this.setLocationRelativeTo(null);
        num_fac();
        textDate.setText(fechaActual());
    }

    tickets fc = new tickets();
    DefaultTableModel datosFactura;
    DecimalFormat fd = new DecimalFormat("0.00");

    //FACTURAR 
    public void labelTable() {
        datosFactura = fc.label_det_vnta();
        table_fac.getTableHeader().setReorderingAllowed(false);
        table_fac.setModel(datosFactura);
    }

    public void cargarFactura(String prod, String um, Double precio, int cant) {
        try {
            //FALTA ARREGLAR ESTO LOS CALCULOS
            Object[] data = new Object[7];
            data[0] = prod;
            data[1] = cant;
            data[2] = um;
            data[3] = precio;
            data[4] = (cant * precio);
            datosFactura.addRow(data);
            table_fac.setModel(datosFactura);
        } catch (Exception err) {
            System.out.println("aquie el error:" + err);
        }
    }

    public double descuento() {
        double desc = 0.0;
        if (jRadioButton1.isSelected()) {
            desc = 0.0;
        }
        if (jRadioButton2.isSelected()) {
            desc = 0.05;
            //JOptionPane.showMessageDialog(this, desc);
        }
        if (jRadioButton3.isSelected()) {
            desc = 0.1;
        }

        return desc;
    }

    //calcular detalle
    public void calcularDet() {

        Double iva = 0.0, importe = 0.0, auxV = 0.0, auxImp = 0.0, desc;
        for (int i = 0; i < table_fac.getRowCount(); i++) {
            // iva = Double.parseDouble(table_fac.getValueAt(i, 5).toString());       
            importe = Double.parseDouble(table_fac.getValueAt(i, 4).toString());
            // auxV = iva + auxV;        
            auxImp = importe + auxImp;
        }

        desc = descuento() * auxImp;

        iva = (0.18 * auxImp);
        txtsubtotal.setText(fd.format(auxImp).replace(",", "."));
        textDesc.setText(fd.format(desc).replace(",", "."));
        text_iva.setText(fd.format(iva).replace(",", "."));//salir el valor en menos decimales   
        text_total.setText(fd.format(-desc + auxImp + iva).replace(",", "."));
    }

    num_letras nl = new num_letras();

    public void cant_letras() {
        // nl.Convertir(text_total.getText(), true);
        labelLetras.setText(nl.Convertir(text_total.getText(), true));

    }
    
    public void num_fac(){//SE GENERA ALEATORIO EL NUMERO DE LA FACTURA
     try {
            int numero = (int) (Math.random() * 89999 + 10000);
            txtNumFact.setText("STK-"+numero);
            
        } catch (Exception err) {
            System.out.println(err);
        }
    }
    //fecha actual
    public static String fechaActual() {
        Date fecha = new Date();
         SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbldir = new javax.swing.JLabel();
        lbldir1 = new javax.swing.JLabel();
        txtNumFact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbldir2 = new javax.swing.JLabel();
        text_nomCli = new javax.swing.JTextField();
        lblced = new javax.swing.JLabel();
        text_ruc_prov = new javax.swing.JTextField();
        lbldir3 = new javax.swing.JLabel();
        text_dir = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        lblced1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_fac = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblced2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblced3 = new javax.swing.JLabel();
        lblced4 = new javax.swing.JLabel();
        lblced5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelLetras = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        textDesc = new javax.swing.JTextField();
        text_iva = new javax.swing.JTextField();
        text_total = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        textDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnCortedeCaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FACTURA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Gerente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbldir.setText("REG:");
        jPanel1.add(lbldir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        lbldir1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbldir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldir1.setText("Ticket:");
        jPanel1.add(lbldir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));
        jPanel1.add(txtNumFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, -1));

        jLabel2.setText("0785485635555");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 160, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbldir2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbldir2.setText("Dirección:");
        jPanel2.add(lbldir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 60, 0, 20));

        text_nomCli.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text_nomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nomCliActionPerformed(evt);
            }
        });
        jPanel2.add(text_nomCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, -1));

        lblced.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(lblced, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 20));

        text_ruc_prov.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(text_ruc_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 0, -1));

        lbldir3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbldir3.setText("Placas:");
        jPanel2.add(lbldir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        text_dir.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_dirActionPerformed(evt);
            }
        });
        jPanel2.add(text_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 0, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 440, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("0%");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("5%");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("10%");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addComponent(jRadioButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, 90));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("MEXICO - PUEBLA <----> PUEBLA - MEXICO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblced1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblced1.setText("Fecha:");
        getContentPane().add(lblced1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 140));

        table_fac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_fac);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 530, 170));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jButton2.setText("Quitar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 70, -1));

        lblced2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblced2.setText("Total:");
        getContentPane().add(lblced2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, 20));

        jButton3.setText("Imprimir Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        lblced3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblced3.setText("Subtotal:");
        getContentPane().add(lblced3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 20));

        lblced4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblced4.setText("Descuento:");
        getContentPane().add(lblced4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, 20));

        lblced5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblced5.setText("IVA:");
        getContentPane().add(lblced5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, 20));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        labelLetras.setText("El total del Peaje es de:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLetras)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLetras)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 350, 40));
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 60, -1));
        getContentPane().add(textDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 60, -1));
        getContentPane().add(text_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 60, -1));
        getContentPane().add(text_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 60, -1));

        jButton4.setText("Nuevo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        textDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDateActionPerformed(evt);
            }
        });
        getContentPane().add(textDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("CASETA");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnCortedeCaja.setText("Realizar Corte de Caja");
        btnCortedeCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortedeCajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCortedeCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_nomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nomCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nomCliActionPerformed

    private void text_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_dirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
        vehiculos dlg = new vehiculos(null, false);
        dlg.setModal(true); //no permite acceder a otros formularios hasta que se cierre
        dlg.setVisible(true);
        //traer el nombre  el precio  la cantidad um     
        String prod = vehiculos.prod;// cmb_prod.getSelectedItem().toString();
        String um = vehiculos.um;
        Double precio = vehiculos.precio;
        int cant = vehiculos.cant;

        cargarFactura(prod, um, precio, cant);
        calcularDet();
        cant_letras();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            DefaultTableModel modelo = (DefaultTableModel) table_fac.getModel();
            int fila = table_fac.getSelectedRow();
            if (fila >= 0) {
                modelo.removeRow(fila);
                calcularDet();
                cant_letras();
            } else {
                JOptionPane.showMessageDialog(null, "No Selecciono ninguna fila");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static String getPath() {
        //extraer ruta del proyecto
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        return path += "\\src\\";
    }

    public static String getPathPortadas() {
        return getPath() + "facturas\\";
    }

    public static String getPathImagenes() {
        return getPath() + "imagenes\\";
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         Document document = new Document(PageSize.A4, 35, 30, 50, 50);

        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(getPathPortadas() + txtNumFact.getText() + ".pdf"));
            document.open();

            Image portada = Image.getInstance(getPathImagenes() + "LOGO.png");
            portada.setAlignment(Element.ALIGN_CENTER);
            portada.scalePercent(150f);// tamaño de imagen

            document.add(portada);
             
            document.add(new Paragraph("---------------------------------------------------------------------"));
            document.add(new Paragraph("| TICKET DE PEAJE        MEXICO <--->PUEBLA |"));
            document.add(new Paragraph("---------------------------------------------------------------------"));
            document.add(new Paragraph("Numero Ticket. : " + txtNumFact.getText()));
            document.add(new Paragraph("Placas : " + text_nomCli.getText() + " " + " " + text_ruc_prov.getText()));
            document.add(new Paragraph("  " + text_dir.getText()));
            document.add(new Paragraph("Fecha : [ " + textDate.getText() + " ]  "));
            
            document.add(new Paragraph(" "));
            document.add(new Paragraph("| DESCRIPCION\t       | CANTIDAD\t              |PESO\t                   | CUOTA\t           | IMPORTE\t |"));
             document.add(new Paragraph("----------------------------------------------------------------------"
                    + "--------------------------------------------------------"));
            document.add(new Paragraph(" "));
             
            document.add(new Paragraph("Subtotal : [ " + txtsubtotal.getText() + " ] - Descuento: [" + textDesc.getText() + "] - IVA: [" + text_iva.getText() + "]  - Total a Pagar : $ " + text_total.getText() + " Pesos"));

            document.add(new Paragraph(" "));
           
            document.add(new Paragraph("----------------------------------------------------------------------"
                    + "--------------------------------------------------------"));
            document.add(new Paragraph(""));
// parte de dibujo la tabla
            PdfContentByte cb = writer.getDirectContent();
            PdfTemplate tp = cb.createTemplate(600, 600);
            Graphics2D g2;
            g2 = tp.createGraphicsShapes(500, 500);
//g2 = tp.createGraphics(500, 500);
            table_fac.print(g2);
            g2.dispose();
//posicion de la tabla de lista de ventas
            cb.addTemplate(tp, 50, -85);

//cierra el documento
            document.close();
            JOptionPane.showMessageDialog(null, "Generando Ticket........");

            try {
                File path = new File(getPathPortadas() + "/" + txtNumFact.getText() + ".pdf");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        calcularDet();
        cant_letras();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        calcularDet();
        cant_letras();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        calcularDet();
        cant_letras();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Limpiar Todo

        text_nomCli.setText("");
        text_ruc_prov.setText("");
        text_dir.setText("");
        txtsubtotal.setText("");
        textDesc.setText("");
        text_iva.setText("");
        text_total.setText("");
        labelLetras.setText("");
        DefaultTableModel modelo = (DefaultTableModel) table_fac.getModel();
        int a = table_fac.getRowCount() - 1;
        int i;
        for (i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
         textDate.setText(fechaActual());
        
        //NUMEROS ALEATORIOS PARA LAS FACTURAS
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void textDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDateActionPerformed

    private void btnCortedeCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortedeCajaActionPerformed
     Retiros abrir = new Retiros();
            abrir.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnCortedeCajaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gerente dialog = new Gerente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCortedeCaja;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLetras;
    private javax.swing.JLabel lblced;
    private javax.swing.JLabel lblced1;
    private javax.swing.JLabel lblced2;
    private javax.swing.JLabel lblced3;
    private javax.swing.JLabel lblced4;
    private javax.swing.JLabel lblced5;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lbldir1;
    private javax.swing.JLabel lbldir2;
    private javax.swing.JLabel lbldir3;
    private javax.swing.JTable table_fac;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField textDesc;
    private javax.swing.JTextField text_dir;
    private javax.swing.JTextField text_iva;
    private javax.swing.JTextField text_nomCli;
    private javax.swing.JTextField text_ruc_prov;
    private javax.swing.JTextField text_total;
    private javax.swing.JTextField txtNumFact;
    private javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables
}
