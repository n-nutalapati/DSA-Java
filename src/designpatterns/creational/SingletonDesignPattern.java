package designpatterns.creational;


/*
Its a creational design pattern that ensures a class has only one instance and provides a global point of access to it.
* Singleton Design Pattern can be implemented in multiple ways:
* 1. Lazy Initialization
* 2. Eager Initialization
* 3. Thread Safe Singleton
* 4. Double-Checked Locking Singleton
* 5. Bill Pugh Singleton Implementation
*
* Serialization can break singleton pattern. To prevent this, implement readResolve() method.
* Reflection can also break singleton pattern. To prevent this, throw exception from constructor if instance already exists.
*
* */
public class SingletonDesignPattern {
    // creational design pattern -lazy initialization
    private static SingletonDesignPattern INSTANCE;
    // private constructor to prevent instantiation
    private SingletonDesignPattern(){}
    // Standard way of implementing singleton pattern
    public static SingletonDesignPattern getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDesignPattern();
        }
        return INSTANCE;
    }
}

class EagerSingletonInitialization {
    // creational design pattern - eager initialization
    private static final EagerSingletonInitialization INSTANCE = new EagerSingletonInitialization();
    // private constructor to prevent instantiation
    private EagerSingletonInitialization(){}
    // Standard way of implementing singleton pattern
    public static EagerSingletonInitialization getInstance() {
        return INSTANCE;
    }
}

class ThreadSafeSingleton {
    // creational design pattern - thread safe singleton
    private static ThreadSafeSingleton INSTANCE;
    // private constructor to prevent instantiation
    private ThreadSafeSingleton(){}
    // Standard way of implementing singleton pattern
    public static synchronized  ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}

class DoubleCheckedLockingSingleton {
    // creational design pattern - double checked locking singleton
    private static volatile DoubleCheckedLockingSingleton INSTANCE;
    // private constructor to prevent instantiation
    private DoubleCheckedLockingSingleton(){}
    // Standard way of implementing singleton pattern
    public static DoubleCheckedLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}

class BillPughSingleton {
    // creational design pattern - Bill Pugh singleton
    private BillPughSingleton(){}
    // static inner helper class
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    // Standard way of implementing singleton pattern
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


// Reflection and Serialization safe implementation
// Using Enum to implement Singleton
// Enum inherently provides serialization mechanism and guarantees single instance
enum SafeSingleton {
    INSTANCE;
    public void someMethod() {
        // method implementation
    }
}

