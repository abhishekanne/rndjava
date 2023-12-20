package FunctionalInterface;

public class ImplementingClass implements ParentInterface{


    @Override
    public void onlyOneAbstractMethodAllowed() {
        this.defaultMethod();
    }
}
