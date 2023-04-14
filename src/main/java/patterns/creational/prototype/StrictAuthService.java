package patterns.creational.prototype;

import patterns.creational.factory.abstractfactory.auth.AuthService;
import patterns.creational.factory.abstractfactory.auth.Token;

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
