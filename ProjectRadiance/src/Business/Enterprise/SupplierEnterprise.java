/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class SupplierEnterprise extends Enterprise{
    
    public SupplierEnterprise(String suppname){
        super(suppname,Enterprise.EnterpriseType.Supplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
