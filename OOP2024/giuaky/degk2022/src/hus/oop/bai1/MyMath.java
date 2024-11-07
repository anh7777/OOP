package hus.oop.bai1;

import java.math.BigDecimal;

public class MyMath {
    MyMath(){

    }
    public static double cos(double a){
        return Math.cos(a);
    }
    public static String decimalTo(String number, int inRadix) {
        return decimalTo(String.valueOf(new BigDecimal(number)), inRadix);
    }

    public static double exp(double a){
        return Math.exp(a);
    }
    public static void main(String[] args) {

    }

    public static String toDecimal(double number, int inRadix) {
        return null;
    }

    public static String toRadians(double number, int inRadix, int outRadix) {
        return null;
    }
}
