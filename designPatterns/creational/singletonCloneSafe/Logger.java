package designPatterns.creational.singletonCloneSafe;

public class Logger implements Cloneable{

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
    public  Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }


}
