package rayleighquotient;

import util.MatrixUtil;
import util.VectorUtil;

public class RayleighQuotient {

    /**
     * @param matrix      matrix
     * @param eigenvector eigenvector of matrix
     * @return corresponding eigenvalue of the eigenvector
     */
    public static double rayleighQuotient(double[][] matrix, double[] eigenvector) {
        return VectorUtil.dotProduct(MatrixUtil.multiplyVectorByMatrix(matrix, eigenvector), eigenvector) / VectorUtil
            .dotProduct(eigenvector, eigenvector);
    }

}
