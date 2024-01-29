/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EquipmentSupplierRole;

import Business.WorkQueue.EquipmentWorkRequest;
import userinterface.MaterialSupplierRole.*;
import Business.WorkQueue.MaterialWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ProcessEquipmentWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EquipmentWorkRequest request;
    public ProcessEquipmentWorkRequestJPanel(JPanel userProcessContainer, EquipmentWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApproveJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ApproveJButton.setBackground(new java.awt.Color(0, 0, 0));
        ApproveJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ApproveJButton.setForeground(new java.awt.Color(255, 255, 255));
        ApproveJButton.setText("Ship");
        ApproveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveJButtonActionPerformed(evt);
            }
        });
        add(ApproveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 330, 140, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 147, -1, -1));

        resultJTextField.setBackground(new java.awt.Color(102, 102, 102));
        resultJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        resultJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 187, 715, 117));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 330, -1, 43));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 330, 81, 43));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setText("Equipment Supplier - Processing");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 630, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logisticsnew.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EquipmentSupplierWorkAreaJPanel dwjp = (EquipmentSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void ApproveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Shipped");
        JOptionPane.showMessageDialog(null,"Your order is Shipped","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_ApproveJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Cancelled");
        JOptionPane.showMessageDialog(null,"Your order is Cancelled","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultJTextField;
    // End of variables declaration//GEN-END:variables
}