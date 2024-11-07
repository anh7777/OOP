package oop.principles.abstraction;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-time employee salary: " + salary);
    }
}
