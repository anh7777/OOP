package com.bridge.program;

public class Laptop extends Computer {
    public Laptop(OperatingSystem logic) {
        super(logic);
    }


    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
