public class PrintStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i % 2 == 0 ? " " : "∗ ");
            }
            System.out.println();
        }
    }
}
