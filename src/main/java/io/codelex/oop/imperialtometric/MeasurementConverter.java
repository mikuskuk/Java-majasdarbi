package io.codelex.oop.imperialtometric;

public class MeasurementConverter {
    public double convert(double value, ConversionType conversionType) {
        return conversionType.convert(value);
    }
}
