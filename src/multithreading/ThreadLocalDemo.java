package multithreading;

public class ThreadLocalDemo {
    public static void main(String[] args) {

        ThreadLocal<Long> threadLocal = new ThreadLocal<>();

        Long userId = 1235456L;
        Long userId2 = 9876543L;

        Thread requestThread = new Thread(() -> {
            System.out.println("Started thread for userId: " + userId);
            threadLocal.set(userId);
            System.out.println("Completed processing for userId: " + threadLocal.get());
            threadLocal.remove();
            System.out.println("removed userId from threadLocal: " + threadLocal.get());
        });

        Thread requestThread2 = new Thread(() -> {
            System.out.println("Started thread for userId: " + userId2);
            threadLocal.set(userId2);
            System.out.println("Completed processing for userId: " + threadLocal.get());
            threadLocal.remove();
            System.out.println("removed userId from threadLocal: " + threadLocal.get());
        });

        requestThread2.start();
        requestThread.start();

        InheritableThreadLocal<String> threadLocal2 = new InheritableThreadLocal<>();

        Thread parentThread = new Thread(() -> {
            threadLocal2.set("Parent Thread Value");
            System.out.println("Parent Thread: " + threadLocal2.get());

            Thread childThread = new Thread(() -> {
                System.out.println("Child Thread: " + threadLocal2.get());
            });

            childThread.start();
            try {
                childThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
