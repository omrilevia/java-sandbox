package patterns.behavioral.observer;

import java.util.concurrent.CompletableFuture;

public interface Observer {
    CompletableFuture<Boolean> update();
    String name();
}
