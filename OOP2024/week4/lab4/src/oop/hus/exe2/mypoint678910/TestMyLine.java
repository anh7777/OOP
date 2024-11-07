package oop.hus.exe2.mypoint678910;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(1, 2, 3, 4);
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}
