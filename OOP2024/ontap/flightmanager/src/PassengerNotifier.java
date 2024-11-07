public class PassengerNotifier implements FlightStatusObserver {
    @Override
    public void update(Flight flight) {
        // Notify passengers about flight status change
        System.out.println("Notifying passengers about flight status change: " + flight.getFlightNumber());
    }
}
