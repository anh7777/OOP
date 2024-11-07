package strategy.pseudocode;

// Context định nghĩa giao diện quan tâm cho khách hàng.
class Context {
    private Strategy strategy;

    // Thường thì Context chấp nhận một Strategy thông qua constructor
    // và cung cấp một setter để Strategy có thể được thay đổi tại runtime.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Context chuyển giao một số công việc cho đối tượng Strategy thay vì tự implement
    // nhiều phiên bản của thuật toán trên chính nó.
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}