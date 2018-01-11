package singletonlazy;

public class Main {

    public static void main(String[] args) {
        final int LIMIT = 10; // Constant
        System.out.println(Singleton.getCounter());

        for (int x = 0; x < LIMIT; x++) {
            System.out.println(Singleton.getInstance());
        }
    }
}
