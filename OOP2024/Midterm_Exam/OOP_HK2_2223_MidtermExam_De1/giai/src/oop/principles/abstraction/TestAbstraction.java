package oop.principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, 5000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 20, 80);

        fullTime.calculateSalary();
        partTime.calculateSalary();
    }
}
