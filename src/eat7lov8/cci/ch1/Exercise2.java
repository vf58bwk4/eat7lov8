package eat7lov8.cci.ch1;

/*
   1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters,
   including the null character.)
*/
public class Exercise2 {
    public static int strlen(char[] cs) {
        int i = 0;
        while (cs[i] != 0) {
            ++i;
        }
        return i;
    }

    /*
    * Don't destroy input string
    * */
    public static char[] version1(char[] cs) {
        int l = strlen( cs );
        char[] rcs = new char[l + 1];

        rcs[l] = 0;
        int i = 0, j = l - 1;
        while (i < l) {
            rcs[i++] = cs[j--];
        }
        return rcs;
    }
}
