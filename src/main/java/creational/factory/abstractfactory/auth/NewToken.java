package creational.factory.abstractfactory.auth;

public class NewToken extends Token {
    @Override
    public void validate() {
        System.out.println("New token validated.");
    }
}
