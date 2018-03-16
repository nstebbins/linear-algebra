package util;

public class MatrixUtil {

    /**
     * @param matrix matrix
     * @param vector vector
     * @return matrix * vector
     */
    public static double[] multiplyVectorByMatrix(double[][] matrix, double[] vector) {
        assert matrix[0].length == vector.length;
        double[] product = new double[vector.length];
        for (int row = 0; row < matrix.length; row++) {
            product[row] = VectorUtil.dotProduct(matrix[row], vector);
        }
        return product;
    }
}
