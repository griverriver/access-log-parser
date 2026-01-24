package ru.courses.objects;

import java.util.Objects;

public class Employee {
    String employeeName;
    Department department;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (Objects.equals(employeeName, department.boss.employeeName)) {
            return employeeName + " начальник отдела " + department.departmentName;
        } else {
            return employeeName + " работает в отделе " + department.departmentName
                    + ", начальник которого " + department.boss.employeeName;
        }
    }
}