/**
 * The Main class is a driver for the patterns.
 * It demonstrates that the implemented Creational Design Patterns
 * are working.
 */
public class Main {
    /**
     * Main - entry point of the program
     * @param args - command line arguments (if any)
     */
    public static void main(String args[]) {
        // create a reference to the various Singletons
        // and print out the String that each one makes
        AbstractFactory factory = PersonFactory.getInstance();
        System.out.println("Creating a person:");
        System.out.println(factory.create("Ryder Dale", 27));

        factory = CarFactory.getInstance();
        System.out.println("Creating a car:");
        System.out.println(factory.create("Ford F-150", 2008));
    }

}
