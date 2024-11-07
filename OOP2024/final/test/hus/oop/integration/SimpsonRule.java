package hus.oop.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int n = 1;
        double I_n = integrate(poly, lower, upper, n);
        double I_2n = integrate(poly, lower, upper, 2 * n);
        while (Math.abs(I_2n - I_n) / 3 >= precision && n < maxIterations) {
            n *= 2;
            I_n = I_2n;
            I_2n = integrate(poly, lower, upper, 2 * n);
        }
        return I_2n;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double h = (upper - lower) / numOfSubIntervals;
        double result = h * (poly.evaluate(lower) + poly.evaluate(upper)) / 3;
        for (int i = 1; i < numOfSubIntervals; i+=2) {
            double x0 = lower + i * h;
            double x1 = lower + (i + 1) * h;
            result += 4 * poly.evaluate((x0 + x1) / 2) * h / 3;
            result += 2 * poly.evaluate(x1) * h / 3;
        }
        return result;
    }
}