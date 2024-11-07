package oop.pattern.abstractfactory.exe2;

public class AppleFactory implements ElectronicDeviceFactory {
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
