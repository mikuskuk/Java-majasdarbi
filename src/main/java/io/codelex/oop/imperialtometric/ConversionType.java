package io.codelex.oop.imperialtometric;

public enum ConversionType {
    METERS_TO_YARDS {
        @Override
        public double convert(double value) {
            return value * 1.09361;
        }
    },
    YARDS_TO_METERS {
        @Override
        public double convert(double value) {
            return value / 1.09361;
        }
    },
    CENTIMETERS_TO_INCHES {
        @Override
        public double convert(double value) {
            return value / 2.54;
        }
    },
    INCHES_TO_CENTIMETERS {
        @Override
        public double convert(double value) {
            return value * 2.54;
        }
    },
    KILOMETERS_TO_MILES {
        @Override
        public double convert(double value) {
            return value / 1.60934;
        }
    },
    MILES_TO_KILOMETERS {
        @Override
        public double convert(double value) {
            return value * 1.60934;
        }
    };

    public abstract double convert(double value);
}
