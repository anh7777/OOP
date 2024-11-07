package oop.pattern.abstractfactory.exe1;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        Configuration config = readApplicationConfigFile();
        GUIFactory factory;
        if (config.OS.equals("Windows")) {
            factory = new WinFactory();
        } else if (config.OS.equals("Mac")) {
            factory = new MacFactory();
        } else {
            try {
                throw new Exception("Error! Unknown operating system.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

    private static Configuration readApplicationConfigFile() {
        return new Configuration("Windows");
    }

}
