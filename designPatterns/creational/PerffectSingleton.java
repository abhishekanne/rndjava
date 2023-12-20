package designPatterns.creational;

import java.io.Serializable;

public class PerffectSingleton implements Serializable {
    private static final long serialVersionUID = 3119105548371608200L;
    // Instatiating at the time of class loading will be thead safe instead of using sych block
    private static final PerffectSingleton singleton = new PerffectSingleton();
    private PerffectSingleton() { }
    public static PerffectSingleton getInstance(){
        throw new InstantiationError( "Creating of this object is not allowed." );
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed");
    }
    protected Object readResolve() {
        return singleton;
    }
    //-----> This is my implementation to stop it but Its not working. :(
    public Object newInstance() throws InstantiationException {
        throw new InstantiationError( "Creating of this object is not allowed." );
    }
}