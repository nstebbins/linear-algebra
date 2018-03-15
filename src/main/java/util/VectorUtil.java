package util;

public class VectorUtil {

    /**
     * @param vector first vector
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

}
