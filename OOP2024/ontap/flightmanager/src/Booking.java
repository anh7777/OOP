public class Booking {
    private String bookingID;
    private Flight flight;
    private Passenger passenger;
    private String seatNumber;
    private String bookingStatus;

    private Booking(BookingBuilder builder) {
        this.bookingID = builder.bookingID;
        this.flight = builder.flight;
        this.passenger = builder.passenger;
        this.seatNumber = builder.seatNumber;
        this.bookingStatus = builder.bookingStatus;
    }

    public static class BookingBuilder {
        private String bookingID;
        private Flight flight;
        private Passenger passenger;
        private String seatNumber;
        private String bookingStatus;

        public BookingBuilder(String bookingID) {
            this.bookingID = bookingID;
        }

        public BookingBuilder flight(Flight flight) {
            this.flight = flight;
            return this;
        }

        public BookingBuilder passenger(Passenger passenger) {
            this.passenger = passenger;
            return this;
        }

        public BookingBuilder seatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public BookingBuilder bookingStatus(String bookingStatus) {
            this.bookingStatus = bookingStatus;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    // Getters

    public String getBookingID() {
        return bookingID;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    // toString method for display purposes

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", seatNumber='" + seatNumber + '\'' +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
