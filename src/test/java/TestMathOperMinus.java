import MathoperMinus.MathOperMinus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperMinus {
    MathOperMinus mathOperMinus = new MathOperMinus();

    @Test
    public void chekOperMinus2_1_Equals (){
        Assert.assertEquals(mathOperMinus.doItMinus(8,3),5);
    }
    @Test
    public void chekOperMinus2_2_Equals () {
        Assert.assertEquals(mathOperMinus.doItMinus(4, 3), 1);
    }
    @Test
    public void chekOperMinus2_1_True (){
        Assert.assertTrue(mathOperMinus.doItMinus(36,3)==33);
    }
    @Test
    public void chekOperMinus2_2_True (){
        Assert.assertTrue(mathOperMinus.doItMinus(24,4)==20);
    }
    @Test
    public void chekOperMinus2_1_False (){
        Assert.assertFalse(mathOperMinus.doItMinus(6,3)==4);
    }
    @Test
    public void chekOperMinus2_2_False (){
        Assert.assertFalse(mathOperMinus.doItMinus(9,3)==5);
    }
    @Test
    public void chekOperMinus3_1_Equals (){
        Assert.assertEquals(mathOperMinus.doItSum(8,3,2),3);
    }
    @Test
    public void chekOperMinus3_2_Equals (){
        Assert.assertEquals(mathOperMinus.doItSum(12,3,4),5);
    }
    @Test
    public void chekOperMinus3_1_True (){
        Assert.assertTrue(mathOperMinus.doItSum(36,3,30)==3);
    }
    @Test
    public void chekOperMinus3_2_True (){
        Assert.assertTrue(mathOperMinus.doItSum(25,5,20)==0);
    }
    @Test
    public void chekOperMinus3_1_False (){
        Assert.assertFalse(mathOperMinus.doItSum(6,3,2)==4);
    }
    @Test
    public void chekOperMinus3_2_False (){
        Assert.assertFalse(mathOperMinus.doItSum(9,5,1)==2);
    }

}
