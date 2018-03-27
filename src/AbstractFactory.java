/**
 * All factories create things based on their
 * implementation of this interface.
 */
public interface AbstractFactory {
    // This is an example of a Factory Method
    // Abstract Factory depends on this method
    // and the AbstractProduct type to work.
    public AbstractProduct create(String s, int num);
}
