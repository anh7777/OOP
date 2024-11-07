import java.util.ArrayList;
import java.util.List;

public class FlightManager {
    private List<Flight> flights;

    public FlightManager() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public Flight searchFlightByNumber(String flightNumber) {
        return flights.stream()
                .filter(flight -> flight.getFlightNumber().equals(flightNumber))
                .findFirst()
                .orElse(null);
    }

    public List<Flight> getAllFlights() {
        return flights;
    }
}
