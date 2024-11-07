package strategy.pseudocode;

// Lớp chứa phương thức main để thực thi chương trình
public class ExampleApplication {
    public static void main(String[] args) {
        // Tạo đối tượng Context
        Context context = new Context();

        // Đọc hai số từ người dùng
        int firstNumber = 10;
        int secondNumber = 5;

        // Đọc hành động mong muốn từ người dùng
        String action = "addition"; // Đây là một ví dụ, bạn có thể nhập từ bàn phím

        // Khách hàng chọn một Concrete Strategy và chuyển nó cho Context.
        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        // Thực thi chiến lược được chọn và in kết quả
        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("Result: " + result);
    }
}