package aula2.exec7;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtil.rpad("oi", "i", 4));

        System.out.println(StringUtil.lpad("ata", "a", 10));

        System.out.println(StringUtil.ltrim("     a"));

        System.out.println(StringUtil.rtrim("a      "));

        System.out.println(StringUtil.trim("  ata  "));

        System.out.println(StringUtil.indexOfN("John|Paul|George|Ringo", "|", 2));
    }
}
