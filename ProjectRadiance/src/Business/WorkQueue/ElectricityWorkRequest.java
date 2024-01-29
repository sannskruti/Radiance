/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class ElectricityWorkRequest extends WorkRequest{
    
     private String testResult;
    private String address;
    private String electricityproviderName;
    private int consumption;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricityproviderName() {
        return electricityproviderName;
    }

    public void setElectricityproviderName(String electricityproviderName) {
        this.electricityproviderName = electricityproviderName;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
