package designPatterns.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        PerffectSingleton instance1= PerffectSingleton.getInstance();
        Constructor<?>[] constructors = PerffectSingleton.class.getDeclaredConstructors();
        PerffectSingleton instance2=null;
        for (Constructor constructor : constructors) {
            // Below code will destroy the singleton
            // pattern
            constructor.setAccessible(true);
             instance2
                    = (PerffectSingleton) constructor.newInstance();
            break;
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
