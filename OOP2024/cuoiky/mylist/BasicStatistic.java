package hus.oop.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     * @param data Danh sách dữ liệu.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return Giá trị lớn nhất.
     */
    public double max() {
        if (data.size() == 0) {
            throw new IllegalStateException("Cannot find maximum value in an empty list.");
        }

        double max = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double currentValue = (double) data.get(i);
            if (currentValue > max) {
                max = currentValue;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return Giá trị nhỏ nhất.
     */
    public double min() {
        if (data.size() == 0) {
            throw new IllegalStateException("Cannot find minimum value in an empty list.");
        }

        double min = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            double currentValue = (double) data.get(i);
            if (currentValue < min) {
                min = currentValue;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return Kỳ vọng.
     */
    public double mean() {
        if (data.size() == 0) {
            throw new IllegalStateException("Cannot calculate mean value for an empty list.");
        }

        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return Phương sai.
     */
    public double variance() {
        if (data.size() == 0) {
            throw new IllegalStateException("Cannot calculate variance for an empty list.");
        }

        double mean = mean();
        double sumOfSquaredDifferences = 0;
        for (int i = 0; i < data.size(); i++) {
            double difference = (double) data.get(i) - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        return sumOfSquaredDifferences / data.size();
    }
}
