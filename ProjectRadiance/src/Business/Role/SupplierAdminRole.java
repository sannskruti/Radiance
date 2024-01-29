/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierAdminRole.SupplierAdminWorkAreaJPanel;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class SupplierAdminRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplierAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
    public String toString() {
        return Role.RoleType.SupplierAdminRole.getValue();
    }
}
