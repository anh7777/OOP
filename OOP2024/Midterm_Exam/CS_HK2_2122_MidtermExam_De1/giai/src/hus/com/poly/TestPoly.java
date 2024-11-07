package hus.com.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestPoly {
    public static void main(String[] args) {
        List<Poly> polyList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int degree = random.nextInt(5) + 1;
            int[] coeffs = random.ints(degree + 1, 1, 10).toArray();
            polyList.add(new ArrayPoly(coeffs));
        }

        for (int i = 0; i < 5; i++) {
            int degree = random.nextInt(5) + 1;
            List<Integer> coeffs = random.ints(degree + 1, 1, 10).boxed().toList();
            polyList.add(new ListPoly(coeffs));
        }

        for (Poly poly : polyList) {
            Poly derivative = poly.derivative();
            double valueAtX = poly.evaluate(3); // chọn giá trị x là 3
            System.out.println("Poly: " + poly);
            System.out.println("Derivative: " + derivative);
            System.out.println("Value at x = 3: " + valueAtX);
            System.out.println("Type: " + (poly instanceof ArrayPoly ? "Array Poly" : "List Poly"));
            System.out.println();
        }
    }
}

