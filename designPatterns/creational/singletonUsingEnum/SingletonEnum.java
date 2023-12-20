package designPatterns.creational.singletonUsingEnum;

public enum SingletonEnum {
    INSTANCE;

    SampleClass value;

    public SampleClass getValue() {
        return value;
    }

    public void setValue(SampleClass value) {
        this.value = value;
    }
}