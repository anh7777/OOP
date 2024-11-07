package oop.pattern.iterator.exe3.employee;

import java.util.Iterator;

public class EmployeeRepository implements EmployeeIterable {
    public String[] employees;

    public EmployeeRepository() {
        employees = new String[]{"David", "Scott", "Rhett", "Andrew", "Jessica"};
    }

    @Override
    public Iterator<String> getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<String> {
        private int position;

        public EmployeeIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < employees.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return employees[position++];
            }
            return null;
        }
    }
}
