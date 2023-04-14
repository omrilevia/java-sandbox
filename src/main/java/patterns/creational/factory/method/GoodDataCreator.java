package patterns.creational.factory.method;

public class GoodDataCreator extends AbstractDataCreator {
    @Override
    public Data createData() {
        return new GoodData();
    }
}
