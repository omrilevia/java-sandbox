package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.data.DataService;

public abstract class AbstractServiceFactory {
    abstract DataService createDataService();

    abstract AuthService createAuthService();
}