package oop.pattern.iterator.exe3.employee;

public class App {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        for (Iterator iterator = (Iterator) employeeRepository.getIterator(); iterator.hasNext(); ) {
            String employee = (String) iterator.next();
            System.out.println("Employee: " + employee);
        }
    }
}
