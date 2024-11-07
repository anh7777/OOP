package hus.oop.integration;

import java.util.Random;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Viết chương trình test các chức năng của đa thức và các phương pháp tính tích phân.

         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testPolynomial();
        System.out.println();
        testIntegrationCalculator();

    }


    private static ArrayPolynomial creatMyArrayPolynomial() {
        Random random = new Random();
        int degree = random.nextInt(10) + 1;
        ArrayPolynomial polynomial = new ArrayPolynomial();
        for (int i = 0; i <= degree; i++) {
            polynomial.insertAtPosition(random.nextInt(10) + 1, i);
        }
        return polynomial;
    }

    private static ListPolynomial creatMyListPolynomial() {
        Random random = new Random();
        int degree = random.nextInt(10) + 1;
        ListPolynomial polynomial = new ListPolynomial();
        for (int i = 0; i <= degree; i++) {
            polynomial.insertAtPosition(random.nextInt(10) + 1, i);
        }
        return polynomial;
    }


    public static void testPolynomial() {
        /*
         TODO

         - Tạo ra các đá thức kiểu ArrayPolynomial và ListPolynomial.
         - Viết chương trình test các chức năng của đa thức (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         - In kết quả ra terminal mỗi lần thực hiện các chức năng.
         */
        System.out.println("testListPolynomial:");
        ArrayPolynomial polynomial1 = creatMyArrayPolynomial();
        ListPolynomial polynomial2 = creatMyListPolynomial();
        System.out.println("polynomial: " + polynomial1);
        System.out.println("add: " + polynomial1.plus(polynomial2));
        System.out.println("minus: " + polynomial1.minus(polynomial2));
        System.out.println("times: " + polynomial1.multiplyBy(polynomial2));
        System.out.println("polynomial with x = 2: " + polynomial1.evaluate(2));
        System.out.println("polynomial with y = 2: " + polynomial2.evaluate(2));

    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        System.out.println("testIntegrationCalculator:");
        ArrayPolynomial polynomial1 = creatMyArrayPolynomial();
        ListPolynomial polynomial2 = creatMyListPolynomial();
        System.out.println("array polynomial: " + polynomial1);
        System.out.println("list polynomial: " + polynomial2);

        IntegrationCalculator calculator = new IntegrationCalculator(new MidpointRule(0.0001, 1000), polynomial1);
        System.out.println("MidpointMethod: " + calculator.integrate(1, 2));
        calculator.setIntegrator(new TrapezoidRule(0.0001, 1000));
        System.out.println("TrapezoidMethod: " + calculator.integrate(1, 2));
        calculator.setIntegrator(new SimpsonRule(0.0001, 1000));
        System.out.println("SimpsonMethod: " + calculator.integrate(1, 2));
    }
}
