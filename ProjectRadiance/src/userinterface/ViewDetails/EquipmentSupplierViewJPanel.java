/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ViewDetails;

import Business.WorkQueue.EquipmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class EquipmentSupplierViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EquipmentSupplierViewJPanel
     */
    private JPanel userProcessContainer;
    private EquipmentWorkRequest request;
    public EquipmentSupplierViewJPanel(JPanel userProcessContainer,EquipmentWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        NameJTextField.setText(request.getEquipmentName());
        addressJTextField.setText(request.getAddress());
        quantityJTextField.setText(String.valueOf(request.getQuantity()));
        nameTxtField.setText(request.getName());
        messageJTextField.setText(request.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 383, 130, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Additional Comments");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 386, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 90, 50));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 200, -1, -1));

        nameTxtField.setEditable(false);
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 200, 130, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 248, -1, -1));
        add(NameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 245, 130, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 294, -1, -1));
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 291, 130, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 340, -1, -1));
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 337, 130, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Equipment supplier  Request View details");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 770, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supplier.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameJTextField;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField quantityJTextField;
    // End of variables declaration//GEN-END:variables
}
