package task3;

enum TemperatureConverter {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32f) * 5 / 9 + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273.15f) * 9 / 5 + 32;
        }
    });
    private char input;
    private char output;
    private Converter converter;
    TemperatureConverter(char input, char output, Converter
            converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }
    public static float convertTemperature(char input, char
            output, float temp) {
        for (TemperatureConverter temperatureConverter : values())
        {
            if (temperatureConverter.input == input &&
                    temperatureConverter.output == output) {
                return
                        temperatureConverter.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }
}