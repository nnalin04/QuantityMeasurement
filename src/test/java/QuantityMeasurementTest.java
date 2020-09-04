import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FT, 0.0);
        Length feet2 = new Length(Length.Unit.FT, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSimilarObject_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FT, 1.0);
        Length feet2 = feet1;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNonSimilarMeasurement_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FT, 0.0);
        Length feet2 = new Length(Length.Unit.FT, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoDifferentType_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FT, 0.0);
        Length inch = new Length(Length.Unit.IN, 0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurement_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            Length feet1 = new Length(Length.Unit.FT, null);
            Length feet2 = new Length(Length.Unit.FT, null);
            Assert.assertNotEquals(feet1, feet2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.IN, 0.0);
        Length inch2 = new Length(Length.Unit.IN, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSimilarInchObject_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.IN, 0.0);
        Length inch2 = inch1;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenNonSimilarMeasurementInInch_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.IN, 0.0);
        Length inch2 = new Length(Length.Unit.IN, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenTwoDifferentTypeObject_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FT, 0.0);
        Length inch = new Length(Length.Unit.IN, 0.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenNullMeasurementInInch_WhenCompared_ShouldReturnEqual() throws NullPointerException {
        try {
            Length inch1 = new Length(Length.Unit.IN, null);
            Length inch2 = new Length(Length.Unit.IN, null);
            Assert.assertNotEquals(inch1, inch2);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FT, 0.0);
        Length inch = new Length(Length.Unit.IN, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FT, 1.0);
        Length inch = new Length(Length.Unit.IN, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1feet_WhenCompared_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FT, 1.0);
        Length feet2 = new Length(Length.Unit.FT, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.IN, 1.0);
        Length inch2 = new Length(Length.Unit.IN, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1feet_WhenCompared_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.IN, 12.0);
        Length feet1 = new Length(Length.Unit.FT, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }
}
