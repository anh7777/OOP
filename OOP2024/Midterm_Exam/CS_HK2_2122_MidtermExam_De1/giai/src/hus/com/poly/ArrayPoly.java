package hus.com.poly;

public class ArrayPoly extends AbstractPoly {
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        this.coefficients = coefficients;
        this.degree = coefficients.length - 1;
    }

    @Override
    public int coefficient(int i) {
        return coefficients[i];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(differentiate());
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = degree; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
        return result;
    }
}

