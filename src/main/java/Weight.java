public enum Weight implements Unit{

    GM(1.0/1000.0), KG(1.0), TON(1000.0);

    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double convertToBaseUnit(double value) {
        return value * baseUnitConversion;
    }
}
