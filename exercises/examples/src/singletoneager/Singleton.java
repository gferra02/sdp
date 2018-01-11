package singletoneager;

// Generates Singleton in advance

public class Singleton {

    private static int counter;
    private static Singleton singleton;

    static {
        counter = 0;
        singleton = new Singleton();
    }

    private Singleton() {
        Singleton.counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    @Override
    public String toString() {
        return getClass() + " " + hashCode() + " " + Singleton.counter;
    }
}
