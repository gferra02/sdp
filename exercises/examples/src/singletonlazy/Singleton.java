package singletonlazy;

// Lazy: generates only when needed

public class Singleton {

    private static int counter;
    private static Singleton singleton;

    static {
        counter = 0;
        singleton = null;
    }

    private Singleton() {
        Singleton.counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    @Override
    public String toString() {
        return getClass() + " " + hashCode() + " " + Singleton.counter;
    }
}
