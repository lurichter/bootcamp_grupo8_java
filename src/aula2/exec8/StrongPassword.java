package aula2.exec8;

public class StrongPassword extends Password{

    private static String StrongRegex = "[0-9a-zA-Z!@#&]{8,20}";

    public StrongPassword(String password) throws Exception {
        super(StrongRegex, password);
    }
}
