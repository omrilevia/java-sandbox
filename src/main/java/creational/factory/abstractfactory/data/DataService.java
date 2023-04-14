package creational.factory.abstractfactory.data;

public abstract class DataService {
    public Data getData() {
        return new Data();
    }

    public abstract DataService clone();
}
