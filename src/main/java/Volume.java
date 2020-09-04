public enum Volume implements Unit{

    GALLON(3.78), LITTER(1.0), ML(1.0/1000.0);

    private final double baseUnitConversion;

    Volume(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double convertToBaseUnit(double value) {
        return value * baseUnitConversion;
    }
}
