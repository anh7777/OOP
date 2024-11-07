package oop.pattern.decorator.exe3;

public class ApplicationConfigurator {
    public void configurationExample() {
        DataSource source = new FileDataSource("salary.dat");

        if (enabledEncryption)
            source = new EncryptionDecorator(source);

        if (enabledCompression)
            source = new CompressionDecorator(source);

        SalaryManager logger = new SalaryManager(source);
        String salary = logger.load();
        // ...
    }

    private boolean enabledEncryption;
    private boolean enabledCompression;
}
