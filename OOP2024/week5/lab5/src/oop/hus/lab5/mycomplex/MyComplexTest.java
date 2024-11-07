package oop.hus.lab5.mycomplex;

public class MyComplexTest {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(1.1, 2.2);
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        complex1.setReal(3.3);
        complex1.setImag(4.4);
        System.out.println("Complex 1 after setting real and imaginary parts: " + complex1);

        System.out.println("Is complex1 real? " + complex1.isReal());
        System.out.println("Is complex1 imaginary? " + complex1.isImaginary());

        System.out.println("Is complex1 equal to complex2? " + complex1.equals(complex2));

        System.out.println("Magnitude of complex2: " + complex2.magnitude());
        System.out.println("Argument of complex2: " + complex2.argument());

        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of complex1 and complex2: " + sum);
        MyComplex difference = complex1.subtractNew(complex2);
        System.out.println("Difference of complex1 and complex2: " + difference);
        MyComplex product = complex1.multiply(complex2);
        System.out.println("Product of complex1 and complex2: " + product);
        MyComplex quotient = complex1.divide(complex2);
        System.out.println("Quotient of complex1 and complex2: " + quotient);

        System.out.println("Conjugate of complex1: " + complex1.conjugate());
    }

}
