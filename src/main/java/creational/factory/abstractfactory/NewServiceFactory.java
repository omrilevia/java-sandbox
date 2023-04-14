package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.auth.NewAuthService;
import creational.factory.abstractfactory.data.DataService;
import creational.factory.abstractfactory.data.NewDataService;

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
