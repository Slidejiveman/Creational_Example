/**
 * A Factory Singleton used to create Cars.
 * It is an AbstractFactory just like PersonFactory is.
 */
public class CarFactory implements AbstractFactory{
    private static CarFactory ourInstance = new CarFactory();

    public static CarFactory getInstance() {
        return ourInstance;
    }

    private CarFactory() {
    }

    @Override
    public AbstractProduct create(String make, int year) {
        return new Car(make, year);
    }
}
