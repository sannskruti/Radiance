/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnergyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.EquipmentSupplierOrganization;
import Business.Organization.MaterialSupplierOrganization;
import Business.Organization.Organization;
import Business.Organization.ElectricitySupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EquipmentWorkRequest;
import Business.WorkQueue.MaterialWorkRequest;
import Business.WorkQueue.ElectricityWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class OrderSuppliesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
   
    public OrderSuppliesJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        nameTxtField.setText(userAccount.getUsername());
        populateSupplierComboBox(); 
    }
    
    private void populateSupplierComboBox(){
        supplierComboBox1.removeAllItems();
         for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof SupplierEnterprise) {
                    supplierComboBox1.addItem(enterprise.getName());
                }
             }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        consumptionJTextField = new javax.swing.JTextField();
        categoryJCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        supplierComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        requestTestJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Place Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Supply");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 20));

        messageJTextField.setBackground(new java.awt.Color(51, 51, 51));
        messageJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        messageJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 130, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, 30));

        valueLabel.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, -1));

        enterpriseLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        NameJTextField.setBackground(new java.awt.Color(51, 51, 51));
        NameJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        NameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(NameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 130, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        addressJTextField.setBackground(new java.awt.Color(51, 51, 51));
        addressJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addressJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(addressJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 130, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        consumptionJTextField.setBackground(new java.awt.Color(51, 51, 51));
        consumptionJTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        consumptionJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(consumptionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 130, -1));

        categoryJCombo.setBackground(new java.awt.Color(0, 0, 0));
        categoryJCombo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        categoryJCombo.setForeground(new java.awt.Color(255, 255, 255));
        categoryJCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electricity", "Material", "Equipment" }));
        categoryJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJComboActionPerformed(evt);
            }
        });
        add(categoryJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, 20));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Additional Comments");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        supplierComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        supplierComboBox1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        supplierComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        supplierComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(supplierComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 130, 20));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Supplier");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 20));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 20));

        nameTxtField.setEditable(false);
        nameTxtField.setBackground(new java.awt.Color(51, 51, 51));
        nameTxtField.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 20));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel8.setText("View details");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 40, 230, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123.jpg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        String category=(String) categoryJCombo.getSelectedItem();
        String message = messageJTextField.getText();
        String name = NameJTextField.getText();
        String address = addressJTextField.getText();
        String supplier = (String)supplierComboBox1.getSelectedItem();
        int consumption; int quantity = 0;
        
        try{
               consumption = Integer.parseInt(consumptionJTextField.getText());
            }
            catch(NumberFormatException e)           
                { JOptionPane.showMessageDialog(null,"Please enter number for consumption");
                return;
            }
        
        if(category.equals("")||address.equals("")||supplier.equals("")||name.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Item Name, category, Address and supplier are mandatory");
            return;
        }
        if(category.equals("Electricity")){
            ElectricityWorkRequest request = new ElectricityWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setElectricityproviderName(supplier);
            request.setAddress(address);
            request.setConsumption(consumption);
            request.setName(userAccount.getUsername());
        
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getName().equalsIgnoreCase(supplier)){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                if (organization instanceof ElectricitySupplierOrganization) {
                            org = organization;
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;
                       
                }

            }}
        }
        }
        else if(category.equals("Material")){
            MaterialWorkRequest request = new  MaterialWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setMaterialName(name);
            request.setAddress(address);
            request.setQuantity(quantity);
            request.setName(userAccount.getUsername());
        
        
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getName().equalsIgnoreCase(supplier)){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                if (organization instanceof  MaterialSupplierOrganization) {
                            org = organization;
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;    
                }
            }}
        }
        }
        else{
            
            EquipmentWorkRequest request = new EquipmentWorkRequest();
            request.setMessage(message);
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setEquipmentName(name);
            request.setAddress(address);
            request.setQuantity(quantity);
            request.setName(userAccount.getUsername());
        
        
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise.getName().equalsIgnoreCase(supplier)){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                if (organization instanceof EquipmentSupplierOrganization) {
                            org = organization;
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                            break;      
                }
            }}
        }
        }
        JOptionPane.showMessageDialog(null,"Your order is successfully placed","INFO",JOptionPane.INFORMATION_MESSAGE);
        backJButtonActionPerformed(evt);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EnergyWorkAreaJPanel dwjp = (EnergyWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void categoryJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJComboActionPerformed

    }//GEN-LAST:event_categoryJComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameJTextField;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> categoryJCombo;
    private javax.swing.JTextField consumptionJTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> supplierComboBox1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
