public class Passenger {
    private String passengerID;
    private String name;
    private String passportNumber;
    private String contactInfo;

    public Passenger() {
    }

    public Passenger(String passengerID, String name, String passportNumber, String contactInfo) {
        this.passengerID = passengerID;
        this.name = name;
        this.passportNumber = passportNumber;
        this.contactInfo = contactInfo;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
