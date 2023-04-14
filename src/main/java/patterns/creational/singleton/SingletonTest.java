package patterns.creational.singleton;

public class SingletonTest {
    public void testSingleton() {
        System.setProperty("singleton", "DefaultSingleton");
        DefaultSingleton s = (DefaultSingleton) Singleton.instance();

        s.operation();
    }
}
