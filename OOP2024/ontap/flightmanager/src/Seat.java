public class Seat {
    private String seatNumber;
    private String classType;
    private boolean availability;

    // Constructor, getters, and setters

    public Seat() {
    }

    public Seat(String seatNumber, String classType, boolean availability) {
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.availability = availability;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", classType='" + classType + '\'' +
                ", availability=" + availability +
                '}';
    }
}
