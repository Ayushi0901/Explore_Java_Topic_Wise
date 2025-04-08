package Oops;

public class PracticeInheritance {
    /*
    Scenario: Employee Management System
In an Employee Management System, different types of employees
(e.g., FullTimeEmployee, PartTimeEmployee, ContractEmployee) can inherit from a common Employee class.
This allows each subclass to have specific characteristics and methods while sharing common properties and behaviors from the parent class.
     */

    // Parent class
    static class Employee {
        String name;
        int id;

        Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        void work() {
            System.out.println(name + " is working.");
        }
    }

    // Oops.Child class representing a full-time employee
    static class FullTimeEmployee extends Employee {
        double salary;

        FullTimeEmployee(String name, int id, double salary) {
            super(name, id);
            this.salary = salary;
        }

        void displayFullTimeDetails() {
            System.out.println("Full-Time Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
        }
    }

    // Oops.Child class representing a part-time employee
    static class PartTimeEmployee extends Employee {
        double hourlyRate;

        PartTimeEmployee(String name, int id, double hourlyRate) {
            super(name, id);
            this.hourlyRate = hourlyRate;
        }

        void displayPartTimeDetails() {
            System.out.println("Part-Time Employee: " + name + ", ID: " + id + ", Hourly Rate: $" + hourlyRate);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, 50000);
            PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, 20);

            fullTimeEmp.displayFullTimeDetails();
            partTimeEmp.displayPartTimeDetails();
        }
    }

}
