package patterns.creational.factory.abstractfactory.auth;

public class OldToken extends Token {
    @Override
    public void validate() {
        System.out.println("Old token validated.");
    }
}
