package eat7lov8.cci.ch1;

/*
    Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
    NOTE: One or two additional variables are fine. An extra copy of the array is not.
    FOLLOW UP
    Write the test cases for this method.
*/
public class Exercise3 {
    /*
    * Don't destroy input string. Don't use additional memory. O(N2)
    * */
    public static String version1(String s) {
        char[] ca = s.toCharArray();
        int w = 0;
        for (int i = 0; i < ca.length; i++) {
            boolean f = false;
            for (int j = w - 1; j >= 0; j--) {
                if (ca[i] == ca[j]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                ca[w++] = ca[i];
            }
        }
        return new String( ca, 0, w );
    }
}
