package com.test.model;

public class Employee {
    public Employee(Integer employeeId, String employeeName, String deptNumber) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.deptNumber = deptNumber;
    }

    private Integer employeeId;
    private String employeeName;
    private String deptNumber;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String emplDataToString(){
        return this.getEmployeeName() + " " + this.getDeptNumber() + " " + this.getEmployeeId();
    }
}
