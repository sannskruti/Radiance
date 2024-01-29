/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author adarshsuryavanshi
 */
public class performance extends javax.swing.JPanel {
    
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    

    /**
     * Creates new form performance
     */
  public performance(JPanel userProcessContainer, EcoSystem system) {
        System.out.println("Adarsh: ");
        initComponents();
        this.system = system;
        populateTable();
    }

    private void populateTable() {
        List<Object[]> userData = new ArrayList<>();
        List<Object[]> organizationData = new ArrayList<>();
        for (Network network : this.system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        Object[] userRow = new Object[3]; // Added a column for network name
                        userRow[0] = userAccount.getUsername();
                        userRow[1] = organization.getName();
                        userRow[2] = network.getName();
                        userData.add(userRow);

                        Object[] orgRow = new Object[2]; // Added a column for network name
                        orgRow[0] = organization.getName();
                        orgRow[1] = network.getName();
                        organizationData.add(orgRow);
                    }
                }
            }
        }

        DefaultTableModel userModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel organizationModel = (DefaultTableModel) jTable2.getModel();

        // Add new column headers
        String[] userColumnHeaders = {"User Names", "Organization Name", "Ecosystem"};
        String[] orgColumnHeaders = {"Organization Name", "Ecosystem"};
        userModel.setColumnIdentifiers(userColumnHeaders);
        organizationModel.setColumnIdentifiers(orgColumnHeaders);

        userModel.setRowCount(0);
        for (Object[] userRow : userData) {
            userModel.addRow(userRow);
        }

        organizationModel.setRowCount(0);
        for (Object[] orgRow : organizationData) {
            organizationModel.addRow(orgRow);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Names", "Organization", "Ecosystem"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 792, 116));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Users");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 467, 29));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Highest Bank Loan ($): ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 186, -1));

        jTable2.setBackground(new java.awt.Color(102, 102, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Name", "Ecosystem"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 792, 215));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Organizations");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 297, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Max Loan providing authority:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 233, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Highest Subsidy given (%):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 186, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("50000");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 60, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nova Finance Firm");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("20");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 610, 30, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Performance Dashboard");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 630, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/performance.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));
    }// </editor-fold>//GEN-END:initComponents

   
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}