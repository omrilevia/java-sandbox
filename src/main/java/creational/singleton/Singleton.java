package creational.singleton;

import java.util.concurrent.ConcurrentHashMap;

public class Singleton {
    private static ConcurrentHashMap<String, Singleton> singletonRegistry = new ConcurrentHashMap<>();
    private static DefaultSingleton ds = new DefaultSingleton();
    private static volatile Singleton instance;
    public static void register(String name, Singleton instance) {
        System.out.println("registering " + name);
        singletonRegistry.put(name, instance);
    }

    public static Singleton instance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                String name = System.getProperty("singleton");
                System.out.println(name);
                instance = lookup(name);

                // Can also return subclassed instances if desired
            }
        }

        return instance;
    }

    protected static Singleton lookup(String name) {
        return singletonRegistry.get(name);
    }
}
