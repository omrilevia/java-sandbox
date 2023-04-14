package creational.factory.method;

public class BadDataCreator extends AbstractDataCreator {

    @Override
    public Data createData() {
        return new BadData();
    }
}
