package utils.Builders;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.concurrent.ThreadLocalRandom;

@AllArgsConstructor
@Builder
public class MatrixBuilder {
    private final int rows;
    private final int columns;

    public double[][] buildRandomlyGeneratedMatrixOfDoubles(double lowerBound, double upperBound) {
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextDouble(lowerBound, upperBound);
            }
        }
        return matrix;
    }

    public int[][] buildRandomlyGeneratedMatrixOfIntegers(int lowerBound, int upperBound) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(lowerBound, upperBound);
            }
        }
        return matrix;
    }

    public int[][] buildRandomlyGeneratedMatrixOfIntegers() {
        return buildRandomlyGeneratedMatrixOfIntegers(-10, 10);
    }

    public double[][] buildRandomlyGeneratedMatrixOfDoubles() {
        return buildRandomlyGeneratedMatrixOfDoubles(-10, 10);
    }



}


