
package Pincipal;
import caseta.CalculosPeaje;

public class paginaCajero extends javax.swing.JPanel {
CalculosPeaje Calcular = new CalculosPeaje();
    private String[] args;
   
    public paginaCajero() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButtonCalculopeaje = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jToggleButtonCalculopeaje.setText("Calcular peaje");
        jToggleButtonCalculopeaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCalculopeajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonCalculopeaje)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonCalculopeaje)
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonCalculopeajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCalculopeajeActionPerformed
        CalculosPeaje.main(args);
    }//GEN-LAST:event_jToggleButtonCalculopeajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButtonCalculopeaje;
    // End of variables declaration//GEN-END:variables
}
