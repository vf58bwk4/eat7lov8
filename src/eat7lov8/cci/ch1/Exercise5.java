package eat7lov8.cci.ch1;

/**
 * 1.5 Write a method to replace all spaces in a string with ‘%20’.
 */
public class Exercise5 {
    /*
    * Don't destroy input strings
    * */
    static public String version1(String s) {
        String ns = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                ns = ns + "%20";
            } else {
                ns = ns + c;
            }
        }
        return ns;
    }
}
