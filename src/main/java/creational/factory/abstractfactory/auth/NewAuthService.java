package creational.factory.abstractfactory.auth;

public class NewAuthService extends AuthService {
    public NewAuthService() {

    }

    @Override
    public Token authenticate() {
        System.out.println("New auth service authenticating...");
        return new NewToken();
    }

    @Override
    public AuthService clone() {
        return new NewAuthService();
    }
}
