package task5;

class UserParser {
    public User fromCSV(String csvLine) {
        String[] data = csvLine.split(",");
        return new User(data[0], data[1],
                Integer.parseInt(data[2]));
    }
}
