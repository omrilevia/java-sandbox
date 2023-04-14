package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.data.DataService;

public abstract class AbstractServiceFactory {
    protected abstract DataService createDataService();

    protected abstract AuthService createAuthService();
}