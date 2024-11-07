import java.util.ArrayList;
import java.util.List;

public class PassengerManager {
    private List<Passenger> passengers;

    public PassengerManager() {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public Passenger searchPassengerByID(String passengerID) {
        return passengers.stream()
                .filter(passenger -> passenger.getPassengerID().equals(passengerID))
                .findFirst()
                .orElse(null);
    }

    public List<Passenger> getAllPassengers() {
        return passengers;
    }
}
