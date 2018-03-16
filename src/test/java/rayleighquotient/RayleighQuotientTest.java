package rayleighquotient;

import constants.LinearAlgebraConstants;
import org.junit.Assert;
import org.junit.Test;

public class RayleighQuotientTest {

    @Test
    public void testRayleighQuotient() {
        double[][] matrix = new double[][] {{2, -12}, {1, -5}};
        double[] vector = new double[] {3, 1};
        Assert.assertEquals(RayleighQuotient.rayleighQuotient(matrix, vector), -2, LinearAlgebraConstants.DOUBLE_DELTA);
    }
}
