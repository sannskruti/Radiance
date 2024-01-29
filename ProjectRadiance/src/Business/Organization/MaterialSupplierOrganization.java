/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MaterialSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class MaterialSupplierOrganization extends Organization{
    public MaterialSupplierOrganization() {
        super(Organization.Type.MaterialSupplierOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MaterialSupplierRole());
        return roles;
    }
    
}
