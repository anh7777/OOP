package hus.oop.integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<Double>();
    }

    public ListPolynomial(double[] coefficients) {
        this.coefficients = new ArrayList<Double>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }


    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] coef = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coef[i] = coefficients.get(i);
        }
        return coef;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtStart(double coefficient) {
        /* TODO */
        return insertAtPosition(coefficient, 0);
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtEnd(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insertAtPosition(double coefficient, int index) {
        /* TODO */
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index, coefficient);
        return this;

    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }


    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double p = 0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            p = coefficients.get(i) + (x * p);
        }
        return p;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public ListPolynomial derivative() {
        /* TODO */
        double[] newCoefficients = differentiate();
        return new ListPolynomial(newCoefficients);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public ListPolynomial plus(Polynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            result.insertAtPosition(coefficients.get(i) + another.coefficient(i), i);
        }

        if (another.coefficients().length > this.coefficients.size()) {
            for (int i = coefficients.size(); i < another.coefficients().length; i++) {
                result.insertAtPosition(another.coefficient(i), i);
            }
        }

        if (result.coefficients().length > this.coefficients.size()) {
            for (int i = coefficients.size(); i < result.coefficients().length; i++) {
                result.insertAtPosition(result.coefficient(i), i);
            }
        }
        return result;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plusTo(Polynomial another) {
        /* TODO */
        for (int i = 0; i < coefficients.size(); i++) {
            if (i >= another.coefficients().length) {
                break;
            }
            coefficients.set(i, coefficients.get(i) + another.coefficient(i));
        }
        if (another.coefficients().length > this.coefficients.size()) {
            for (int i = coefficients.size(); i < another.coefficients().length; i++) {
                coefficients.add(another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public ListPolynomial minus(Polynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            result.insertAtPosition(coefficients.get(i) - another.coefficient(i), i);
        }
        if (another.coefficients().length > this.coefficients.size()) {
            for (int i = coefficients.size(); i < another.coefficients().length; i++) {
                result.insertAtPosition(another.coefficient(i), i);
            }
        }
        if (another.coefficients().length < this.coefficients.size()) {
            for (int i = coefficients.size(); i < result.coefficients().length; i++) {
                result.insertAtPosition(result.coefficient(i), i);
            }
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minusFrom(Polynomial another) {
        /* TODO */
        for (int i = 0; i < coefficients.size(); i++) {
            if (i >= another.coefficients().length) {
                break;
            }
            coefficients.set(i, coefficients.get(i) - another.coefficient(i));
        }
        if (another.coefficients().length > this.coefficients.size()) {
            for (int i = coefficients.size(); i < another.coefficients().length; i++) {
                coefficients.add(another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public ListPolynomial multiply(Polynomial another) {
        /* TODO */
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            result.insertAtPosition(coefficients.get(i) * another.coefficient(i), i);
        }
//        if (another.coefficients().length > this.coefficients.size()) {
//            for (int i = coefficients.size(); i < another.coefficients().length; i++) {
//                result.insertAtPosition(another.coefficient(i), i);
//            }
//        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiplyBy(Polynomial another) {
        /* TODO */
        List<Double> prod = new ArrayList<>(
                Arrays.asList(
                        new Double[
                                coefficients.size() + another.coefficients().length - 1]));

        for (int i = 0; i < another.coefficients().length; i++) {
            for (int j = 0; j < coefficients.size(); j++) {
                prod.set(i + j, coefficients.get(i) * another.coefficient(j));
            }
        }
        coefficients = prod;
        return this;
    }
}
