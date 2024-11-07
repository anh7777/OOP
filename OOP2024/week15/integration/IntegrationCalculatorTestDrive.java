package hus.oop.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ListPolynomial polynomial = new ListPolynomial();

        polynomial.append(2.0);
        polynomial.append(3.0);

        polynomial.insert(4.0, 1);

        polynomial.set(5.0, 0);

        ListPolynomial otherPolynomial = new ListPolynomial();
        otherPolynomial.append(6.0);
        otherPolynomial.append(7.0);

        polynomial.plus(otherPolynomial);

        polynomial.minus(otherPolynomial);

        polynomial.multiply(otherPolynomial);

        double x = 2.0;
        double value = polynomial.evaluate(x);
        System.out.println("Value of the polynomial at x = " + x + ": " + value);

    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ListPolynomial polynomial = new ListPolynomial();

        polynomial.append(2.0);
        polynomial.append(3.0);

        polynomial.insert(4.0, 1);
        polynomial.set(5.0, 0);

        ListPolynomial otherPolynomial = new ListPolynomial();
        otherPolynomial.append(6.0);
        otherPolynomial.append(7.0);

        polynomial.plus(otherPolynomial);

        polynomial.minus(otherPolynomial);

        polynomial.multiply(otherPolynomial);
        double x = 2.0;
        double value = polynomial.evaluate(x);
        System.out.println("Value of the polynomial at x = " + x + ": " + value);
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        ArrayPolynomial polynomial = new ArrayPolynomial();
        polynomial.append(1.0);
        Integrator midpointRule = new MidpointRule(0.0001, 1000);
        Integrator trapezoidRule = new TrapezoidRule(0.0001, 1000);
        Integrator simpsonRule = new SimpsonRule(0.0001, 1000);

        IntegrationCalculator calculator = new IntegrationCalculator(midpointRule, polynomial);
        double resultMidpoint = calculator.integrate(0, 1);
        calculator.setIntegrator(trapezoidRule);
        double resultTrapezoid = calculator.integrate(0, 1);
        calculator.setIntegrator(simpsonRule);
        double resultSimpson = calculator.integrate(0, 1);


        System.out.println("Midpoint Rule:");
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Integration result: " + resultMidpoint);
        System.out.println();

        System.out.println("Trapezoid Rule:");
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Integration result: " + resultTrapezoid);
        System.out.println();

        System.out.println("Simpson Rule:");
        System.out.println("Polynomial: " + polynomial.toString());
        System.out.println("Integration result: " + resultSimpson);
        System.out.println();
    }
}
