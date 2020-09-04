import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Feet quantity1 = new Feet(1);
        Feet quantity2 = new Feet(1);
        Assert.assertEquals(quantity1, quantity2);
    }
}
