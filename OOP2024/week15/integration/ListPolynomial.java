package hus.oop.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return hệ số tại vị trí index.
     */
    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient hệ số của phần tử cần thêm.
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient hệ số của phần tử cần thêm.
     * @param index vị trí cần thêm phần tử.
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử tại vị trí index là coefficient.
     * @param coefficient hệ số mới của phần tử.
     * @param index vị trí cần sửa.
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @param x giá trị của biến đa thức.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.append(coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another đa thức cần cộng.
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coeff1 = (i < coefficients.size()) ? coefficients.get(i) : 0;
            double coeff2 = (i < another.coefficients.size()) ? another.coefficient(i) : 0;
            result.append(coeff1 + coeff2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another đa thức cần trừ.
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxLength; i++) {
            double coeff1 = (i < coefficients.size()) ? coefficients.get(i) : 0;
            double coeff2 = (i < another.coefficients.size()) ? another.coefficient(i) : 0;
            result.append(coeff1 - coeff2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another đa thức cần nhân.
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int resultDegree = degree() + another.degree();
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i <= resultDegree; i++) {
            double coeff = 0;
            for (int j = 0; j <= i; j++) {
                if (j < coefficients.size() && (i - j) < another.coefficients.size()) {
                    coeff += coefficients.get(j) * another.coefficient(i - j);
                }
            }
            result.append(coeff);
        }
        return result;
    }

    /**
     * Chuyển đổi đa thức thành chuỗi.
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return chuỗi mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int degree = degree();
        for (int i = degree; i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0) {
                if (builder.length() > 0) {
                    builder.append(" + ");
                }
                if (i == 0) {
                    builder.append(coeff);
                } else {
                    if (coeff != 1) {
                        builder.append(coeff);
                    }
                    builder.append("x");
                    if (i > 1) {
                        builder.append("^").append(i);
                    }
                }
            }
        }
        return builder.toString();
    }
}

