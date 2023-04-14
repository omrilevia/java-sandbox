package creational.prototype;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.auth.Token;

public class StrictAuthService extends AuthService {
    @Override
    public Token authenticate() {
        System.out.println("Access denied!");
        return new Token();
    }
    @Override
    public AuthService clone() {
        return new StrictAuthService();
    }
}
