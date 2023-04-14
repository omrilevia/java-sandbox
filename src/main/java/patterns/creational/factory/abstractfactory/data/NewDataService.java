package patterns.creational.factory.abstractfactory.data;

public class NewDataService extends DataService {

    @Override
    public Data getData() {
        System.out.println("New data service getting data...");
        return new NewData();
    }

    @Override
    public DataService clone() {
        return new NewDataService();
    }
}
