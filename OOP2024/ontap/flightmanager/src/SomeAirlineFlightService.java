public class SomeAirlineFlightService {
    public SomeAirlineFlight getFlightDetails(String flightNumber) {
        // fetch flight details from SomeAirline's API
        return new SomeAirlineFlight(flightNumber, "NYC", "LAX", "2024-06-01 08:00", "2024-06-01 11:00", "Boeing 777");
    }
}
