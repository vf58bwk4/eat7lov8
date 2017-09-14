package eat7lov8.cci.ch1;

/**
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 */
public class Exercise7 {
    public static void version1(int[][] matrix, int n, int m) {
        boolean[] columns = new boolean[m];
        boolean[] rows = new boolean[n];
        for (int cr = 0; cr < n; cr++) {        // current row
            for (int cc = 0; cc < m; cc++) {    // current column
                if (matrix[cr][cc] == 0) {
                    columns[cc] = rows[cr] = true;
                }
            }
        }
        for (int cr = 0; cr < n; cr++) {
            for (int cc = 0; cc < m; cc++) {
                if (rows[cr] || columns[cc]) {
                    matrix[cr][cc] = 0;
                }
            }
        }
    }
}
