package patterns.behavioral.observer;

import java.util.concurrent.CompletableFuture;

public class DataWatcher implements Observer {
    @Override
    public CompletableFuture<Boolean> update() {
        CompletableFuture<Boolean> returnValue = new CompletableFuture<>();

        // do something...

        returnValue.complete(true);

        return returnValue;
    }

    @Override
    public String name() {
        return this.toString();
    }
}
