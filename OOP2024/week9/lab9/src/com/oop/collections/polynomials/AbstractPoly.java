package com.oop.collections.polynomials;

import java.util.Arrays;

public abstract class AbstractPoly implements Poly {

    protected double[] derive() {
        int degree = degree();
        if (degree == 0) {
            return new double[]{0};
        }

        double[] derivedCoefficients = new double[degree];
        for (int i = 1; i <= degree; i++) {
            derivedCoefficients[i - 1] = coefficient(i) * i;
        }

        return derivedCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPoly that = (AbstractPoly) o;
        return Arrays.equals(that.coefficients(), coefficients());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        for (double coeff : coefficients()) {
            temp = Double.doubleToLongBits(coeff);
            result = prime * result + (int) (temp ^ (temp >>> 32));
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coeffs = coefficients();
        for (int i = 0; i < coeffs.length; i++) {
            sb.append(coeffs[i]);
            if (i < coeffs.length - 1) {
                sb.append("x^").append(i).append(" + ");
            }
        }
        return sb.toString();
    }
}
