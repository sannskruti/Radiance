package Business.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class Employee {
    
    private String name;
    private int empid;
    private static int counter = 1;

    public Employee() {
        empid = counter;
        counter++;
    }

    public int getId() {
        return empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
