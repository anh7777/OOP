package hus.com.fraction;

import java.util.*;

public class TestFraction {
    public static void main(String[] args) {
        List<Fraction> fractions = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int numerator = random.nextInt(1000) + 1;
            int denominator = random.nextInt(1000) + 1;
            fractions.add(new Fraction(numerator, denominator));
        }

        System.out.println("All fractions:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        fractions.sort(Comparator.comparingDouble(Fraction :: doubleValue));
        System.out.println("\nFractions sorted by value:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        fractions.sort(Comparator.comparingInt(Fraction::getDenominator));
        System.out.println("\nFractions sorted by denominator:");
        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        Fraction secondLargestFraction = findSecondLargestFraction(fractions);
        System.out.println("\nSecond largest fraction by value: " + secondLargestFraction);
    }

    private static Fraction findSecondLargestFraction(List<Fraction> fractions) {
        if (fractions.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two fractions");
        }
        Fraction largest = fractions.get(0);
        Fraction secondLargest = null;
        for (Fraction fraction : fractions) {
            if (fraction.compareTo(largest) > 0) {
                secondLargest = largest;
                largest = fraction;
            } else if (secondLargest == null || fraction.compareTo(secondLargest) > 0) {
                secondLargest = fraction;
            }
        }
        return secondLargest;
    }
}
