package designPatterns.creational.singletonCloneSafeSerializationSafe;

import javax.sound.midi.Soundbank;
import java.io.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Logger logger = Logger.getInstance();
        logger.log("Test");
        try {
            Logger clone = (Logger) logger.clone();
        }
        catch (CloneNotSupportedException cns){
            cns.printStackTrace();
        }

        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream( new File("./Logger.ser")));
        objectOutputStream.writeObject(logger);
        objectOutputStream.close();

        ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(new File("./Logger.ser")));
        Logger logger2= (Logger) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Hashcode logger="+ logger.hashCode());
        System.out.println("Hashcode logger2="+ logger2.hashCode());
        System.out.println(logger==logger2);

    }
}
