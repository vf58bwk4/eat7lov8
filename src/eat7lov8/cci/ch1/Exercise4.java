package eat7lov8.cci.ch1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    1.4 Write a method to decide if two strings are anagrams or not.
*/
public class Exercise4 {
    /*
    * Don't destroy input strings
    * */
    static public boolean version1(String s1, String s2) {
        char[] ca1 = s1.toLowerCase().toCharArray();
        char[] ca2 = s2.toLowerCase().toCharArray();

        Arrays.sort(ca1);
        Arrays.sort(ca2);

        return Arrays.equals( ca1, ca2 );
    }
}
