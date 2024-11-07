package oop.pattern.decorator.exe3;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        // 1. Encrypt passed data.
        // 2. Pass encrypted data to the wrappee's writeData method.
        System.out.println("Encrypting data: " + data);
        wrappee.writeData(data);
    }

    public String readData() {
        // 1. Get data from the wrappee's readData method.
        // 2. Try to decrypt it if it's encrypted.
        // 3. Return the result.
        return "Decrypting data: " + wrappee.readData();
    }
}
