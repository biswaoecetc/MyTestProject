package com.test.model;

import java.util.Comparator;

public class ComparatorForEmpldAndEmpName implements Comparator<Employee> {
    @Override
    public int compare(Employee empl1, Employee empl2) {
        if((empl1.getEmployeeName().compareTo(empl2.getEmployeeName()) > 0 )
                && ((empl1.getDeptNumber().compareTo(empl2.getDeptNumber())> 0))){
            return 1;
        }else if(((empl1.getEmployeeName().compareTo(empl2.getEmployeeName()) < 0 )
                && ((empl1.getDeptNumber().compareTo(empl2.getDeptNumber() ) < 0)))){
            return -1;
        }else {
            return 0;
        }
    }
}
