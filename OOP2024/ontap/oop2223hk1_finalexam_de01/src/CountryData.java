public class CountryData {
    private String name;
    private int population;
    private double area;
    private double gdp;
    private String region;

    private CountryData(Builder builder) {
        this.name = builder.name;
        this.population = builder.population;
        this.area = builder.area;
        this.gdp = builder.gdp;
        this.region = builder.region;
    }

    public static class Builder {
        private String name;
        private int population;
        private double area;
        private double gdp;
        private String region;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPopulation(int population) {
            this.population = population;
            return this;
        }

        public Builder setArea(double area) {
            this.area = area;
            return this;
        }

        public Builder setGdp(double gdp) {
            this.gdp = gdp;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }

        public CountryData build() {
            return new CountryData(this);
        }
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", region='" + region + '\'' +
                '}';
    }
}
