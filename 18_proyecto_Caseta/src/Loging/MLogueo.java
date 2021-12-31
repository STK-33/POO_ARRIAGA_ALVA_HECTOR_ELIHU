package Loging;

import java.awt.Menu;
import java.awt.Toolkit;
import proyecto_Caseta.menu;
import javax.swing.JOptionPane;


public class MLogueo extends javax.swing.JFrame {

    
    public MLogueo() {
        initComponents();
       this.setLocationRelativeTo(this);
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/Icono.png")));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        jLabelUSUARIO = new javax.swing.JLabel();
        jLabelCONTRASEÑA = new javax.swing.JLabel();
        ButtonIniciarSesion = new javax.swing.JButton();
        ButtonRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 220, -1));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 220, -1));

        jLabelUSUARIO.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabelUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUSUARIO.setText("USUARIO:");
        getContentPane().add(jLabelUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabelCONTRASEÑA.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabelCONTRASEÑA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCONTRASEÑA.setText("CONTRASEÑA:");
        getContentPane().add(jLabelCONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        ButtonIniciarSesion.setText("Iniciar Sesion");
        ButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 272, 129, -1));

        ButtonRegistrar.setText("Registrarse");
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loging/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Loging/loging.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed
        MRegistro abrir = new MRegistro ();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonRegistrarActionPerformed

    private void ButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIniciarSesionActionPerformed
        
        String usuario = txtusuario.getText();
        String contraseña = txtcontraseña.getText();
        int pos = Usuario.verificarIniciodeSesionNuevo(usuario, contraseña);
        if(pos==-1){
            JOptionPane.showMessageDialog(this,"USUARIO O CONTRASEÑA INCORRECTOS");
        }else{
            menu abrir = new menu();
            abrir.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ButtonIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MLogueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MLogueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIniciarSesion;
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCONTRASEÑA;
    private javax.swing.JLabel jLabelUSUARIO;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
