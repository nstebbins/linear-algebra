package util;

public class MatrixUtil {

    // TODO: dimension checks

    /**
     * @param matrix matrix
     * @param vector vector
     * @return matrix * vector
     */
    public static double[] multiplyVectorByMatrix(double[][] matrix, double[] vector) {
        double[] product = new double[vector.length];
        for (int row = 0; row < matrix.length; row++) {
            product[row] = VectorUtil.dotProduct(matrix[row], vector);
        }
        return product;
    }
}
