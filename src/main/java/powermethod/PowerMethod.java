package powermethod;

import constants.LinearAlgebraConstants;
import util.MatrixUtil;

public class PowerMethod {

    public static double[] powerMethod(double[][] matrix, double[] vector){
        // TODO: fill this in (e.g. not normalized)
        double[] product = vector;
        for (int i = 0; i < LinearAlgebraConstants.POWER_METHOD_NUM_SIMULATIONS; i++) {
            product = MatrixUtil.multiplyVectorByMatrix(matrix, product);
        }
        return product;
    }
}
