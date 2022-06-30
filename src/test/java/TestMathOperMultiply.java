import MathOperDivide.MathOperMultiply;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperMultiply {

    MathOperMultiply mathOperDivide = new MathOperMultiply();



    @Test
    public void chekOperMultiply2_1_Equals() {
        Assert.assertEquals(mathOperDivide.doItMultiply(2, 2), 4);
    }

    @Test
    public void chekOperMultiply2_2_Equals() {
        Assert.assertEquals(mathOperDivide.doItMultiply(3, 3), 9);
    }

    @Test
    public void chekOperMultiply2_1_True() {
        Assert.assertTrue(mathOperDivide.doItMultiply(2, 2) == 4);
    }

    @Test
    public void chekOperMultiply2_2_True() {
        Assert.assertTrue(mathOperDivide.doItMultiply(3, 3) == 9);
    }

    @Test
    public void chekOperMultiply2_1_False() {
        Assert.assertFalse(mathOperDivide.doItMultiply(2, 2) == 5);

    }

    @Test
    public void chekOperMultiply2_2_False() {
        Assert.assertFalse(mathOperDivide.doItMultiply(3, 2) == 5);

    }

    @Test
    public void chekOperMultiply3_1_Equals() {
        Assert.assertEquals(mathOperDivide.doItMultiply(2, 2, 2), 8);
    }

    @Test
    public void chekOperMultiply3_2_Equals() {
        Assert.assertEquals(mathOperDivide.doItMultiply(3, 2, 2), 12);
    }

    @Test
    public void chekOperMultiply3_1_True() {
        Assert.assertTrue(mathOperDivide.doItMultiply(2, 2, 3) == 12);
    }

    @Test
    public void chekOperMultiply3_2_True() {
        Assert.assertTrue(mathOperDivide.doItMultiply(5, 5, 3) == 75);
    }

    @Test
    public void chekOperMultiply3_1_False() {
        Assert.assertFalse(mathOperDivide.doItMultiply(2, 2, 3) == 4);
    }

    @Test
    public void chekOperMultiply3_2_False() {
        Assert.assertFalse(mathOperDivide.doItMultiply(3, 2, 3) == 15);
    }
}