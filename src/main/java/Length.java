public enum Length {

    FT(12.0), IN(1.0), YD(36.0), CM(2.0/5.0);

    private final double baseUnitConversion;

    Length(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(double value1, Length unit1, double value2, Length unit2) {
        return Double.compare(value1 * unit1.baseUnitConversion, value2 * unit2.baseUnitConversion) == 0;
    }
}
