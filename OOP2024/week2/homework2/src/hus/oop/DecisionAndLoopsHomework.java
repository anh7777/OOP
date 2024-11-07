package hus.oop;

import java.util.*;

public class DecisionAndLoopsHomework {
    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }

    //1.1 Number Guess
    public static void guessNumber() {
        Scanner in = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, in);
    }

    public static void guessNumber(int number, Scanner in) {
        System.out.println("Key in your guess: ");
        int trials = 0;
        while (true) {
            int trialNumber = (in.hasNextInt()) ? in.nextInt() : -1;

            trials++;
            if (number == trialNumber) {
                System.out.printf("You got it in %d trials!\n\n", trials);
                break;
            } else if (number > trialNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
        }
    }


    //1.2 Word Guess
    private static void guessWord() {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String[] words = {"testing", "hello", "world", "template", "java"};
        String guessedString = words[rand.nextInt(words.length)];
        guessWord(guessedString, in);
    }

    public static void guessWord(String guessedString, Scanner in) {
        boolean[] secretWordMatches = new boolean[guessedString.length()];
        int trials = 0;

        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = in.nextLine();
            trials++;

            if (trialWord.isEmpty()) {
                continue;
            }

            if (trialWord.length() == 1) {
                char ch = trialWord.charAt(0);
                if (!Character.isLetter(ch)) {
                    System.out.println("Please enter a valid character.");
                    continue;
                }

                for (int i = 0; i < guessedString.length(); i++) {
                    char chInGuessedString = guessedString.charAt(i);
                    if (ch == chInGuessedString) {
                        secretWordMatches[i] = true;
                    }
                }

                StringBuilder str = new StringBuilder();
                for (int i = 0; i < guessedString.length(); i++) {
                    str.append(secretWordMatches[i] ? guessedString.charAt(i) : '_');
                }
                System.out.printf("Trial %d: %s\n", trials, str);

            }

            if (trialWord.equals(guessedString)) {
                System.out.println("Congratulations!");
                break;
            }
        }
        System.out.printf("You got it in %d trials\n", trials);
    }

}
