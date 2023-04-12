package demo;

import creational.builder.BuilderTest;
import creational.singleton.DefaultSingleton;
import creational.singleton.SingletonTest;

public class Main {
    public static void main(String[] args) {
        /*BuilderTest bt = new BuilderTest();
        bt.testBuilders();*/

        SingletonTest st = new SingletonTest();
        st.testSingleton();
    }
}