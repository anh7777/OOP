public class FlightCrewNotifier implements FlightStatusObserver {
    @Override
    public void update(Flight flight) {
        // Notify flight crew about flight status change
        System.out.println("Notifying flight crew about flight status change: " + flight.getFlightNumber());
    }
}
