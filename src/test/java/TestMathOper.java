import MathOperSum.MathOperSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOper {

    MathOperSum mathOperSum = new MathOperSum();

    @Test
    public void chekOperSum2Equals() {
        Assert.assertEquals(mathOperSum.doItSum(2, 3), 5);
        Assert.assertEquals(mathOperSum.doItSum(3, 4), 7);
    }

    @Test
    public void chekOperSum2True() {
        Assert.assertEquals(mathOperSum.doItSum(2, 3), 5);
    }

    @Test
    public void chekOperSum2False() {
        Assert.assertNotEquals(mathOperSum.doItSum(2, 3), 6);
    }

    @Test
    public void chekOperSum3Equals() {
        Assert.assertEquals(mathOperSum.doItSum(2, 3, 4), 9);
        Assert.assertEquals(mathOperSum.doItSum(3, 4, 1), 8);
    }

    @Test
    public void chekOperSum3True() {
        Assert.assertEquals(mathOperSum.doItSum(2, 3, 4), 9);
    }

    @Test
    public void chekOperSum3False() {
        Assert.assertNotEquals(mathOperSum.doItSum(2, 3, 4), 6);
    }
}

