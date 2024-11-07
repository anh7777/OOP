package task1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: " +
                Weekday.SATURDAY.isHoliday());
        System.out.println("Firday is weekday: " +
                Weekday.FRIDAY.isWeekDay());
        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
    }
}
