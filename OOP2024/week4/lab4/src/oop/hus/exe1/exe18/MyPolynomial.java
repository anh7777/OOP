package oop.hus.exe1.exe18;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == coeffs.length - 1) {
                    sb.append(coeffs[i]);
                } else {
                    sb.append((coeffs[i] >= 0) ? " + " : " - ").append(Math.abs(coeffs[i]));
                }
                if (i > 1) {
                    sb.append("x^").append(i);
                } else if (i == 1) {
                    sb.append("x");
                }
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int maxLength = Math.max(coeffs.length, another.coeffs.length);
        double[] resultCoeffs = new double[maxLength];
        for (int i = 0; i < coeffs.length; i++) {
            resultCoeffs[i] += coeffs[i];
        }
        for (int i = 0; i < another.coeffs.length; i++) {
            resultCoeffs[i] += another.coeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        double[] resultCoeffs = new double[coeffs.length + another.coeffs.length - 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }

}
