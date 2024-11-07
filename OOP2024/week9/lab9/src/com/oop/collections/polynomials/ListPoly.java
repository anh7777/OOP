package com.oop.collections.polynomials;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as a list
 */
public class ListPoly extends AbstractPoly {

    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double coeff : coeffs) {
            coefficients.add(coeff);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        List<Double> derivedCoefficients = new ArrayList<>();
        for (int i = 1; i < coefficients.size(); i++) {
            derivedCoefficients.add(coefficients.get(i) * i);
        }
        return new ListPoly(derivedCoefficients.stream().mapToDouble(Double::doubleValue).toArray());
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.size()) {
            return coefficients.get(degree);
        } else {
            return 0.0;
        }
    }

    @Override
    public double[] coefficients() {
        return coefficients.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
