package designPatterns.creational.singletonCloneSafeSerializationSafe;

import java.io.Serial;
import java.io.Serializable;

public class Logger implements Cloneable, Serializable {

    private static volatile Logger instance;

    private Logger() {
    }

    public void log(String message){
        System.out.println("Message Logged");
    }

    public static Logger getInstance() {
        if(instance == null){
            synchronized (Logger.class){
                if(instance==null){
                    instance= new Logger();
                }
            }
        }
        return instance;
    }

    @Override
    protected   Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }

    protected Object readResolve(){

        return getInstance();
    }


}
