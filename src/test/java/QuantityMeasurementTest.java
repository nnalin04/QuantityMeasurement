import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FT, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSimilarObject_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, 1.0);
        QuantityMeasurement feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNonSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FT, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoDifferentType_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurement_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, null);
            QuantityMeasurement feet2 = new QuantityMeasurement(Length.FT, null);
            Assert.assertNotEquals(feet1, feet2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.IN, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSimilarInchObject_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, 0.0);
        QuantityMeasurement inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNonSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.IN, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenTwoDifferentTypeObject_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurementInInch_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, null);
            QuantityMeasurement inch2 = new QuantityMeasurement(Length.IN, null);
            Assert.assertNotEquals(inch1, inch2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1feet_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FT, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.IN, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1feet_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.IN, 12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FT, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenSimilarMeasurementInYard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YD, 1.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3feetAnd1yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1feetAnd1yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FT, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1inchAnd1yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.IN, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given36inchAnd1yard_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1yardAnd36inch_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YD, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2inchAnd5cm_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.IN, 2.0);
        QuantityMeasurement cm = new QuantityMeasurement(Length.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }
}
