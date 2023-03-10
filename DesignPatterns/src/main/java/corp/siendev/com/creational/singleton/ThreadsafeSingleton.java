package corp.siendev.com.creational.singleton;

public final class ThreadsafeSingleton {
    private static volatile ThreadsafeSingleton instance = null;

    private ThreadsafeSingleton() {}

    public static ThreadsafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadsafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadsafeSingleton();
                }
            }
        }
        return instance;
    }
}
