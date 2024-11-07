package hus.com.poly;

import java.util.Arrays;

public abstract class AbstractPoly implements Poly {
    protected int degree;

    @Override
    public int degree() {
        return degree;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractPoly that = (AbstractPoly) obj;
        return degree == that.degree && Arrays.equals(coefficients(), that.coefficients());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Poly[");
        int[] coeffs = coefficients();
        for (int i = 0; i < coeffs.length; i++) {
            if (i > 0) result.append(" + ");
            result.append(coeffs[i]).append("x^").append(i);
        }
        result.append("]");
        return result.toString();
    }

    protected int[] differentiate() {
        int[] coeffs = coefficients();
        int[] derivative = new int[coeffs.length - 1];
        for (int i = 1; i < coeffs.length; i++) {
            derivative[i - 1] = i * coeffs[i];
        }
        return derivative;
    }
}
