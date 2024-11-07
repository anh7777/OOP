public class LoyaltyProgram {
    private static LoyaltyProgram instance;
    private String programID;
    private String programName;
    private int points;

    private LoyaltyProgram() {
        // private constructor to prevent instantiation
    }

    public static LoyaltyProgram getInstance() {
        if (instance == null) {
            instance = new LoyaltyProgram();
        }
        return instance;
    }

    // Getters and setters

    public static void setInstance(LoyaltyProgram instance) {
        LoyaltyProgram.instance = instance;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "LoyaltyProgram{" +
                "programID='" + programID + '\'' +
                ", programName='" + programName + '\'' +
                ", points=" + points +
                '}';
    }
}
