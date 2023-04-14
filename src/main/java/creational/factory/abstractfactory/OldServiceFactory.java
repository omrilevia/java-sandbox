package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.auth.OldAuthService;
import creational.factory.abstractfactory.data.DataService;
import creational.factory.abstractfactory.data.OldDataService;

public class OldServiceFactory extends AbstractServiceFactory {
    @Override
    DataService createDataService() {
        return new OldDataService();
    }

    @Override
    AuthService createAuthService() {
        return new OldAuthService();
    }
}
