package singleton.logger;

public class Logger {
    private static Logger instance;

    // Constructor private để ngăn việc khởi tạo từ bên ngoài
    private Logger() {
        // Code khởi tạo ở đây
    }

    // Phương thức static public để lấy instance của lớp Logger
    public static Logger getInstance() {
        // Khởi tạo lười biếng: Tạo instance chỉ khi cần thiết
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Phương thức public để ghi log
    public void log(String message) {
        // Code ghi log ở đây
        System.out.println("[LOG]: " + message);
    }
}
