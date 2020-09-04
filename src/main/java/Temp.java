import java.util.function.Function;

public enum Temp implements Unit{
    C(true), F(false);

    final Function<Double, Double> degFToC = (Double decF) -> (decF -32)*5/9;
    final Function<Double, Double> degCToC = (Double decC) -> decC;

    final Function<Double, Double> baseUnitConversion;

    Temp(boolean isFahrenheit) {
        if (isFahrenheit) {
            this.baseUnitConversion = degFToC;
        }
        else {
            this.baseUnitConversion = degFToC;
        }
    }

    public double convertToBaseUnit(double value) {
        return baseUnitConversion.apply(value);
    }

    public boolean supportAddition(){
        return false;
    }
}
