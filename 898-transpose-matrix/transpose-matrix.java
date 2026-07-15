class Solution {
    public int[][] transpose(int[][] matrix) {
     
        
        // The transposed matrix will have 'n' rows and 'm' columns
        int[][] transposed = new int[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Flip the elements over the diagonal
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
}