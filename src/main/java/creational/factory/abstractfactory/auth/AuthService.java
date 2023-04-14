package creational.factory.abstractfactory.auth;

public abstract class AuthService {
    public Token authenticate() {
        return new Token();
    }

   public abstract AuthService clone();
}
