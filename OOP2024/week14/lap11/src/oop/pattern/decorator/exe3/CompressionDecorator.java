package oop.pattern.decorator.exe3;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        // 1. Compress passed data.
        // 2. Pass compressed data to the wrappee's writeData method.
        System.out.println("Compressing data: " + data);
        wrappee.writeData(data);
    }

    public String readData() {
        // 1. Get data from the wrappee's readData method.
        // 2. Try to decompress it if it's compressed.
        // 3. Return the result.
        return "Decompressing data: " + wrappee.readData();
    }
}
