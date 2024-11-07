package oop.pattern.factorymethod.exe1;

public class Application {
    private Dialog dialog;

    void initialize() throws Exception {
        Config config = readApplicationConfigFile();

        if (config.OS.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.OS.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }

    void main() throws Exception {
        this.initialize();
        dialog.render();
    }

    private Config readApplicationConfigFile() {
        // Read the configuration file.
        return new Config("Windows");
    }

}
