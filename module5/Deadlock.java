public class Deadlock {
    public static void main(String[] args) {
        String lockA = "A";
        String lockB = "B";
        new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread 1: Holding A...");
                try { 
                    Thread.sleep(50); 
                } catch (Exception e) {}
                synchronized (lockB) { 
                    System.out.println("Thread 1: Got B");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread 2: Holding B...");
                try { 
                    Thread.sleep(50); 
                } catch (Exception e) {}
                synchronized (lockA) { 
                    System.out.println("Thread 2: Got A");
                }
            }
        }).start();
    }
}