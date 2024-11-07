package singleton.pseudocode;

public class Database {
    private static Database instance;

    private Database() {
    }
    public static synchronized Database getInstance() {
        if (Database.instance == null) {
            synchronized (Database.class) {
                if (Database.instance == null) {
                    Database.instance = new Database();
                }
            }
        }
        return Database.instance;
    }

    public void query(String sql) {
        System.out.println("Executing query" + sql);
    }
}
