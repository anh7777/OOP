package singleton.logger;

public class LogTest {
    public static void main(String[] args) {
        // Lấy instance của lớp Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Cả logger1 và logger2 đều trỏ đến cùng một instance
        System.out.println("logger1 == logger2: " + (logger1 == logger2)); // Kết quả: true

        // Ghi log bằng logger1 và logger2
        logger1.log("This is a log message.");
        logger2.log("Another log message.");
    }
}
