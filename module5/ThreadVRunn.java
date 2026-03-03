class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Class");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Interface");
    }
} 
public class ThreadVRunn {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
    }
}