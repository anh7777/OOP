package oop.hus.lab5.mypolynomial;

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
        StringBuilder builder = new StringBuilder();
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i == degree) {
                    builder.append(coeffs[i]).append("x^").append(i);
                } else {
                    builder.append((coeffs[i] >= 0) ? " + " : " - ").append(Math.abs(coeffs[i])).append("x^").append(i);
                }
            }
        }
        return builder.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int maxDegree = Math.max(thisDegree, anotherDegree);
        double[] resultCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            resultCoeffs[i] = ((i <= thisDegree) ? coeffs[i] : 0) + ((i <= anotherDegree) ? another.coeffs[i] : 0);
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int newDegree = thisDegree + anotherDegree;
        double[] resultCoeffs = new double[newDegree + 1];
        for (int i = 0; i <= thisDegree; i++) {
            for (int j = 0; j <= anotherDegree; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }

}
