package demo;

import creational.builder.BuilderTest;
import creational.factory.abstractfactory.AbstractFactoryTest;
import creational.factory.abstractfactory.AbstractServiceFactory;
import creational.factory.abstractfactory.NewServiceFactory;
import creational.factory.abstractfactory.OldServiceFactory;
import creational.factory.method.FactoryMethodTest;
import creational.prototype.CustomDataService;
import creational.prototype.ServicePrototypeFactory;
import creational.prototype.StrictAuthService;
import creational.singleton.DefaultSingleton;
import creational.singleton.SingletonTest;

public class Main {
    public static void main(String[] args) {
        // Builder
        /*BuilderTest bt = new BuilderTest();
        bt.testBuilders();*/

        // Singleton
        /*SingletonTest st = new SingletonTest();
        st.testSingleton();*/

        // Factory method
        /*FactoryMethodTest fmt = new FactoryMethodTest();
        fmt.testFactoryMethods();*/

        // Abstract Factory
        /*AbstractFactoryTest aft = new AbstractFactoryTest();
        aft.createData(new NewServiceFactory()).evaluate();
        aft.getToken(new NewServiceFactory()).validate();

        aft.createData(new OldServiceFactory()).evaluate();
        aft.getToken(new OldServiceFactory()).validate();*/

        // Prototype
        /*ServicePrototypeFactory spf = new ServicePrototypeFactory(new StrictAuthService(), new CustomDataService());
        new AbstractFactoryTest().createData(spf);
        new AbstractFactoryTest().getToken(spf);*/
    }
}