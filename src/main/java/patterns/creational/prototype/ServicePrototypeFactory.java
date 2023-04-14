package patterns.creational.prototype;

import patterns.creational.factory.abstractfactory.AbstractServiceFactory;
import patterns.creational.factory.abstractfactory.auth.AuthService;
import patterns.creational.factory.abstractfactory.data.DataService;

public class ServicePrototypeFactory extends AbstractServiceFactory {
    DataService dataServicePrototype;
    AuthService authServicePrototype;
    
    public ServicePrototypeFactory(AuthService as, DataService ds) {
        this.dataServicePrototype = ds;
        this.authServicePrototype = as;
    }
    @Override
    protected DataService createDataService() {
        return dataServicePrototype.clone();
    }

    @Override
    protected AuthService createAuthService() {
        return authServicePrototype.clone();
    }
}
