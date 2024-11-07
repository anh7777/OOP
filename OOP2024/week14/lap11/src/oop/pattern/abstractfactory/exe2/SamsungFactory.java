package oop.pattern.abstractfactory.exe2;

public class SamsungFactory implements ElectronicDeviceFactory {
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
