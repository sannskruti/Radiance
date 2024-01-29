/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ElectricitySupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ElectricitySupplierOrganization extends Organization{
    public ElectricitySupplierOrganization() {
        super(Organization.Type.ElectricitySupplierOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ElectricitySupplierRole());
        return roles;
    }
    
}
