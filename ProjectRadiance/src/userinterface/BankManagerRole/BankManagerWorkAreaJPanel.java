/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BankManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BankLoanWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ViewDetails.BankWRViewJPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class BankManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BankManagerOrganization bankManagerOrganization;
    
    
    public BankManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.bankManagerOrganization = (BankManagerOrganization)organization;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        backgroundCheckJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignJButton1 = new javax.swing.JButton();
        viewDetailsjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(51, 51, 51));
        workRequestJTable.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Comments", "Sent By", "Assigned to", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 920, 110));

        backgroundCheckJButton.setBackground(new java.awt.Color(0, 0, 0));
        backgroundCheckJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backgroundCheckJButton.setForeground(new java.awt.Color(255, 255, 255));
        backgroundCheckJButton.setText("Client Check");
        backgroundCheckJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundCheckJButtonActionPerformed(evt);
            }
        });
        add(backgroundCheckJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 40));

        processJButton.setBackground(new java.awt.Color(0, 0, 0));
        processJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 140, 50));

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 180, 90, 40));

        assignJButton1.setBackground(new java.awt.Color(0, 0, 0));
        assignJButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        assignJButton1.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton1.setText("Assign to me");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });
        add(assignJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 40));

        viewDetailsjButton1.setBackground(new java.awt.Color(0, 0, 0));
        viewDetailsjButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewDetailsjButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsjButton1.setText("View Details");
        viewDetailsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButton1ActionPerformed(evt);
            }
        });
        add(viewDetailsjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 140, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bank Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 450, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bankbg.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundCheckJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundCheckJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Completed") || request.getStatus().equalsIgnoreCase("Intermidate") ) {
            
        JOptionPane.showMessageDialog(null, "This request is already in other state","info",JOptionPane.INFORMATION_MESSAGE);
        }else if (request.getReceiver() !=null ){
                if(request.getReceiver().equals(userAccount)){
            request.setSender(userAccount);
            request.setStatus("Intermidate") ;
            request.setReceiver(null);
            populateTable();
			JOptionPane.showMessageDialog(null, "Request forwarded to Client Officer","info",JOptionPane.INFORMATION_MESSAGE);

                }}else {

        JOptionPane.showMessageDialog(null, "Kindly assign the request first!!","info",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_backgroundCheckJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        BankLoanWorkRequest request = (BankLoanWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("client Check - Approved") || request.getStatus().equalsIgnoreCase("client Check - Rejected")){
        
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
             JOptionPane.showMessageDialog(null, "Complete client check before processing","info",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_assignJButton1ActionPerformed

    private void viewDetailsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            BankLoanWorkRequest request = (BankLoanWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
            BankWRViewJPanel panel = new BankWRViewJPanel(userProcessContainer, request);
            userProcessContainer.add("BankManagerWRViewJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDetailsjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton1;
    private javax.swing.JButton backgroundCheckJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewDetailsjButton1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
