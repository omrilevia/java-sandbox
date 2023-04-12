package creational.singleton;

public class DefaultSingleton extends Singleton {
    protected DefaultSingleton() {
        register("DefaultSingleton", this);
    }

    public void operation() {
        System.out.println("Hello from the default singleton!");
    }
}
