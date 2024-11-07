package mylist;

import java.util.Comparator;
import java.util.Random;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Fraction> fractions = new MyList<>();
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            int numerator = rand.nextInt(1000) + 1;
            int denominator = rand.nextInt(1000) + 1;
            fractions.add(new Fraction(numerator, denominator));
        }

        System.out.println("Original list of fractions:");
        fractions.print();

        fractions.sort();
        System.out.println("\nFractions sorted by value:");
        fractions.print();

        fractions.sort(new Comparator<Fraction>() {
            @Override
            public int compare(Fraction f1, Fraction f2) {
                return Integer.compare(f1.getDenominator(), f2.getDenominator());
            }
        });
        System.out.println("\nFractions sorted by denominator:");
        fractions.print();

        Fraction secondLargest = fractions.getSecondLargest();
        System.out.println("\nSecond largest fraction: " + secondLargest);
    }
}
