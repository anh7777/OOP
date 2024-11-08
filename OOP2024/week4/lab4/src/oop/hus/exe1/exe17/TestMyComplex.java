package oop.hus.exe1.exe17;

import java.util.Scanner;

public class TestMyComplex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter complex number 1 (real and imaginary part):");
            double real1 = scanner.nextDouble();
            double imag1 = scanner.nextDouble();
            MyComplex complex1 = new MyComplex(real1, imag1);

            System.out.println("Enter complex number 2 (real and imaginary part):");
            double real2 = scanner.nextDouble();
            double imag2 = scanner.nextDouble();
            MyComplex complex2 = new MyComplex(real2, imag2);

            System.out.println("Number 1 is: " + complex1);
            if (complex1.isReal()) {
                System.out.println(complex1 + " is a pure real number");
            } else {
                System.out.println(complex1 + " is NOT a pure real number");
            }
            if (complex1.isImaginary()) {
                System.out.println(complex1 + " is a pure imaginary number");
            } else {
                System.out.println(complex1 + " is NOT a pure imaginary number");
            }

            System.out.println("Number 2 is: " + complex2);
            if (complex2.isReal()) {
                System.out.println(complex2 + " is a pure real number");
            } else {
                System.out.println(complex2 + " is NOT a pure real number");
            }
            if (complex2.isImaginary()) {
                System.out.println(complex2 + " is a pure imaginary number");
            } else {
                System.out.println(complex2 + " is NOT a pure imaginary number");
            }

            if (complex1.equals(complex2)) {
                System.out.println(complex1 + " is equal to " + complex2);
            } else {
                System.out.println(complex1 + " is NOT equal to " + complex2);
            }

            System.out.println(complex1 + " + " + complex2 + " = " + complex1.addInfo(complex2));

            scanner.close();
        }


}
