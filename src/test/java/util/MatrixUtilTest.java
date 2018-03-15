package util;

import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilTest {

    // TODO: make delta a constant? (used in multiple places)
    @Test
    public void testMultiplyVectorByMatrix() {
        double[][] matrix = new double[][]{{2, 0}, {0, -1}};
        double[] vector = new double[]{3, 2};
        Assert.assertArrayEquals(MatrixUtil.multiplyVectorByMatrix(matrix, vector), new double[]{6, -2}, 0.01);
    }
}
