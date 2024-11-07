package hus.oop.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        this.coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayPolynomial(double[] coefficents) {
        /* TODO */
        this.coefficents = coefficents;
        size = coefficents.length;
    }


    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] coef = new double[size];
        System.arraycopy(coefficents, 0, coef, 0, size);
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtStart(double coefficient) {
        /* TODO */
        return insertAtPosition(coefficient, 0);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtEnd(double coefficient) {
        /* TODO */
        if (size >= this.coefficents.length) {
            enlarge();
        }
        this.coefficents[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insertAtPosition(double coefficient, int index) {
        /* TODO */
        if (size >= this.coefficents.length) {
            enlarge();
        }
        for (int i = size - 1; i > index ; i--) {
            coefficents[i + 1] = coefficents[i];
        }
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return size - 1;

    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double p = 0;
        for (int i = size - 1; i >= 0; i--) {
            p = coefficents[i] + (x * p);
        }
        return p;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public ArrayPolynomial derivative() {
        /* TODO */
        double[] newCoefficients = new double[size - 1];
        newCoefficients = differentiate();
        return new ArrayPolynomial(newCoefficients);
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức mới là tổng hai đa thức.
     */
    public ArrayPolynomial plus(Polynomial another) {
        /* TODO */
        ArrayPolynomial result = new ArrayPolynomial();
        int maxLength = Math.max(coefficents.length, another.coefficients().length);
        for (int i = 0; i < maxLength; i++) {
            if (i < coefficents.length && i < another.coefficients().length) {
                result.insertAtPosition(coefficents[i] + another.coefficient(i), i);
            } else if (i >= coefficents.length && i < another.coefficients().length) {
                result.insertAtPosition(another.coefficient(i), i);
            }
        }
        return result;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plusTo(Polynomial another) {
        /* TODO */
        while (coefficents.length < another.coefficients().length) {
            enlarge();
        }
        size = Math.max(size, another.coefficients().length);
        for (int i = 0; i < size; i++) {
            coefficents[i] += another.coefficient(i);
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là hiệu hai đa thức.
     */
    public ArrayPolynomial minus(Polynomial another) {
        /* TODO */
        ArrayPolynomial result = new ArrayPolynomial();
        int maxLength = Math.max(coefficents.length, another.coefficients().length);
        for (int i = 0; i < maxLength; i++) {
            if (i < coefficents.length && i < another.coefficients().length) {
                result.insertAtPosition(coefficents[i] - another.coefficient(i), i);
            } else if (i >= coefficents.length && i < another.coefficients().length) {
                result.insertAtPosition(-another.coefficient(i), i);
            }
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại cho đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minusFrom(Polynomial another) {
        /* TODO */
        while (coefficents.length < another.coefficients().length) {
            enlarge();
        }
        size = Math.max(size, another.coefficients().length);
        for (int i = 0; i < size; i++) {
            coefficents[i] -= another.coefficient(i);
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức mới là đa thức nhân của hai đa thức.
     */
    public ArrayPolynomial multiply(Polynomial another) {
        /* TODO */
        ArrayPolynomial result = new ArrayPolynomial();
        while (coefficents.length <= size + another.coefficients().length - 1) {
            enlarge();
        }
        double[] prod = new double[size + another.coefficients().length - 1];

        for (int i = 0; i < another.coefficients().length; i++) {
            for (int j = 0; j < this.size; j++) {
                prod[i + j] += coefficents[i] * another.coefficients()[j];
            }
        }
        size = size + another.coefficients().length - 2;
        System.arraycopy(prod, 0, result, 0, size);
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiplyBy(Polynomial another) {
        /* TODO */
        while (coefficents.length <= size + another.coefficients().length - 1) {
            enlarge();
        }
        double[] prod = new double[size + another.coefficients().length - 1];

        for (int i = 0; i < another.coefficients().length; i++) {
            for (int j = 0; j < this.size; j++) {
                prod[i + j] += coefficents[i] * another.coefficients()[j];
            }
        }
        size = size + another.coefficients().length - 2;
        System.arraycopy(prod, 0, coefficents, 0, size);
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] newCoef = new double[size * 2];
        System.arraycopy(coefficents, 0, newCoef, 0, size);
        coefficents = newCoef;
    }
}
