import java.util.List;

public abstract class SeatComponent {
    public void add(SeatComponent seatComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SeatComponent seatComponent) {
        throw new UnsupportedOperationException();
    }

    public List<SeatComponent> getSeats() {
        throw new UnsupportedOperationException();
    }

    public abstract void displaySeatInfo();
}
