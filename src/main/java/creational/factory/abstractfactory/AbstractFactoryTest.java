package creational.factory.abstractfactory;

import creational.factory.abstractfactory.auth.Token;
import creational.factory.abstractfactory.data.Data;

public class AbstractFactoryTest {
    public Data createData(AbstractServiceFactory asf) {
        return asf.createDataService().getData();
    }

    public Token getToken(AbstractServiceFactory asf) {
        return asf.createAuthService().authenticate();
    }
}
