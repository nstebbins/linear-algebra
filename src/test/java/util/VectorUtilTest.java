package util;

import constants.LinearAlgebraConstants;
import org.junit.Assert;
import org.junit.Test;

public class VectorUtilTest {

    @Test
    public void testDotProduct() {
        double[] vector = new double[] {0, 2};
        double[] vector2 = new double[] {1, -1};
        Assert.assertEquals(VectorUtil.dotProduct(vector, vector2), -2, 0.01);
    }

    @Test(expected = AssertionError.class)
    public void testDotProductVectorLengthsNotEqual() {
        double[] vector = new double[] {1};
        double[] vector2 = new double[] {1, -1};
        VectorUtil.dotProduct(vector, vector2);
    }

    @Test
    public void testL2Norm() {
        double[] vector = new double[] {4, 1};
        Assert.assertEquals(VectorUtil.l2Norm(vector), 4.123, LinearAlgebraConstants.DOUBLE_DELTA);
    }

    @Test
    public void testMultiplyVectorByScalar() {
        double[] vector = new double[] {4, 1};
        double scalar = -0.5;
        Assert.assertArrayEquals(VectorUtil.multiplyVectorByScalar(vector, scalar), new double[] {-2, -0.5},
            LinearAlgebraConstants.DOUBLE_DELTA);
    }
}
