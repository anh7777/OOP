import java.util.ArrayList;
import java.util.List;

public class SeatGroup extends SeatComponent {
    private List<SeatComponent> seatComponents = new ArrayList<>();

    @Override
    public void add(SeatComponent seatComponent) {
        seatComponents.add(seatComponent);
    }

    @Override
    public void remove(SeatComponent seatComponent) {
        seatComponents.remove(seatComponent);
    }

    @Override
    public List<SeatComponent> getSeats() {
        return seatComponents;
    }

    @Override
    public void displaySeatInfo() {
        for (SeatComponent seatComponent : seatComponents) {
            seatComponent.displaySeatInfo();
        }
    }
}
