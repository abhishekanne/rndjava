package designPatterns.creational.singletonUsingEnum;

public class SingletonEnumMain {


    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(new SampleClass());
        System.out.println(singleton.getValue());

        SingletonEnum singleton2 = SingletonEnum.INSTANCE;
        System.out.println(singleton2.getValue());
    }
}