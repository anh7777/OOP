import java.util.Date;

public class Cancellation {
    private String cancellationID;
    private Booking booking;
    private Date cancellationDate;
    private double refundAmount;

    public Cancellation(String cancellationID, Booking booking, Date cancellationDate, double refundAmount) {
        this.cancellationID = cancellationID;
        this.booking = booking;
        this.cancellationDate = cancellationDate;
        this.refundAmount = refundAmount;
    }

    // Getters and setters

    public String getCancellationID() {
        return cancellationID;
    }

    public void setCancellationID(String cancellationID) {
        this.cancellationID = cancellationID;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public String toString() {
        return "Cancellation{" +
                "cancellationID='" + cancellationID + '\'' +
                ", booking=" + booking +
                ", cancellationDate=" + cancellationDate +
                ", refundAmount=" + refundAmount +
                '}';
    }
}
