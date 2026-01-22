package ru.courses.objects;

import java.util.Objects;

public class Employee {
    private String employeeName;
    private Department department;

    public Employee(String employeeName, Department department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    @Override
    public String toString() {
        if (Objects.equals(employeeName, department.getBoss().getEmployeeName())) {
            return employeeName + " начальник отдела " + department.getDepartmentName();
        } else {
            return employeeName + " работает в отделе " + department.getDepartmentName()
                    + ", начальник которого " + department.getBoss().getEmployeeName();
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Department getDepartment() {
        return department;
    }
}


//
//Необходимо
//гарантировать, что Начальник отдела всегда работает в том отделе, где он начальник.