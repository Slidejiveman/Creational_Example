/**
 * Creates a Person
 */
public class PersonFactory implements AbstractFactory {
    private static PersonFactory ourInstance = new PersonFactory();

    public static PersonFactory getInstance() {
        return ourInstance;
    }

    // This should not be called directly!
    private PersonFactory() {}

    @Override
    public AbstractProduct create(String name, int age) {
        return new Person(name, age);
    }
}
