package oop.pattern.abstractfactory.exe2;

public class Test {
    public static void main(String[] args) {
        ElectronicDeviceFactory appleFactory = new AppleFactory();

        Smartphone applePhone = appleFactory.createSmartphone();
        Laptop appleLaptop = appleFactory.createLaptop();

        applePhone.displayInfo();
        appleLaptop.displayInfo();

        ElectronicDeviceFactory samsungFactory = new SamsungFactory();

        Smartphone samsungPhone = samsungFactory.createSmartphone();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        samsungPhone.displayInfo();
        samsungLaptop.displayInfo();
    }
}
