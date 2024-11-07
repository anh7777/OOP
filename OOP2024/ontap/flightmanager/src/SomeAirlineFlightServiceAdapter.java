public class SomeAirlineFlightServiceAdapter implements ExternalFlightService {
    private final SomeAirlineFlightService someAirlineFlightService;

    public SomeAirlineFlightServiceAdapter(SomeAirlineFlightService someAirlineFlightService) {
        this.someAirlineFlightService = someAirlineFlightService;
    }

    @Override
    public Flight fetchFlightDetails(String flightNumber) {
        SomeAirlineFlight someAirlineFlight = someAirlineFlightService.getFlightDetails(flightNumber);
        return new Flight(
                someAirlineFlight.getFlightNumber(),
                someAirlineFlight.getDeparture(),
                someAirlineFlight.getDestination(),
                someAirlineFlight.getDepartureTime(),
                someAirlineFlight.getArrivalTime(),
                someAirlineFlight.getAircraftType()
        );
    }
}
