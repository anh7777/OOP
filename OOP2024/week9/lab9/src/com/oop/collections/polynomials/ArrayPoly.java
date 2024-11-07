package com.oop.collections.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        int degree = degree();
        if (degree == 0) {
            return new ArrayPoly(new double[]{0});
        }

        double[] derivativeCoefficients = new double[degree];
        for (int i = 1; i < coefficients.length; i++) {
            derivativeCoefficients[i - 1] = coefficients[i] * i;
        }
        return new ArrayPoly(derivativeCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.length) {
            return coefficients[degree];
        } else {
            return 0.0;
        }
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone();
    }
}
