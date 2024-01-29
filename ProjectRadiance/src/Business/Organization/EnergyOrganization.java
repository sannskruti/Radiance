/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EnergyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class EnergyOrganization extends Organization{
    public EnergyOrganization() {
        super(Organization.Type.EnergyOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnergyRole());
        return roles;
    }
}
