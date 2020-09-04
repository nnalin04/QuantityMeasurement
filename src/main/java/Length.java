import java.util.Objects;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    private final Unit unit;

    enum Unit{
        FT, IN;
    }

    private final double value;

    public Length(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit)) {
            return Double.compare(this.value, that.value) == 0;
        } else{
            if (this.unit.equals(Unit.FT) && that.unit.equals(Unit.IN)) {
                return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
            }else if (that.unit.equals(Unit.FT) && this.unit.equals(Unit.IN)){
                return Double.compare(that.value * FEET_TO_INCH, this.value) == 0;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
