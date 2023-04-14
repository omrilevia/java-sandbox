package patterns.creational.factory.abstractfactory;

import patterns.creational.factory.abstractfactory.auth.AuthService;
import patterns.creational.factory.abstractfactory.auth.OldAuthService;
import patterns.creational.factory.abstractfactory.data.DataService;
import patterns.creational.factory.abstractfactory.data.OldDataService;

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
