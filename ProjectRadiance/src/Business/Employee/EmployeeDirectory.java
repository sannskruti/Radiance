/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import java.util.ArrayList;
/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee emp = new Employee();
        emp.setName(name);
        employeeList.add(emp);
        return emp;
    }
    
}
