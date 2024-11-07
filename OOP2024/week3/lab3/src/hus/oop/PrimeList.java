package hus.oop;
import  java.util.*;

public class PrimeList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int num = sc.nextInt();
        int sumOfPrime = 0;
        for (int aPosInt = 1; aPosInt < num; aPosInt++){
            if (isPrime(aPosInt)){
                System.out.println(aPosInt);
                sumOfPrime++;
            }
        }

        System.out.printf("[%d primes found (%.2f%%)]", sumOfPrime, (double)100*sumOfPrime/num);
    }
    public static boolean isPrime(int aPosInt){
        if (aPosInt == 1 || aPosInt == 2 || aPosInt == 3) return true;
        for (int i = 2; i < (int) Math.sqrt(aPosInt) + 1; i++){
            if (aPosInt % i == 0) return false;
        }
        return true;
    }
}
