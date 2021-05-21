package aula2.exec8;

public class WeakPassword extends Password{

    private static String WeakRegex = "[a-z]{2,}";

    public WeakPassword(String password) throws Exception{
        super(WeakRegex, password);
    }
}
