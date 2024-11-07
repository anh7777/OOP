package oop.pattern.abstractfactory.exe1;

public class MacButton implements Button {
    public void paint() {
        // Render a button in macOS style.
        System.out.println("Rendering a button in macOS style.");
    }
    public void render() {
        paint();
    }
    public void onClick() {
        System.out.println("Handling click event in macOS style.");
    }
}
