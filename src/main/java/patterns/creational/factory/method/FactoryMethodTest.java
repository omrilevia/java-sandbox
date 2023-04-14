package patterns.creational.factory.method;

public class FactoryMethodTest {
    public void testFactoryMethods() {
        new GoodDataCreator().createData().evaluate();
        new BadDataCreator().createData().evaluate();
    }
}
