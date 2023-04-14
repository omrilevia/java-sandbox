package creational.factory.abstractfactory.data;

import creational.factory.abstractfactory.data.DataService;

public class OldDataService extends DataService {
    @Override
    public Data getData() {
        System.out.println("Old data service retrieving data...");
        return new OldData();
    }

    @Override
    public DataService clone() {
        return new OldDataService();
    }
}
