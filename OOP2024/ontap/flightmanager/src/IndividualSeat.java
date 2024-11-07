public class IndividualSeat extends SeatComponent {
    private Seat seat;

    public IndividualSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public void displaySeatInfo() {
        System.out.println("Seat Number: " + seat.getSeatNumber() + ", Class: " + seat.getClassType() + ", Available: " + seat.isAvailability());
    }
}
