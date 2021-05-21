package aula2.exec8;

public class MediumPassword extends Password{

    private static String MediumRegex = "[0-9a-zA-Z]{8,20}";

    public MediumPassword(String password) throws Exception{
        super(MediumRegex, password);
    }
}
