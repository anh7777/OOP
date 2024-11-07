package hus.com.fraction;

public abstract class Number {
    private final long serialVersionUID;
    public Number() {
        this.serialVersionUID = System.currentTimeMillis();
    }

    public Number(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public long getSerialNumber() {
        return serialVersionUID;
    }

    public byte byteValue() {
        return (byte) serialVersionUID;
    }

    public double doubleValue() {
        return (double) serialVersionUID;
    }
    public float floatValue() {
        return (float) serialVersionUID;
    }
    public int intValue() {
        return (int) serialVersionUID;
    }
    public long longValue() {
        return (long) serialVersionUID;
    }
    public short shortValue() {
        return (short) serialVersionUID;
    }
}
