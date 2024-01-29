/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MaterialSupplierRole;

import Business.WorkQueue.MaterialWorkRequest;
import userinterface.BankManagerRole.*;
import Business.WorkQueue.ElectricityWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ProcessMaterialWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    MaterialWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessMaterialWorkRequestJPanel(JPanel userProcessContainer, MaterialWorkRequest request) {
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

        approveJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        rejectjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approveJButton.setBackground(new java.awt.Color(0, 0, 0));
        approveJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        approveJButton.setForeground(new java.awt.Color(255, 255, 255));
        approveJButton.setText("Ship");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 177, 105, 34));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 189, -1, -1));

        resultJTextField.setBackground(new java.awt.Color(102, 102, 102));
        resultJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        resultJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 229, 622, 104));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 339, 107, 39));

        rejectjButton1.setBackground(new java.awt.Color(0, 0, 0));
        rejectjButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rejectjButton1.setForeground(new java.awt.Color(255, 255, 255));
        rejectjButton1.setText("Cancel");
        rejectjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectjButton1ActionPerformed(evt);
            }
        });
        add(rejectjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 339, -1, 39));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Material Supplier - Processing");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 50, 616, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logisticsnew.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 920));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MaterialSupplierWorkAreaJPanel dwjp = (MaterialSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Shipped");
        JOptionPane.showMessageDialog(null,"Order Shipped","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void rejectjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectjButton1ActionPerformed
        // TODO add your handling code here:
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Cancelled");
        JOptionPane.showMessageDialog(null,"Order Cancelled","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_rejectjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton rejectjButton1;
    private javax.swing.JTextField resultJTextField;
    // End of variables declaration//GEN-END:variables
}