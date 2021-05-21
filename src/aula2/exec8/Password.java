package aula2.exec8;

public class Password {

    private String regex;
    private String password;

    public Password(String regex, String password) throws Exception{
        this.regex = regex;
        setPassword(password);
    }

    public void setPassword(String password) throws Exception {
        if (this.validatePassword(password)) {
            this.password = password;
        }
    }

    private boolean validatePassword(String password) throws Exception {
        if (password.matches(this.regex)) {
            return true;
        } else {
            throw new Exception("Senha fora dos padrões");
        }
    }

}
