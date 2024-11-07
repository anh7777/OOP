package hus.com.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private final List<Integer> coefficients;

    public ListPoly() {
        coefficients = new ArrayList<>();
    }
    public ListPoly(List<Integer> coefficients) {
        this.coefficients = coefficients;
        this.degree = coefficients.size() - 1;
    }

    @Override
    public int coefficient(int i) {
        return coefficients.get(i);
    }

    @Override
    public int[] coefficients() {
        return coefficients.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPoly append(int coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    @Override
    public Poly derivative() {
        ListPoly result = new ListPoly();
        for (int i = 1; i < coefficients.size(); i++) {
            result.append(coefficients.get(i) * i);
        }
        return result;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = degree; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }
}

