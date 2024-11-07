package oop.pattern.factorymethod.exe1;

public class WebDialog extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}
