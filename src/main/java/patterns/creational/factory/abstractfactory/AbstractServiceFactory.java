package patterns.creational.factory.abstractfactory;

import patterns.creational.factory.abstractfactory.auth.AuthService;
import patterns.creational.factory.abstractfactory.data.DataService;

public abstract class AbstractServiceFactory {
    protected abstract DataService createDataService();

    protected abstract AuthService createAuthService();
}