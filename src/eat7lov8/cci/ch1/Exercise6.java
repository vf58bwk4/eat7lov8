package eat7lov8.cci.ch1;

/**
 * 1.6 Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate
 * the image by 90 degrees. Can you do this in place?
 */
public class Exercise6 {
    public static void version1(int[][] matrix, int n) {
        int li = n - 1;                         // last index
        for (int cr = 0; cr < n / 2; cr++) {    // current row
            int lc = li - cr;                   // last column (in current row)
            for (int cc = cr; cc < lc; cc++) {  // current column
                int rc = li - cc;               // ~rotated column
                // rotate clockwise
                int s = matrix[cr][cc];
                matrix[cr][cc] = matrix[rc][cr];
                matrix[rc][cr] = matrix[lc][rc];
                matrix[lc][rc] = matrix[cc][lc];
                matrix[cc][lc] = s;
            }
        }
    }
}
