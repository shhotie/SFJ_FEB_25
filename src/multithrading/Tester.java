package multithrading;

public class Tester {
    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//        thread1.start();
//        thread2.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.start();
        t2.start();

    }
}
