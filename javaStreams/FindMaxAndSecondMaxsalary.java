package javaStreams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    // Constructor and other methods

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class FindMaxAndSecondMaxsalary {


        public static void main (String[] args){
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Doe", 75000),
                new Employee("Smith", 80000)
        );

        // Using Stream API to find the employee with the highest salary
        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        if (highestSalaryEmployee != null) {
            System.out.println("Employee with the highest salary: " + highestSalaryEmployee.getName()
                    + " - Salary: " + highestSalaryEmployee.getSalary());
        } else {
            System.out.println("No employees found");
        }

            /**
             *  Find second highest salary
             */
            Employee secondHighestSalaryEmployee = employees.stream()
                    .sorted(Comparator.comparing(Employee::getSalary))
                    .skip(1)
                    .findFirst()
                    .orElse(null);

            if (secondHighestSalaryEmployee != null) {
                System.out.println("Employee with the  second highest salary: " + highestSalaryEmployee.getName()
                        + " - Salary: " + secondHighestSalaryEmployee.getSalary());
            } else {
                System.out.println("No employees found with second secondHighestSalaryEmployee ");
            }
    }
    }

