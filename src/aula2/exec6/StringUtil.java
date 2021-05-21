package aula2.exec6;

public class StringUtil {
    public static String rpad(String s, String c, int n ) {
        return String.format("%1$-" + n + "s", s ).replace(" ", c);
    }

    public static String lpad(String s, String c, int n) {
        return String.format("%1$" + n + "s", s).replace(" ", c);
    }

    public static String ltrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN(String s, String c, int n) {
        int pos = s.indexOf(c);
        while (--n > 0 && pos != -1)
            pos = s.indexOf(c, pos + 1);
        return pos;
    }
}
