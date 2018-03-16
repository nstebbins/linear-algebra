package powermethod;

import constants.LinearAlgebraConstants;
import org.junit.Assert;
import org.junit.Test;

public class PowerMethodTest {

    @Test
    public void testPowerMethod() {
        double[][] matrix = new double[][] {{2, -12}, {1, -5}};
        double[] vector = new double[] {1, 1};
        Assert.assertArrayEquals(PowerMethod.powerMethod(matrix, vector), new double[] {0.949, 0.316},
            LinearAlgebraConstants.DOUBLE_DELTA);
    }
}
