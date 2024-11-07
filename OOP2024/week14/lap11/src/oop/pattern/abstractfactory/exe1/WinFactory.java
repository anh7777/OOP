package oop.pattern.abstractfactory.exe1;

public class WinFactory implements GUIFactory{
    public Button createButton() {
        return new WinButton();
    }

    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
