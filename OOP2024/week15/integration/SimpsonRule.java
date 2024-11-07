package hus.oop.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     *
     * @param poly  Đa thức cần tích phân.
     * @param lower Giới hạn dưới của khoảng tích phân.
     * @param upper Giới hạn trên của khoảng tích phân.
     * @return Giá trị xấp xỉ của tích phân.
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        double previousIntegral = 0.0;
        double currentIntegral = calculateIntegral(poly, lower, upper, 2);

        int iterations = 1;
        while (Math.abs(currentIntegral - previousIntegral) / 15 >= precision && iterations <= maxIterations) {
            previousIntegral = currentIntegral;
            currentIntegral = calculateIntegral(poly, lower, upper, iterations *= 2);
        }

        return currentIntegral;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với `numOfSubIntervals` khoảng phân hoạch đều.
     *
     * @param poly               Đa thức cần tích phân.
     * @param lower              Giới hạn dưới của khoảng tích phân.
     * @param upper              Giới hạn trên của khoảng tích phân.
     * @param numOfSubIntervals Số lượng khoảng phân hoạch đều.
     * @return Giá trị xấp xỉ của tích phân.
     */
    private double calculateIntegral(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double step = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i += 2) {
            double x = lower + i * step;
            sum += 4 * poly.evaluate(x);
        }
        for (int i = 2; i < numOfSubIntervals - 1; i += 2) {
            double x = lower + i * step;
            sum += 2 * poly.evaluate(x);
        }

        return sum * step / 3;
    }
}
