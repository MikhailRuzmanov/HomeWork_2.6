package sky.pro.skyprospring.HomeWork_2_5.service;

import org.springframework.stereotype.Service;
import sky.pro.skyprospring.HomeWork_2_5.Employee;
import sky.pro.skyprospring.HomeWork_2_5.exeption.EmployeeAlreadyAddedException;
import sky.pro.skyprospring.HomeWork_2_5.exeption.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();


                //new Employee("Олег", "Васильев"),
                //new Employee("Олим", "Воронов"),
                //new Employee("Анна", "Цветкова"),
                //new Employee("Анастасия", "Крылова"),
                //new Employee("Антон", "Скворцова"),
                //new Employee("Демьян ", "Репин"),
                //new Employee("Екатерина", "Вастльева"),
                //new Employee("Валентина", "Стружкина"),
                //new Employee("Валерьян", "Крючкова"),
                //new Employee("Роман", "Ильин")

    }

        @Override
        public Employee add (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee)) {
                throw new EmployeeAlreadyAddedException();
            }
            employeeList.add(employee);
            return employee;
        }

        @Override
        public Employee remove (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee)) {
                employeeList.remove(employee);
                return employee;
            }
            throw new EmployeeNotFoundException();
        }

        @Override
        public Employee find (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee)) {
                return employee;
            }

            throw new EmployeeNotFoundException();
        }

        @Override
        public Collection<Employee> findAll () {
            return Collections.unmodifiableList(employeeList);
        }
    }
