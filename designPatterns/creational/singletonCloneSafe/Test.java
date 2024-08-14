package designPatterns.creational.singletonCloneSafe;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Logger logger = Logger.getInstance();
        logger.log("Test");
        Logger clone= (Logger) logger.clone();
    }
}
