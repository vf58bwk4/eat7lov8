package eat7lov8.cci.ch1;

/*
   1.1 Implement an algorithm to determine if a string has all unique characters.
   What if you can not use additional data structures?
*/
public class Exercise1 {
    /*
    * Don't use additional data structures, but O(N2)
    * */
    public static boolean version1(String s) {
        if (s.length() < 1) return true; // or throw some exception ?

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt( i ) == s.charAt( j )) {
                    return false;
                }
            }
        }
        return true;
    }
}
