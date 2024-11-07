package oop.hus.lab5.mypolynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.2, 2.3, 3.4, 4.5);

        System.out.println("Polynomial 1: " + polynomial1);
        System.out.println("Polynomial 2: " + polynomial2);

        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());

        System.out.println("Evaluation of Polynomial 1 at x = 2: " + polynomial1.evaluate(2));
        System.out.println("Evaluation of Polynomial 2 at x = 3: " + polynomial2.evaluate(3));

        MyPolynomial sum = polynomial1.add(polynomial2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sum);

        MyPolynomial product = polynomial1.multiply(polynomial2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + product);
    }

}
