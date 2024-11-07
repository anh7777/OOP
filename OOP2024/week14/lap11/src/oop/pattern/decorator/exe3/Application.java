package oop.pattern.decorator.exe3;

public class Application {
    public void dumbUsageExample() {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salaryRecords");

        source = new CompressionDecorator(source);
        source.writeData("salaryRecords");

        source = new EncryptionDecorator(source);
        source.writeData("salaryRecords");
    }
}
