package patterns.creational.factory.method;

public class GoodData implements Data {
    @Override
    public void evaluate() {
        System.out.println("[Good Data] Processed 12789 records in 33 ms.");
    }
}
