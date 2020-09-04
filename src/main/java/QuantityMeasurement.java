public class QuantityMeasurement {

    private final double value;
    private final Unit unit;

    public QuantityMeasurement(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(QuantityMeasurement that) {
        if(this.unit.getClass() != that.unit.getClass()){
            return false;
        }
        if (this.unit.equals(that.unit)){
            return this.equals(that);
        }
        return Double.compare(this.unit.convertToBaseUnit(this.value),
                              that.unit.convertToBaseUnit(that.value)) == 0;
    }

    public double addQuantity(QuantityMeasurement that){
        if(this.unit.getClass() != that.unit.getClass()
            || !this.unit.supportAddition() || !that.unit.supportAddition()){
            return 0.0;
        }
        return this.unit.convertToBaseUnit(this.value) +
                that.unit.convertToBaseUnit(that.value);
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
