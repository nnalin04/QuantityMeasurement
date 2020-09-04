import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Feet quantity1 = new Feet(0.0);
        Feet quantity2 = new Feet(0.0);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenSimilarObject_WhenCompared_ShouldReturnEqual() {
        Feet quantity1 = new Feet(1.0);
        Feet quantity2 = quantity1;
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenNonSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Feet quantity1 = new Feet(0.0);
        Feet quantity2 = new Feet(1.0);
        Assert.assertNotEquals(quantity1, quantity2);
    }

    @Test
    public void givenNullMeasurement_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            Feet quantity1 = new Feet(null);
            Feet quantity2 = new Feet(null);
            Assert.assertNotEquals(quantity1, quantity2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
