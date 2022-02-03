
package Loging;

import javax.swing.JOptionPane;


public class MRegistro extends javax.swing.JFrame {

   
    public MRegistro() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("REGISTRO");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        txtrango = new javax.swing.JTextField();
        jButtonREGISTRAR = new javax.swing.JButton();
        jButtonINICIARSESION = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel1.setText("USUARIO: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel2.setText("CONTRASEÑA: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel3.setText("RANGO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 234, -1));

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 234, -1));
        getContentPane().add(txtrango, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 234, -1));

        jButtonREGISTRAR.setText("REGISTRARSE");
        jButtonREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREGISTRARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 162, -1));

        jButtonINICIARSESION.setText("INICIAR SESION");
        jButtonINICIARSESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINICIARSESIONActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonINICIARSESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 162, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loging/registro.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void jButtonREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREGISTRARActionPerformed
        String usuario = txtusuario.getText();
        String contraseña = txtcontraseña.getText();
        String rango = txtrango.getText();
        Usuario obj = new Usuario();
        if(Usuario.verificarusuarioNuevo(usuario)==-1){
        obj.setUsuario(usuario);
        obj.setContraseña(contraseña);
        obj.setRango(rango);
        Listausuario.agregarUsuario(obj);
          JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
        }
        else{
                JOptionPane.showMessageDialog(this, "ESTE USUARIO YA EXISTE");
                }
    }//GEN-LAST:event_jButtonREGISTRARActionPerformed

    private void jButtonINICIARSESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINICIARSESIONActionPerformed
       MLogueo abrir = new MLogueo ();
       abrir.setVisible(true);
       
    }//GEN-LAST:event_jButtonINICIARSESIONActionPerformed

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonINICIARSESION;
    private javax.swing.JButton jButtonREGISTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtrango;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
