package util;

public class VectorUtil {

    /**
     * @param vector  first vector
     * @param vector2 second vector
     * @return computes the dot product of the two vectors
     */
    // TODO: ensure vectors are the same length
    public static double dotProduct(double[] vector, double[] vector2) {
        double dotProduct = 0;
        for (int i = 0; i < vector.length; i++) {
            dotProduct += vector[i] * vector2[i];
        }
        return dotProduct;
    }

    /**
     * @param vector vector
     * @return l2 norm of vector
     */
    public static double l2Norm(double[] vector) {
        double l2Norm = 0;
        for (double value : vector) {
            l2Norm += Math.pow(value, 2);
        }
        return Math.sqrt(l2Norm);
    }

    /**
     * @param vector vector
     * @param scalar scalar
     * @return scalar * vector
     */
    public static double[] multiplyVectorByScalar(double[] vector, double scalar) {
        double[] product = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            product[i] = scalar * vector[i];
        }
        return product;
    }

}
