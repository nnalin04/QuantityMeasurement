public class Length {

    private final UnitLength unit;

    private final double value;

    public Length(UnitLength unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit)) {
            return Double.compare(this.value, that.value) == 0;
        } else{
            return UnitLength.compare(this.value, this.unit, that.value, that.unit);
        }
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
