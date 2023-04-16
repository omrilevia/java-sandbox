package patterns.behavioral.observer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataSource implements Subject {
    private int value = 2;
    Map<String, Observer> observers = new ConcurrentHashMap<>();

    @Override
    public void attach(Observer observer) {
        observers.put(observer.name(), observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer.name());
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers.values()) {
            o.update().whenComplete((bool, throwable) -> {
                if (throwable != null) {
                    System.out.println("Bad stuff happened.");
                    return;
                }

                System.out.println("Observer updated: " + bool);
            });
        }
    }

    public void updateValue() {
        value++;

        notifyObservers();
    }
}
