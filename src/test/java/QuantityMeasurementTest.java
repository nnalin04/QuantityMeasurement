import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSimilarObject_WhenCompared_ShouldReturnEqual() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNonSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoDifferentType_WhenCompared_ShouldReturnEqual() {
        Feet feet = new Feet(0.0);
        Inch inch = new Inch(0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurement_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            Feet feet1 = new Feet(null);
            Feet feet2 = new Feet(null);
            Assert.assertNotEquals(feet1, feet2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSimilarInchObject_WhenCompared_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNonSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenTwoDifferentTypeObject_WhenCompared_ShouldReturnEqual() {
        Feet feet = new Feet(0.0);
        Inch inch = new Inch(0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurementInInch_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            Inch inch1 = new Inch(null);
            Inch inch2 = new Inch(null);
            Assert.assertNotEquals(inch1, inch2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
