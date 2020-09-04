public enum Length {

    FT(12.0), IN(1.0), YD(36.0), CM(2.0/5.0);

    private final double baseUnitConversion;

    Length(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double convertToBaseUnit(double value) {
        return value * baseUnitConversion;
    }
}
