package hus.oop;

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inString = sc.nextLine();

        System.out.printf("The equivalent binary for hexadecimaml \"%s\" is: %s", inString, hex2Bin(inString));
        //for (int i = 0; i < inString.length(); i++){
        //System.out.print(Integer.toBinaryString(inString.charAt(i)));
        //System.out.print(" ");
        //}
        sc.close();
    }

    public static String hex2Bin(String s) {
        s.toLowerCase();
        s = s.replaceAll("0", "0000");
        s = s.replaceAll("1", "0001");
        s = s.replaceAll("2", "0010");
        s = s.replaceAll("3", "0011");
        s = s.replaceAll("4", "0100");
        s = s.replaceAll("5", "0101");
        s = s.replaceAll("6", "0110");
        s = s.replaceAll("7", "0111");
        s = s.replaceAll("8", "1000");
        s = s.replaceAll("9", "1001");
        s = s.replaceAll("a", "1010");
        s = s.replaceAll("b", "1011");
        s = s.replaceAll("c", "1100");
        s = s.replaceAll("d", "1101");
        s = s.replaceAll("e", "1110");
        s = s.replaceAll("f", "1111");
        String str = "";
        int i = 0;
        while( i < s.length()){
            str = str + s.substring(i, i + 4) + " ";
            i += 4;
        }
        return str;
    }
}
