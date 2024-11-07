package oop.pattern.abstractfactory.exe1;

public class WinCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }

    public void render() {
        paint();
    }
}
