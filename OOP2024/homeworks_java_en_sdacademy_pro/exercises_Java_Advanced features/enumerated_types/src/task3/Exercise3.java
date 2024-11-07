package task3;

public class Exercise3 {
    public static void main(String[] args) {
        float convertedTemp =
                TemperatureConverter.convertTemperature('C', 'K', 34f);
        System.out.println(convertedTemp);
    }
}
