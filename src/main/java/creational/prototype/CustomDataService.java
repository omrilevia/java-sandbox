package creational.prototype;

import creational.factory.abstractfactory.data.Data;
import creational.factory.abstractfactory.data.DataService;

public class CustomDataService extends DataService {
    @Override
    public Data getData() {
        System.out.println("Retrieving custom data...");
        return new Data();
    }

    @Override
    public DataService clone() {
        return new CustomDataService();
    }
}
