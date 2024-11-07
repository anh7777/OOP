package oop.pattern.decorator.exe3;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {
        System.out.println("Writing data to file: " + data);
    }

    public String readData() {
        return "Reading data from file.";
    }
}
