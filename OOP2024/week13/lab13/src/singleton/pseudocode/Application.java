package singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM table1");
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM table2");
    }
}
