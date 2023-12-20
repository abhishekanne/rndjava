package FunctionalInterface;

import java.util.logging.Level;
import java.util.logging.Logger;

@FunctionalInterface
public interface ParentInterface {
    static Logger  logger = Logger.getLogger(ParentInterface.class.getName());

    public void  onlyOneAbstractMethodAllowed();

    public default void defaultMethod(){
        logger.log(Level.INFO,"Functional Interface Introduced in Java 8");
        logger.log(Level.INFO,"Functional Interface can have ONLY 1 abstract method");
        logger.log(Level.INFO,"Default Method : A method in the interface that has a predefined body is known as the default method. It uses the keyword default. default methods were introduced in Java 8 to have 'Backward Compatibility in case JDK modifies any interfaces. In case a new abstract method is added to the interface, all classes implementing the interface will break and will have to implement the new method. With default methods, there will not be any impact on the interface implementing classes. default methods can be overridden if needed in the implementation. Also, it does not qualify as synchronized or final.");
    }

    public static void staticMethod(){
        logger.log(Level.INFO,"Static Method in Interface can be called using Interface name");

    }
}

