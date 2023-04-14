package creational.factory.method;

public class BadData implements Data {
    @Override
    public void evaluate() {
        System.out.println("[Bad Data] I don't feel like processing data right now...");
    }
}
