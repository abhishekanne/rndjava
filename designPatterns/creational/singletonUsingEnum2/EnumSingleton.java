package designPatterns.creational.singletonUsingEnum2;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    public String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    // getters and setters
}