package oop.pattern.factorymethod.exe1;

public class WindowsDialog extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
