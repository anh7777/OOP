package oop.pattern.factorymethod.exe1;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("WindowsButton render");
    }

    public void onClick() {
        System.out.println("WindowsButton onClick");
    }
}
