package corp.siendev.com.creational.builder;

public class SaladBuilder {
    private final String name;
    private final String dressing;
    private final String meat;
    private final String condiments;
    private final String otherIngredients;

    private SaladBuilder(Builder builder) {
        this.name = builder.name;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
        this.condiments = builder.condiments;
        this.otherIngredients = builder.otherIngredients;
    }

    public String getName() {
        return name;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getOtherIngredients() {
        return otherIngredients;
    }

    public static class Builder {
        private String name;
        private String dressing;
        private String meat;
        private String condiments;
        private String otherIngredients;

        public Builder() {

        }

        public SaladBuilder build() {
            return new SaladBuilder(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder otherIngredients(String otherIngredients) {
            this.otherIngredients = otherIngredients;
            return this;
        }
    }
}
