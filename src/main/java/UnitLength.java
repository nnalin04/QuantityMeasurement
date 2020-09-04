public enum UnitLength {

    FT(12.0), IN(1.0), YAD(36.0);

    private final double baseUnitConversion;

    UnitLength(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(double value1, UnitLength unit1, double value2, UnitLength unit2) {
        return Double.compare(value1 * unit1.baseUnitConversion, value2 * unit2.baseUnitConversion) == 0;
    }
}
