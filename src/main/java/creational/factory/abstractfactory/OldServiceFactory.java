package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.AuthService;
import creational.factory.abstractfactory.auth.OldAuthService;
import creational.factory.abstractfactory.data.DataService;
import creational.factory.abstractfactory.data.OldDataService;

public class OldServiceFactory extends AbstractServiceFactory {
    @Override
    protected DataService createDataService() {
        return new OldDataService();
    }

    @Override
    protected AuthService createAuthService() {
        return new OldAuthService();
    }
}
