package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return Chuỗi mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = degree();

        for (int i = 0; i <= degree; i++) {
            double coef = coefficient(i);
            if (i == 0) {
                sb.append(coef);
            } else {
                sb.append(" + ").append(coef).append("x^").append(i);
            }
        }

        return sb.toString();
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        int degree = degree();
        double[] diffCoefficients = new double[degree];

        for (int i = 1; i <= degree; i++) {
            diffCoefficients[i - 1] = coefficient(i) * i;
        }

        return diffCoefficients;
    }
}
