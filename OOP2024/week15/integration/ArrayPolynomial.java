package hus.oop.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        this.coefficients = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (size >= coefficients.length) {
            enlarge();
        }
        coefficients[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (size >= coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.append(coefficients[i] * i);
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double sum = 0;
            if (i < this.size) {
                sum += this.coefficients[i];
            }
            if (i < another.size) {
                sum += another.coefficients[i];
            }
            result.append(sum);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double diff = 0;
            if (i < this.size) {
                diff += this.coefficients[i];
            }
            if (i < another.size) {
                diff -= another.coefficients[i];
            }
            result.append(diff);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                int newDegree = i + j;
                double newCoefficient = this.coefficients[i] * another.coefficients[j];
                if (newDegree < result.size) {
                    result.coefficients[newDegree] += newCoefficient;
                } else {
                    while (newDegree > result.size - 1) {
                        result.append(0);
                    }
                    result.coefficients[newDegree] = newCoefficient;
                }
            }
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        int newCapacity = coefficients.length * 2;
        double[] newCoefficients = new double[newCapacity];
        System.arraycopy(coefficients, 0, newCoefficients, 0, coefficients.length);
        coefficients = newCoefficients;
    }
}
