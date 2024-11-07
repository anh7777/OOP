//package oop.pattern.observer.pseudocode;
//
//import java.io.File;
//
//class LoggingListener implements EventListener {
//    private final File log;
//    private final String message;
//
//    LoggingListener(String logFilename, String message) {
//        this.log = new File(logFilename);
//        this.message = message;
//    }
//
//    @Override
//    public void update(String fileName) {
//        log.write(message.replace("%s", fileName));
//    }
//}