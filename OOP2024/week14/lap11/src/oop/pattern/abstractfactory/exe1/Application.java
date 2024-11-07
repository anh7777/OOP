package oop.pattern.abstractfactory.exe1;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
