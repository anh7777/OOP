package oop.hus.lab5.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12)
            return false;

        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year))
            maxDay++;

        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int century = year / 100;
        year %= 100;
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + year + (year / 4) + (century / 4) - 2 * century) % 7;
        return (dayOfWeek + 7) % 7;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        day++;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year))
            maxDay++;

        if (day > maxDay) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (year > 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day == 0) {
            previousMonth();
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year))
                day++;
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month == 0) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (year < 1) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
}
