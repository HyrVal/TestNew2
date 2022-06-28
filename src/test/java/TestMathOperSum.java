import MathOperSum.MathOperSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperSum {

        MathOperSum mathOperSum = new MathOperSum();
        @Test
        public void chekOperSum2_1_Equals (){
            Assert.assertEquals(mathOperSum.doItSum(2,3) , 5);
        }
      @Test
        public void chekOperSum2_2_Equals (){
            Assert.assertEquals(mathOperSum.doItSum(3,4) , 7);
        }
        @Test
        public void chekOperSum2_1_True(){
            Assert.assertEquals(mathOperSum.doItSum(2, 3), 5);
        }
    @Test
    public void chekOperSum2_2_True(){
        Assert.assertEquals(mathOperSum.doItSum(4, 3), 7);
    }
        @Test
        public void chekOperSum2_1_False(){
            Assert.assertFalse(mathOperSum.doItSum(2, 2)== 5);
        }
    @Test
    public void chekOperSum2_2_False(){
        Assert.assertNotEquals(mathOperSum.doItSum(2, 3), 4);
    }
    @Test
    public void chekOperSum3_1_Equals (){
        Assert.assertEquals(mathOperSum.doItSum(2,3, 4) , 9);
    }
    @Test
    public void chekOperSum3_2_Equals (){
        Assert.assertEquals(mathOperSum.doItSum(3,4, 1) , 8);
    }
    @Test
    public void chekOperSum3_1_True(){
            Assert.assertTrue(mathOperSum.doItSum(2, 3,4)== 9);
    }
  @Test
    public void chekOperSum3_2_True(){
            Assert.assertTrue(mathOperSum.doItSum(2, 5,4)== 11);
    }

    @Test
    public void chekOperSum3_1_False() {
        Assert.assertNotEquals(mathOperSum.doItSum(2, 3, 4), 6);
    }
    @Test
    public void chekOperSum3_2_False(){
        Assert.assertNotEquals(mathOperSum.doItSum(5, 6,7), 6);
    }

}

