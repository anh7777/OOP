package oop.pattern.observer.pseudocode;

import java.io.File;

public class Editor {
    public final EventManager events;
    private final File file;

    public Editor() {
        this.events = new EventManager();
        this.file = null; // Initialize file as needed
    }

    void openFile(String path) {
        events.notify("open", file != null ? file.getName() : "");
    }

    void saveFile() {
        events.notify("save", file != null ? file.getName() : "");
    }
}
