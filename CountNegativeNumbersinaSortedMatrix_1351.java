public class CountNegativeNumbersinaSortedMatrix_1351 {
    public int countNegatives(int[][] matrix) {

        int cneg = 0;
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Traverse through the 2D matrix using nested for loops
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // Access the elements of the matrix using indices i and j
                if (matrix[i][j] < 0) {
                    cneg += 1;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        return cneg;
    }
}
