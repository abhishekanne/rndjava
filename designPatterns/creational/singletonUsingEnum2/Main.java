package designPatterns.creational.singletonUsingEnum2;

public class Main {
    public static void main(String[] args) {

        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println("Here"+instance.info);

    }
}
