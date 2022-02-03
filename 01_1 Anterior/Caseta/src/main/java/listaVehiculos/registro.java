
package listaVehiculos;
import listaVehiculos.Vehiculo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class registro extends javax.swing.JFrame {

    int operacion=0;
    private ArrayList<Vehiculo> Lis;
    public registro() {
        Lis = new ArrayList<Vehiculo>(); 
        initComponents(); 
        this.setLocationRelativeTo(null);
        cargar();
        //tipo vehiculo
        cboTVehiculos.addItem("Automovil");
        cboTVehiculos.addItem("Camion");
        cboTVehiculos.addItem("Motocicleta");
        cboTVehiculos.addItem("Vehiculo de Emergencia");
        //numero ejes
        cboEjes.addItem("2 ");
        cboEjes.addItem("3 ");
        cboEjes.addItem("4 ");
        cboEjes.addItem("5 ");
        cboEjes.addItem("6 ");
        cboEjes.addItem("7 ");
        cboEjes.addItem("8 ");
        cboEjes.addItem("9 ");
        cboEjes.addItem("Mas de 9 ejes");
        // Cuotas
        cboCuotas.addItem("78");
        cboCuotas.addItem("120");
        cboCuotas.addItem("56");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePersona = new javax.swing.JTable();
        cboTVehiculos = new javax.swing.JComboBox<>();
        cboEjes = new javax.swing.JComboBox<>();
        cboCuotas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehiculo Tipo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ejes:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa:");

        BtnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseClicked(evt);
            }
        });
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        JTablePersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vehiculo Tipo", "Ejes", "Placa","Monto"
            }
        ));
        jScrollPane1.setViewportView(JTablePersona);

        cboTVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        cboEjes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ""}));

        cboCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ""
            + "" }));

jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
jLabel4.setForeground(new java.awt.Color(255, 255, 255));
jLabel4.setText("Cuota:");

jToggleButton1.setText("Imprir Ticket");

jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
jLabel5.setForeground(new java.awt.Color(255, 255, 255));
jLabel5.setText("Total:");

res.setForeground(new java.awt.Color(204, 204, 204));

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboTVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(cboEjes, javax.swing.GroupLayout.Alignment.LEADING, 0, 146, Short.MAX_VALUE)
                            .addComponent(cboCuotas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jToggleButton1)))
                    .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(cboTVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BtnAgregar))
            .addGap(24, 24, 24)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModificar)))
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BtnEliminar)
                .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(31, 31, 31))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar(){
        cboEjes.getSelectedItem().toString();
        cboTVehiculos.getSelectedItem().toString();
        TxtEdad.setText("");
        cboCuotas.getSelectedItem().toString();
    }
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        int NumEjes;
      
      int posTV= cboTVehiculos.getSelectedIndex();
      int posejes= cboEjes.getSelectedIndex();
       //peajes vehiculo
      if(posejes==0 && posTV ==0){
           JOptionPane.showMessageDialog(null,"Completa Los Datos");
      }
      if(posejes==1 && posTV ==1){
         
          operacion = 90;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
      //peajes Camion
      if(posejes==1 && posTV ==2){
          operacion = 139 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      } 
      if(posejes==2 && posTV ==2){
          operacion = 164 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
       if(posejes==3 && posTV ==2){
          operacion = 189 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
        if(posejes==4 && posTV ==2){
          operacion = 214 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
         if(posejes==5 && posTV ==2){
          operacion = 239 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
          if(posejes==6 && posTV ==2){
          operacion = 264 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
           if(posejes==7 && posTV ==2){
          operacion = 289 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
            if(posejes==8 && posTV ==2){
          operacion = 314 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
             if(posejes==9 && posTV ==2){
          operacion = 339 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
         // Peaje Motocicleta
          if(posejes==1 && posTV ==3){
          operacion = 65 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"La cuota Total es: "+ operacion);
      }
          //Peaje vehiculo de Hemergencia
           if(posejes<=1 && posTV ==4){
          operacion = 0 ;
          String valor=Integer.toString(operacion);
          res.setText(valor);
           JOptionPane.showMessageDialog(null,"Pase libre a Vehiculos de Emergencia ");
      }
        
        String Tv ;
        int Ej;
        String Pla;
        int total;
        int cuota;
        
        
        try {
             Tv = cboTVehiculos.getSelectedItem().toString();
            Pla = cboEjes.getSelectedItem().toString();
            Ej = Integer.parseInt(TxtEdad.getText());
            cuota = Integer.parseInt(cboCuotas.getSelectedItem().toString());
            total = Integer.parseInt(res.getText());
            Lis.add(new Vehiculo(Tv, Pla , Ej, total,cuota));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los datos");
        }
         
          
        limpiar();
        verDatos();
    }//GEN-LAST:event_BtnAgregarActionPerformed
 
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int c;
        try {
            c = JTablePersona.getSelectedRow();
            Lis.remove(c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Favor escoja una fila");
        }
        verDatos();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    @SuppressWarnings("UseSpecificCatch")
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        int c, ejes;
        Vehiculo aux;
        try {
            c = JTablePersona.getSelectedRow();
            aux = Lis.get(c);
            ejes = Integer.parseInt(JOptionPane.showInputDialog("Nueva Placa"));
            aux.setNumero_de_ejes(ejes);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Escojer una fila");
        }
        verDatos(); 
    }//GEN-LAST:event_BtnModificarActionPerformed
    
    private void guardar(){
        File file = new File("Cobro-Vehiculos.txt");
        PrintWriter Escribe;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) { 
            }
        }
        try {
            Vehiculo aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < Lis.size(); i++) {
                aux = Lis.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e) {
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String botones[] = {"Si", "No"};
        int n = JOptionPane.showOptionDialog(null, "Desea guardar la informacio?", "Titulo", 0,0, null, botones, null);
        if(n == 0)
            guardar();
    }//GEN-LAST:event_formWindowClosing

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
      
            
     
      
      
      
      
    }//GEN-LAST:event_BtnAgregarMouseClicked
    private void verDatos(){
        String Mat[][] = new String[Lis.size()][5];
        Vehiculo aux;
        for (int i = 0; i < Lis.size(); i++) {
            aux = Lis.get(i);
            Mat[i][0] = aux.getTipovehiculo();
            Mat[i][1] = aux.getPlaca();
            Mat[i][2] = Integer.toString(aux.getNumero_de_ejes());
            Mat[i][3] = Integer.toString(aux.getCuota());
            Mat[i][4] = Integer.toString(aux.getTotal());
        }
        JTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            Mat, 
            new String [] {
                "Tipo de vehiculo", "Ejes", "Placa","Cuota-Subtotal","Total"
            }
        ));
        
    }
    public void cargar(){
        File Archivo = new File("Cobro-Vehiculos.txt");
        FileReader Leer;
        BufferedReader Almacen;
        Vehiculo per;
        Vehiculo aux = new Vehiculo();
        try {
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            per = aux.cargar(Almacen);
            while(per != null){
                Lis.add(per);
                per = aux.cargar(Almacen);
            }
            Almacen.close();
            Leer.close();
        } catch (Exception e) {
        }
        verDatos();
    }
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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JTable JTablePersona;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JComboBox<String> cboCuotas;
    private javax.swing.JComboBox<String> cboEjes;
    private javax.swing.JComboBox<String> cboTVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel res;
    // End of variables declaration//GEN-END:variables
}
