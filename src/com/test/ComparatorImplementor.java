package com.test;

import com.test.model.ComparatorForEmpldAndEmpName;
import com.test.model.Employee;

import java.util.*;

public class ComparatorImplementor {

    public static void main(String []args){
        Employee employee1 = new Employee(1, "ABC", "50");
        Employee employee2 = new Employee(5, "ABC", "28");
        Employee employee3 = new Employee(3, "Radha", "20");
        Employee employee4 = new Employee(6, "Jhili", "30");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        //Collections.sort(employeeList, new ComparatorForEmpldAndEmpName());

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getEmployeeName).thenComparing(Employee::getDeptNumber);
        Collections.sort(employeeList, employeeComparator);
        for(int i=0; i< employeeList.size(); i++) {
            System.out.println("employeeList = " + employeeList.get(i).emplDataToString());
        }
    }
}
