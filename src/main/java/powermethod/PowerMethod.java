package powermethod;

import constants.LinearAlgebraConstants;
import util.MatrixUtil;
import util.VectorUtil;

public class PowerMethod {

    /**
     * @param matrix matrix
     * @param vector vector
     * @return approximation of dominant eigenvector
     */
    public static double[] powerMethod(double[][] matrix, double[] vector) {
        double[] product = vector;
        for (int i = 0; i < LinearAlgebraConstants.POWER_METHOD_NUM_SIMULATIONS; i++) {
            // new approximation
            product = MatrixUtil.multiplyVectorByMatrix(matrix, product);
            // normalized approximation
            double l2Norm = VectorUtil.l2Norm(product);
            product = VectorUtil.multiplyVectorByScalar(product, 1 / l2Norm);
        }
        return product;
    }
}
