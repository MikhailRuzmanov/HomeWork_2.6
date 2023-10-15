package sky.pro.skyprospring.HomeWork_2_5.service;

import sky.pro.skyprospring.HomeWork_2_5.Employee;

import java.util.Collection;

public interface EmployeeService  {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
