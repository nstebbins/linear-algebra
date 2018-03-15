package util;

import org.junit.Assert;
import org.junit.Test;

public class VectorUtilTest {

    @Test
    public void testDotProduct() {
        double[] vector = new double[]{0, 2};
        double[] vector2 = new double[]{1, -1};
        Assert.assertEquals(VectorUtil.dotProduct(vector, vector2), -2, 0.01);
    }
}
