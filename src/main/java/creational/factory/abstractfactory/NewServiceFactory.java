package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.auth.NewAuthService;
import creational.factory.abstractfactory.data.DataService;
import creational.factory.abstractfactory.data.NewDataService;

public class NewServiceFactory extends AbstractServiceFactory {
    @Override
    DataService createDataService() {
        return new NewDataService();
    }

    @Override
    AuthService createAuthService() {
        return new NewAuthService();
    }
}
