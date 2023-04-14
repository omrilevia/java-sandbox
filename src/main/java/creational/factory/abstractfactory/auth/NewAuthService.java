package creational.factory.abstractfactory.auth;

public class NewAuthService extends AuthService {
    @Override
    public Token authenticate() {
        System.out.println("New auth service authenticating...");
        return new NewToken();
    }
}
