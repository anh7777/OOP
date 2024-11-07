import java.util.Scanner;
import java.util.Random;;

public class WordGuess {

    private static final String[] words = {"testing", "hello", "world", "template", "java"};

    private static String secretWord;

    private static boolean[] secretWordMatches;

    public static void main(String[] args) {
        setSecretWord();
        runGame();
    }

    private static void setSecretWord() {
        Random rand = new Random();
        secretWord = words[rand.nextInt(words.length - 1)];
    }

    public static String getTrialWordWithMatches() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append((secretWordMatches[i] ? secretWord.charAt(i) : '_'));
        }
        return str.toString();
    }

    public static void checkTrialWord(char ch) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }
    }

    public static void runGame() {
        Scanner in = new Scanner(System.in);
        secretWordMatches = new boolean[secretWord.length()];
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (in.hasNext()) ? in.next() : "";

            trials++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches();
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);

            }

            if (trialWord.equals(secretWord)) {
                System.out.printf("Key in one character or your guess word: %s \n", secretWord);
                System.out.println("Congratulation!");
                break;
            }
        }
        in.close();
        System.out.printf("You got in %d trials\n", trials);
    }

    private String getSecretWord() {
        return secretWord;
    }

    private static void setSecretWord(String word) {
        secretWord = word;
    }
}