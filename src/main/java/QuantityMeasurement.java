public class QuantityMeasurement {

    private final double value;
    private final Length unit;

    public QuantityMeasurement(Length unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.equals(that.unit)) {
            return Double.compare(this.value, that.value) == 0;
        } else{
            return Length.compare(this.value, this.unit, that.value, that.unit);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }
}
