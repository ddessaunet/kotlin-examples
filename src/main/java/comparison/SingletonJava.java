package comparison;

public final class SingletonJava {

    private static final SingletonJava INSTANCE = new SingletonJava();

    private SingletonJava() {}

    public String property;

    public SingletonJava getInstance() {
        return INSTANCE;
    }
}
