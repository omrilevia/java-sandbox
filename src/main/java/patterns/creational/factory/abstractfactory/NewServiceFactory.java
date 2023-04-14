package patterns.creational.factory.abstractfactory;

import patterns.creational.factory.abstractfactory.auth.AuthService;
import patterns.creational.factory.abstractfactory.auth.NewAuthService;
import patterns.creational.factory.abstractfactory.data.DataService;
import patterns.creational.factory.abstractfactory.data.NewDataService;

public class NewServiceFactory extends AbstractServiceFactory {
    @Override
    protected DataService createDataService() {
        return new NewDataService();
    }

    @Override
    protected AuthService createAuthService() {
        return new NewAuthService();
    }
}
