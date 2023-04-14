package creational.factory.abstractfactory.data;

import creational.factory.abstractfactory.data.DataService;

public class NewDataService extends DataService {

    @Override
    public Data getData() {
        System.out.println("New data service getting data...");
        return new NewData();
    }
}
