package util;

import constants.LinearAlgebraConstants;
import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilTest {

    @Test
    public void testMultiplyVectorByMatrix() {
        double[][] matrix = new double[][] {{2, 0}, {0, -1}};
        double[] vector = new double[] {3, 2};
        Assert.assertArrayEquals(MatrixUtil.multiplyVectorByMatrix(matrix, vector), new double[] {6, -2},
            LinearAlgebraConstants.DOUBLE_DELTA);
    }

    @Test(expected = AssertionError.class)
    public void testMultiplyVectorByMatrixDimensionsNotEqual() {
        double[][] matrix = new double[][] {{2, 0}, {0, -1}};
        double[] vector = new double[] {3};
        MatrixUtil.multiplyVectorByMatrix(matrix, vector);
    }
}
