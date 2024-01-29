/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem eco = EcoSystem.getInstance();
        Employee employee = eco.getEmployeeDirectory().createEmployee("admin");
        UserAccount account = eco.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        return eco;
    }
}
