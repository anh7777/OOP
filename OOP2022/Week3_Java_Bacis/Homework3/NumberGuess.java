import java.util.Scanner;

public class NumberGuess {
    static final int SECRET_NUMBER = (int) (Math.random() * 100);

    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner in = new Scanner(System.in);

        System.out.println("Key in your guess:");
        int trials = 0;
        while (true) {
            int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;

            trials++;
            if (SECRET_NUMBER == trialNumber) {
                System.out.printf("You got it in %d trials!\n", trials);
                break;
            } else if (SECRET_NUMBER > trialNumber) {
                System.out.println("Try higher");
            } else if (SECRET_NUMBER < trialNumber) {
                System.out.println("Try lower");
            }
        }
        in.close();
    }
}


