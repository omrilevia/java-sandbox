package creational.factory.abstractfactory.auth;

public class OldAuthService extends AuthService {
    @Override
    public Token authenticate() {
        System.out.println("Old auth service authenticating...");
        return new OldToken();
    }

    @Override
    public AuthService clone() {
        return new OldAuthService();
    }
}
